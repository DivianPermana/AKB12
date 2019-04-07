package id.ac.unikom.lat1_akb12_10116551_divianajiepermana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){
                Intent i = new Intent(login.this, bio.class);
                startActivity(i);
            }
        });
    }
}
