package mr_fool.cipher;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Encrypt extends AppCompatActivity {
    String encryption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String transition_key = extras.getString("SHIFT_KEY");
        int key = Integer.parseInt(transition_key);
        String content = extras.getString("MESSAGE");

        //Testing receiving information correctly
       // String message = "The shift key is " + transition_key + "and the content is " + content;
        encryptText(key,content);
        TextView textView = (TextView)findViewById(R.id.displayText);
        textView.setTextSize(30);
        textView.setTextColor(Color.RED);
        textView.setText(encryption);

    }
    public void encryptText(int key, String content){
        char[] buffer = content.toCharArray();
        // Loop over characters.
        for (int i = 0; i < buffer.length; i++) {
        //current iterating letter
            char letter = buffer[i];
            //Convert it to int for comparing
            int ascii = (int) letter;
            //Lower case a-z
            if ( (ascii >= 'a' ) && (ascii <= 'z') ) {

            }

        }

    }
    public void github(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/mr-fool"));
        startActivity(browserIntent);
    }
}
