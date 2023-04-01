package com.ayseakin.sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button tahminEt, yenidenOyna;
    EditText gelenSayi;
    public int rastgeleSayi;
    public int girilenSayi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahminEt = (Button) findViewById(R.id.tahminEt);
        yenidenOyna = (Button) findViewById(R.id.yenidenOyna);
        gelenSayi = (EditText) findViewById(R.id.yazi);

        rastgeleSayi = (int) (((Math.random()) * 100) + 1);

        tahminEt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)

            {


                girilenSayi = Integer.parseInt(gelenSayi.getText().toString());



                if (girilenSayi > rastgeleSayi) {
                    Toast.makeText(MainActivity.this, "Daha Küçük Sayı Gir", Toast.LENGTH_SHORT).show();
                } else if (girilenSayi < rastgeleSayi) {
                    Toast.makeText(MainActivity.this, "Daha Büyük Sayı Gir", Toast.LENGTH_SHORT).show();
                } else if (girilenSayi == rastgeleSayi) {
                    Toast.makeText(MainActivity.this, "Tebrikler Sayiyi Buldun !  Sayı : " + rastgeleSayi, Toast.LENGTH_SHORT).show();

                }

            }
        });

        yenidenOyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                rastgeleSayi = (int) (((Math.random()) * 100) + 1);


                Toast.makeText(MainActivity.this, "Oyun Yeniden Başladı !", Toast.LENGTH_SHORT).show();

            }
        });
    }
}