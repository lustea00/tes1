package com.example.awkow2x.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class ReportActivity extends AppCompatActivity {

    double resultPercent;
    private String id;
    private TextView hasil;
    private String tes;
    private String analisa;
    private String JSON_STRING;
    private String gejalaData;
    private String gejala[][] = new String[16][10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        hasil = (TextView) findViewById(R.id.hasil);

        setTitle("Hasil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = (Button) findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        GetGejala();
    }

    private void GetGejala(){
        class GetGejala extends AsyncTask<Void, Void, String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ReportActivity.this,"Loading","Memuat Data",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                JSON_STRING = s;
                ShowGejala();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(Config.URL_GEJALA);
                return s;
            }
        }
        GetGejala gj = new GetGejala();
        gj.execute();
    }

    private void ShowGejala() {
        JSONObject jsonObject = null;

        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY);

            for (int i = 0; i<result.length(); i++){
                JSONObject jo = result.getJSONObject(i);

                gejala[i][0] = jo.getString(Config.TAG_KODE);
                gejala[i][1] = jo.getString(Config.TAG_GEJALA);
                gejala[i][2] = jo.getString(Config.TAG_RANGE);
                gejala[i][3] = jo.getString(Config.TAG_BOBOT);
                gejala[i][4] = jo.getString(Config.TAG_INT_MIN);
                gejala[i][5] = jo.getString(Config.TAG_INT_MAX);
                gejala[i][6] = jo.getString(Config.TAG_NIL_MID);
                gejala[i][7] = jo.getString(Config.TAG_F_MIN);
                gejala[i][8] = jo.getString(Config.TAG_F_MAX);
                gejala[i][9] = jo.getString(Config.TAG_F_HASIL);
            }
            CountProc();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void CountProc() {
        boolean found = false;
        double top = 0;
        double bottom = 0;
        String searchQuery = "";

        Intent intent = getIntent();
        boolean[] value = intent.getBooleanArrayExtra("value");

        for (int i = 0; i < value.length; i++) {
            if (value[i] == true) {
                top += (Double.parseDouble(gejala[i][9]) *  Double.parseDouble(gejala[i][3]));
                bottom += Double.parseDouble(gejala[i][9]);
                searchQuery += i + "-";
            }
        }

        id = searchQuery;

        GetAturan();

        resultPercent = ((top / bottom) * 100);
        analisa = String.format("%.2f", resultPercent) + "%";
    }

    private void GetAturan(){
        class GetAturan extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ReportActivity.this,"Loading","Memuat Data...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                ShowAturan(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(Config.URL_ATURAN,id);
                return s;
            }
        }
        GetAturan ga = new GetAturan();
        ga.execute();
    }

    private void ShowAturan(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            String penyakit = c.getString(Config.TAG_PENYAKIT);

            if (penyakit == "null") {
                hasil.setText("Penyakit tidak diketahui");
            }
            else {
                hasil.setText(penyakit + " " + analisa);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
