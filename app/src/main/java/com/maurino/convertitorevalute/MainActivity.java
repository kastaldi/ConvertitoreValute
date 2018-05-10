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
    private TextView USDvaluta;
    private TextView GBPvaluta;
    private TextView EURvaluta;
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
        String selezione = String.valueOf(spinner.getSelectedItem());
        switch (selezione){
            case "USD":
                USDvaluta.setText(inputValuta.getText());

                double GBP = Double.parseDouble((inputValuta.getText().toString())) * 0.74;
                GBPvaluta.setText(String.valueOf(GBP));

                double EUR = Double.parseDouble((inputValuta.getText().toString())) * 0.84;
                EURvaluta.setText(String.valueOf(EUR));

                Toast.makeText(getApplicationContext(), "USD", Toast.LENGTH_SHORT).show();
                break;
            case "GBP":
                USDvaluta.setText(inputValuta.getText());
                GBPvaluta.setText(inputValuta.getText());
                EURvaluta.setText(inputValuta.getText());
                Toast.makeText(getApplicationContext(), "GBP", Toast.LENGTH_SHORT).show();
                break;
            case "EUR":
                USDvaluta.setText(inputValuta.getText());
                GBPvaluta.setText(inputValuta.getText());
                EURvaluta.setText(inputValuta.getText());
                Toast.makeText(getApplicationContext(), "EUR", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
