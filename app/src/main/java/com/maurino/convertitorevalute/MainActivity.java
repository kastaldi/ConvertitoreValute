package com.maurino.convertitorevalute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;
    private TextView USDvaluta,GBPvaluta,EURvaluta;
    private EditText inputValuta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        inputValuta = findViewById(R.id.inputValuta);
        USDvaluta = findViewById(R.id.ValutaUSD);
        GBPvaluta = findViewById(R.id.ValutaGBP);
        EURvaluta = findViewById(R.id.ValutaEUR);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValueSpinner();
            }
        });
    }

    private void getValueSpinner(){
        double GBP, EUR, USD;
        String selezione = String.valueOf(spinner.getSelectedItem());
        String valuta = inputValuta.getText().toString();
        switch (selezione){
            case "USD":
                USDvaluta.setText(valuta);
                GBP = Double.parseDouble(valuta) * 0.74;
                GBPvaluta.setText(String.valueOf(GBP));
                EUR = Double.parseDouble(valuta) * 0.84;
                EURvaluta.setText(String.valueOf(EUR));
                Toast.makeText(getApplicationContext(), "USD", Toast.LENGTH_SHORT).show();
                break;
            case "GBP":
                GBPvaluta.setText(valuta);
                USD = Double.parseDouble(valuta) * 1.35;
                USDvaluta.setText(String.valueOf(USD));
                EUR = Double.parseDouble(valuta) * 1.13;
                EURvaluta.setText(String.valueOf(EUR));
                Toast.makeText(getApplicationContext(), "GBP", Toast.LENGTH_SHORT).show();
                break;
            case "EUR":
                EURvaluta.setText(valuta);
                USD = Double.parseDouble(valuta) * 1.19;
                USDvaluta.setText(String.valueOf(USD));
                GBP = Double.parseDouble(valuta) * 0.88;
                GBPvaluta.setText(String.valueOf(GBP));
                Toast.makeText(getApplicationContext(), "EUR", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
