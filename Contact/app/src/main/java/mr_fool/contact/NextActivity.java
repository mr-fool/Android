package mr_fool.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NextActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "user.input.attempt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, NextNextActivity.class);
        EditText editText = (EditText) findViewById(R.id.phone);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}
