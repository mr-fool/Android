package com.github.mr_fool.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        /*Toast.makeText(getApplicationContext(),"Hi, mr-fool", Toast.LENGTH_LONG).show();
        EditText myTextField = (EditText) findViewById(R.id.textField);
        Log.i("TextField Value", myTextField.getText().toString());*/
        ImageView dogeImage = (ImageView) findViewById(R.id.dogeImage);
        dogeImage.setImageResource(R.drawable.doge2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
