package com.example.testgdrive;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edtNomor);
        button = findViewById(R.id.btnHasil);
        textView = findViewById(R.id.hasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int nomor =   Integer.parseInt(editText.getText().toString());

                if (nomor < 0){
                    textView.setText("Negatif");
                }else if (nomor > 0){
                    textView.setText("Positif");
                }else {
                    textView.setText("Nol");

                }

                switch (nomor){
                    case 0:

                }

            }
        });



    }
}


