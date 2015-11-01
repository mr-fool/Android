package mr_fool.cipher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DecryptMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt_menu);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Decrypt.class);
        Bundle extras = new Bundle();
        EditText shiftkey = (EditText) findViewById(R.id.key);
        EditText message = (EditText) findViewById(R.id.content);
        //Converting shiftkey to integer
        int checkKey = Integer.valueOf(shiftkey.getText().toString()).intValue();
        //checking shift key
        if (checkKey >= 1 && checkKey <= 26) {
            extras.putString("SHIFT_KEY", shiftkey.getText().toString());
            //checking to see if the content is empty
            String stringCheck = message.getText().toString();
            if (stringCheck != null && !stringCheck.isEmpty()) {
                extras.putString("MESSAGE", stringCheck);
                intent.putExtras(extras);
                startActivity(intent);
            }
            else {
                Intent refresh = new Intent(this,Decrypt.class);
                startActivity(refresh);
                finish();
            }
        }
        else {
            Intent refresh = new Intent(this,DecryptMenu.class);
            startActivity(refresh);
            finish();
        }
    }
}
