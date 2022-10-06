package com.example.wprowadzenie_cz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int licznik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zlaOdpowiedz(View view) {
        Toast.makeText(MainActivity.this,R.string.zla_odp ,Toast.LENGTH_SHORT).show();
    }

    public void dobraOdpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik == 5){
            TextView pytanieTextView = findViewById(R.id.pytanieTextView);
            pytanieTextView.setText(R.string.koniec_gry);
        }

    }
}