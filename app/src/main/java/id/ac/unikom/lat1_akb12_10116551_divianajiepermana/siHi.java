package id.ac.unikom.lat1_akb12_10116551_divianajiepermana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class siHi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si_hi);
        Button btn = (Button) findViewById(R.id.buttonOk);
        btn.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){
                Intent i = new Intent(siHi.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
