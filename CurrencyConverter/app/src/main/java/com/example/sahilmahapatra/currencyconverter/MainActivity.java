package com.example.sahilmahapatra.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {


        Log.i("Info","Button Pressed");
        EditText editText =(EditText) findViewById(R.id.editText);

        String amountInRupees = editText.getText().toString();
        double amountInRupeesDouble = Double.parseDouble(amountInRupees);
        double amountInDollarDouble = amountInRupeesDouble * 66.82;
        String amountInDollar = String.format("%.2f", amountInDollarDouble);
        Toast.makeText(this, "Rs"+amountInRupees + " is $"+amountInDollar, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
