package mr_fool.cipher;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Decrypt extends AppCompatActivity {
    public static String decryption = "a";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String transition_key = extras.getString("SHIFT_KEY");
        int key = Integer.parseInt(transition_key);
        String content = extras.getString("MESSAGE");
        plainText(key,content);
        TextView textView = (TextView)findViewById(R.id.displayText);
        textView.setTextSize(30);
        textView.setTextColor(Color.RED);
        textView.setText(decryption);

    }
    public void plainText(int key, String content){
        char[] buffer = content.toCharArray();
        String text ="";
        char finalShift;
        for (int i = 0; i < buffer.length; i++) {
            //current iterating letter
            char letter = buffer[i];
            //Convert it to int for comparing
            int ascii = (int) letter;
            if ( (ascii >= 'a' ) && (ascii <= 'z') ) {
                int	encrpytFinalShift = ascii - key; // doing the shift
                if (encrpytFinalShift < 'a') {
                    encrpytFinalShift = encrpytFinalShift + 26;
                }
                finalShift = (char) encrpytFinalShift;
            }
            //Other cases including A-Z no shift
            else {
                finalShift=(char) ascii;
            }
            text = text + finalShift;
        }
        decryption = text;
    }
    public void github(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/mr-fool"));
        startActivity(browserIntent);
    }
}
