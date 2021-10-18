package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button persegi, segitiga, lingkaran, calc;
    EditText angka1, angka2;
    TextView hasil1, hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persegi = findViewById(R.id.persegi);
        segitiga = findViewById(R.id.segitiga);
        lingkaran = findViewById(R.id.lingkaran);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);

        hasil1 = findViewById(R.id.hasil1);
        hasil2 = findViewById(R.id.hasil2);
        calc = findViewById(R.id.calc);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                angka1.setHint("Masukan panjang :");
                angka2.setHint("Masukan lebar :");

                calc.setText("Menghitung Persegi");
                calc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String nangka1 = angka1.getText().toString();
                        String nangka2 = angka2.getText().toString();

                        int integer_angka1 = Integer.valueOf(nangka1);
                        int integer_angka2 = Integer.valueOf(nangka2);
                        int lhasil = integer_angka1 * integer_angka2;
                        int khasil = 2 * (integer_angka1 + integer_angka2);

                        hasil1.setText(" Luas : "+String.valueOf(lhasil));
                        hasil2.setText(" Keliling : "+String.valueOf(khasil));
                    }
                });
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                angka1.setHint("Masukan alas :");
                angka2.setHint("Masukan tinggi :");

                calc.setText("Menghitung Segitiga");
                calc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String nangka1 = angka1.getText().toString();
                        String nangka2 = angka2.getText().toString();

                        int integer_angka1 = Integer.valueOf(nangka1);
                        int integer_angka2 = Integer.valueOf(nangka2);
                        int lhasil = (integer_angka1 * integer_angka2) / 2;
                        int khasil = 3 * integer_angka1;

                        hasil1.setText(" Luas : " + String.valueOf(lhasil));
                        hasil2.setText(" Keliling : " + String.valueOf(khasil));
                    }
                });
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                angka1.setHint("Masukan jari-jari :");
                angka2.setHint("Kosongi");

                calc.setText("Menghitung Lingkaran");
                calc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String nangka1 = angka1.getText().toString();

                        int integer_angka1 = Integer.valueOf(nangka1);
                        int lhasil = (int) (3.14 * integer_angka1 * integer_angka1);
                        int khasil = (int) (2 * 3.14 * integer_angka1);

                        hasil1.setText(" Luas : " + String.valueOf(lhasil));
                        hasil2.setText(" Keliling : " + String.valueOf(khasil));
                    }
                });

            }
        });

    }
}