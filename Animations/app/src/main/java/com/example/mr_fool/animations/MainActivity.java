package com.example.mr_fool.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view) {
        ImageView plan = (ImageView) findViewById(R.id.plan);
        plan.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(3600)
                .setDuration(2000);
        //ImageView skin = (ImageView) findViewById(R.id.skin);
        //skin.animate().alpha(1f).setDuration(2000);
        //TextView building = (TextView) findViewById(R.id.building);
        //building.animate().alpha(1f).setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView plan = (ImageView) findViewById(R.id.plan);
        plan.setTranslationX(-1000f);
        plan.setTranslationY(-1000f);
    }
}
