package mr_fool.cipher;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Encrypt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String transition_key = extras.getString("SHIFT_KEY");
        int key = Integer.parseInt(transition_key);
        String content = extras.getString("MESSAGE");

        //Testing receiving information correctly
        // Create the text view
        String message = "The shift key is " + transition_key + "and the content is " + content;
        TextView textView = (TextView) findViewById(R.id.displayText);
        textView.setTextSize(30);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setText(message);
        // Set the text view as the activity layout
        setContentView(R.layout.RelativeLayout);

    }
}
