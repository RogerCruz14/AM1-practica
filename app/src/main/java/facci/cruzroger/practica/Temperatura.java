package facci.cruzroger.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temperatura extends AppCompatActivity {

    Button convertir=null;
    EditText cantidad=null;
    TextView resultado=null;
    Spinner spinel=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        convertir=(Button)findViewById(R.id.btntem);
        cantidad=(EditText)findViewById(R.id.cant);
        resultado=(TextView) findViewById(R.id.Resu);
        spinel=(Spinner)findViewById(R.id.spinla);

        String[]op={"Seleccione una option","°C a °F","°F a °C"};

        ArrayAdapter<String> adapter=new
                ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,op);
        spinel.setAdapter(adapter);

        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cantidad.getText().toString().equals("")){
                    Toast msg=Toast.makeText(getApplicationContext(), "Ecriba una cantidad" ,Toast.LENGTH_LONG);
                    msg.show();
                }else {
                    Double c=Double.parseDouble(cantidad.getText().toString());
                    Double res=null;
                    int select=spinel.getSelectedItemPosition();

                    switch (select){
                        case 0:
                            res=0.0;
                            Toast.makeText(getApplicationContext(), "Selecciona una opcion" ,Toast.LENGTH_LONG ).show();
                            break;
                        case 1:
                            res=1.8* c +32;
                            break;
                        case 2:
                            res=(c - 32)/1.8;
                            break;
                    }
                    resultado.setText(res.toString());
                }


            }
        });

    }
}