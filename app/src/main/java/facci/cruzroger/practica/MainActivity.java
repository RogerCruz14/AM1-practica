package facci.cruzroger.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button temperatura=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("My Practica","Roger David Cruz Alvarado");

        temperatura=(Button)findViewById(R.id.btn1);

        temperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cambiar=new Intent(getApplicationContext(),Temperatura.class);
                startActivity(cambiar);
            }
        });


    }
}
