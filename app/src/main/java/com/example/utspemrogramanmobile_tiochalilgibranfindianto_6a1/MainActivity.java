package com.example.utspemrogramanmobile_tiochalilgibranfindianto_6a1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
//    public var
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        local var
        ImageButton btn1 = findViewById(R.id.imageButton1);
        ImageButton btn2 = findViewById(R.id.imageButton2);
        ImageButton btn3 = findViewById(R.id.imageButton3);
        ImageButton btn4 = findViewById(R.id.imageButton4);
        ImageButton btn5 = findViewById(R.id.imageButton5);
        ImageButton btn6 = findViewById(R.id.imageButton6);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                putarSuara(R.raw.a);
                tampilkanSnackBar("Anda Menekan Button Meow 1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                putarSuara(R.raw.aa);
                tampilkanSnackBar("Anda Menekan Button Meow 2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                putarSuara(R.raw.ab);
                tampilkanSnackBar("Anda Menekan Button Meow 3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                putarSuara(R.raw.ac);
                tampilkanSnackBar("Anda Menekan Button Meow 4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                putarSuara(R.raw.ad);
                tampilkanSnackBar("Anda Menekan Button Meow 5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                putarSuara(R.raw.ae);
                tampilkanSnackBar("Anda Menekan Button Meow 6");
            }
        });

    }
//    method tampilkanSnackBar
    private void tampilkanSnackBar(String pesan){
        View snackBarView = findViewById(android.R.id.content);
        Snackbar.make(snackBarView,pesan,Snackbar.LENGTH_SHORT).show();
    }
//    method putarSuara
    private void putarSuara(int soundId) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(this, soundId);
        mp.start();
    }


}
