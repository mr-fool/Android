package mr_fool.cipher;

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
    //launch the encrypt page
    public void encrpytPage(View view){
        Intent encryption = new Intent(this, EncrpytMenu.class);
        startActivity(encryption);
    }
    public void decryptPage(View view){
        Intent decryption = new Intent(this, DecryptMenu.class);
        startActivity(decryption);
    }
}
