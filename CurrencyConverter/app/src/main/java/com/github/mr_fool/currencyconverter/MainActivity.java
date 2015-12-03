package com.github.mr_fool.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Convert(View view){
        EditText dollarField = (EditText) findViewById(R.id.dollarField);
        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());
        Double cadAmount = dollarAmount * 1.34;
        Log.i("dollarField", cadAmount.toString());
        Toast.makeText(getApplicationContext(), "$" + cadAmount.toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
