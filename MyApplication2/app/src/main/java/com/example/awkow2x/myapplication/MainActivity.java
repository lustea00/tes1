package com.example.awkow2x.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.app.Activity;
import android.widget.CheckBox;

import static com.example.awkow2x.myapplication.Data.gejalaString;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button next = (Button) findViewById(R.id.button5);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //ShowResult();
                Intent myIntent = new Intent(view.getContext(), ReportActivity.class);
                myIntent.putExtra("value", ShowResult());
                startActivityForResult(myIntent, 0);
            }
        });

        //next.setText(Data.gejalaString[0][1]);
    }

    public String ShowResultTes() {
        String value = "";

        CheckBox g1 = (CheckBox) findViewById(R.id.G1);
        CheckBox g2 = (CheckBox) findViewById(R.id.G2);
        CheckBox g3 = (CheckBox) findViewById(R.id.G3);
        CheckBox g4 = (CheckBox) findViewById(R.id.G4);
        CheckBox g5 = (CheckBox) findViewById(R.id.G5);
        CheckBox g6 = (CheckBox) findViewById(R.id.G6);
        CheckBox g7 = (CheckBox) findViewById(R.id.G7);
        CheckBox g8 = (CheckBox) findViewById(R.id.G8);
        CheckBox g9 = (CheckBox) findViewById(R.id.G9);
        CheckBox g10 = (CheckBox) findViewById(R.id.G10);
        CheckBox g11 = (CheckBox) findViewById(R.id.G11);
        CheckBox g12 = (CheckBox) findViewById(R.id.G12);
        CheckBox g13 = (CheckBox) findViewById(R.id.G13);
        CheckBox g14 = (CheckBox) findViewById(R.id.G14);
        CheckBox g15 = (CheckBox) findViewById(R.id.G15);
        CheckBox g16 = (CheckBox) findViewById(R.id.G16);

        if (g1.isChecked())
            value += "0-";
        if (g2.isChecked())
            value += "1-";
        if (g3.isChecked())
            value += "2-";
        if (g4.isChecked())
            value += "3-";
        if (g5.isChecked())
            value += "4-";
        if (g6.isChecked())
            value += "5-";
        if (g7.isChecked())
            value += "6-";
        if (g8.isChecked())
            value += "7-";
        if (g9.isChecked())
            value += "8-";
        if (g10.isChecked())
            value += "9-";
        if (g11.isChecked())
            value += "10-";
        if (g12.isChecked())
            value += "10-";
        if (g13.isChecked())
            value += "12-";
        if (g14.isChecked())
            value += "13-";
        if (g15.isChecked())
            value += "14-";
        if (g16.isChecked())
            value += "15-";

        return value;

        /*Intent i = new Intent(this, ReportActivity.class);
        i.putExtra("value", value);
        startActivity(i);*/
    }

    public boolean[] ShowResult() {
        boolean[] value = new boolean[16];
        //int count = 0;

        CheckBox g1 = (CheckBox) findViewById(R.id.G1);
        CheckBox g2 = (CheckBox) findViewById(R.id.G2);
        CheckBox g3 = (CheckBox) findViewById(R.id.G3);
        CheckBox g4 = (CheckBox) findViewById(R.id.G4);
        CheckBox g5 = (CheckBox) findViewById(R.id.G5);
        CheckBox g6 = (CheckBox) findViewById(R.id.G6);
        CheckBox g7 = (CheckBox) findViewById(R.id.G7);
        CheckBox g8 = (CheckBox) findViewById(R.id.G8);
        CheckBox g9 = (CheckBox) findViewById(R.id.G9);
        CheckBox g10 = (CheckBox) findViewById(R.id.G10);
        CheckBox g11 = (CheckBox) findViewById(R.id.G11);
        CheckBox g12 = (CheckBox) findViewById(R.id.G12);
        CheckBox g13 = (CheckBox) findViewById(R.id.G13);
        CheckBox g14 = (CheckBox) findViewById(R.id.G14);
        CheckBox g15 = (CheckBox) findViewById(R.id.G15);
        CheckBox g16 = (CheckBox) findViewById(R.id.G16);

        if (g1.isChecked())
            value[0] = true;
        if (g2.isChecked())
            value[1] = true;
        if (g3.isChecked())
            value[2] = true;
        if (g4.isChecked())
            value[3] = true;
        if (g5.isChecked())
            value[4] = true;
        if (g6.isChecked())
            value[5] = true;
        if (g7.isChecked())
            value[6] = true;
        if (g8.isChecked())
            value[7] = true;
        if (g9.isChecked())
            value[8] = true;
        if (g10.isChecked())
            value[9] = true;
        if (g11.isChecked())
            value[10] = true;
        if (g12.isChecked())
            value[11] = true;
        if (g13.isChecked())
            value[12] = true;
        if (g14.isChecked())
            value[13] = true;
        if (g15.isChecked())
            value[14] = true;
        if (g16.isChecked())
            value[15] = true;


        return value;

        /*Intent i = new Intent(this, ReportActivity.class);
        i.putExtra("value", value);
        startActivity(i);*/
    }
}
