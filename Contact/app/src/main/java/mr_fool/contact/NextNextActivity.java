package mr_fool.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextNextActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(NextActivity.EXTRA_MESSAGE);
        String area_code ="Your area code is " + message.substring(0,3);
        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(area_code);

        // Set the text view as the activity layout
        setContentView(textView);
    }
}
