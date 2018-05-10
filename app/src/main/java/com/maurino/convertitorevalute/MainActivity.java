package com.maurino.convertitorevalute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValueSpinner();
            }
        });

    }

    private void getValueSpinner(){
        String selezione = String.valueOf(spinner.getSelectedItem());
        switch (selezione){
            case "USD":
                Toast.makeText(getApplicationContext(), "USD", Toast.LENGTH_SHORT).show();
                break;
            case "GBP":
                Toast.makeText(getApplicationContext(), "GBP", Toast.LENGTH_SHORT).show();
                break;
            case "EUR":
                Toast.makeText(getApplicationContext(), "EUR", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
