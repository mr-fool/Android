package mr_fool.cipher;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EncrpytMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrpyt_menu);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Encrypt.class);
        Bundle extras = new Bundle();
        EditText shiftkey = (EditText) findViewById(R.id.key);
        EditText message = (EditText) findViewById(R.id.content);
        //Converting shiftkey to integer
        int checkKey = Integer.valueOf(shiftkey.getText().toString()).intValue();
        //checking shift key
        if (checkKey >= 1 && checkKey <= 26) {
            extras.putString("SHIFT_KEY", shiftkey.getText().toString());
            extras.putString("MESSAGE", message.getText().toString());
            intent.putExtras(extras);
            startActivity(intent);
        }
        else {
            Intent refresh = new Intent(this,EncrpytMenu.class);
            startActivity(refresh);
            finish();
        }
    }
}
