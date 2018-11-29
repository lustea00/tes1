package com.example.awkow2x.myapplication;

public class Data {
    static String[][] gejalaString = {
            //Kode    Gejala              Range Gejala
            //0         1                   2
            {"G1",  "Bengkak",          "Parah"},
            {"G2",  "Batuk",            "Ringan"},
            {"G3",  "Demam",            "Ringan"},
            {"G4",  "Perut Sebah",      "Ringan"},
            {"G5",  "Badan Lemas",      "Parah"},
            {"G6",  "Nyeri Perut",      "Agak Parah"},
            {"G7",  "Wajah Pucat",      "Agak Parah"},
            {"G8",  "Mual Muntah",      "Agak Parah"},
            {"G9",  "Sesak Nafas",      "Parah"},
            {"G10", "Nyeri Pinggang/" +
                    "Nyeri Perut " +
                    "Tembus",           "Agak Parah"},
            {"G11", "BAK Nyeri/Sulit",  "Parah"},
            {"G12", "BAK Berdarah",     "Parah"},
            {"G13", "Sulit Makan",      "Ringan"},
            {"G14", "Kepala Pusing",    "Ringan"},
            {"G15", "Sulit Tidur",      "Agak Parah"},
            {"G16", "Ngos-ngosan",      "Agak Parah"}
    };

    static double[][] gejalaDouble = {
            //Bobot   Int Min     Int Max     Nil Mid     F Min   F Max   F Hasil
            // 0         1           2           3           4       5       6
            {0.8,       0.6,        1,          0.8,        1,      1,      1},
            {0.4,       0,          0.4,        0.2,        2,      0,      0},
            {0.2,       0,          0.4,        0.2,        1,      1,      1},
            {0.3,       0,          0.4,        0.2,        1.5,    0.5,    0.5},
            {0.7,       0.6,        1,          0.8,        0.5,    1.5,    0.5},
            {0.5,       0.3,        0.7,        0.5,        1,      1,      1},
            {0.4,       0.3,        0.7,        0.5,        0.5,    1.5,    0.5},
            {0.5,       0.3,        0.7,        0.5,        1,      1,      1},
            {1,         0.6,        1,          0.8,        2,      0,      0},
            {0.5,       0.3,        0.7,        0.5,        1,      1,      1},
            {0.6,       0.6,        1,          0.8,        0,      2,      0},
            {0.9,       0.6,        1,          0.8,        1.5,    0.5,    0.5},
            {0.3,       0,          0.4,        0.2,        1.5,    0.5,    0.5},
            {0.2,       0,          0.4,        0.2,        1,      1,      1},
            {0.4,       0.3,        0.7,        0.5,        0.5,    1.5,    0.5},
            {0.4,       0.3,        0.7,        0.5,        0.5,    1.5,    0.5}
    };

    static String[][] aturan = {
            //Gejala        Penyakit
            //0               1
            {"04",          "P1"},      //1
            {"014",         "P1"},      //2
            {"024",         "P1"},      //3
            {"034",         "P1"},      //4
            {"045",         "P1"},      //5
            {"046",         "P1"},      //6
            {"047",         "P1"},      //7
            {"048",         "P1"},      //8
            {"0148",        "P1"},      //9
            {"0248",        "P1"},      //10
            {"0348",        "P1"},      //11
            {"0458",        "P1"},      //12
            {"0468",        "P1"},      //13
            {"0478",        "P1"},      //14

            {"910",         "P2"},      //15
            {"4910",        "P2"},      //16
            {"5910",        "P2"},      //17
            {"7910",        "P2"},      //18
            {"91011",       "P2"},      //19
            {"91012",       "P2"},      //20
            {"491011",      "P2"},      //21
            {"591011",      "P2"},      //22
            {"791011",      "P2"},      //23
            {"9101112",     "P2"},      //24

            {"78",          "P3"},      //25
            {"178",         "P3"},      //26
            {"278",         "P3"},      //27
            {"378",         "P3"},      //28
            {"478",         "P3"},      //29
            {"578",         "P3"},      //30
            {"678",         "P3"},      //31
            {"7812",        "P3"},      //32
            {"7813",        "P3"},      //33
            {"7814",        "P3"},      //34
            {"7815",        "P3"},      //35
            {"17812",       "P3"},      //36
            {"27812",       "P3"},      //37
            {"37812",       "P3"},      //38
            {"47812",       "P3"},      //39
            {"57812",       "P3"},      //40
            {"67812",       "P3"},      //41
            {"781213",      "P3"},      //42
            {"781214",      "P3"},      //43
            {"781215",      "P3"},      //44
    };
}