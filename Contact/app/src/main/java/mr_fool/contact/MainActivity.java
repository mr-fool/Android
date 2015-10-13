package mr_fool.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtn(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, NextActivity.class);
        startActivity(myIntent);
    }
}
