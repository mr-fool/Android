package com.example.mr_fool.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
    }
    public void checkGuess(View view){
        EditText guessedNumber = (EditText) findViewById(R.id.guessedNumber);
        String guessNumberString = guessedNumber.getText().toString();
        int gussedNumberInt = Integer.parseInt(guessNumberString);
        String message = "";
        if (gussedNumberInt > randomNumber){
            message = "Too high!";
        }
        else if (gussedNumberInt < randomNumber){
            message = "Too low!";
        }
        else {
            message = "Correct";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
