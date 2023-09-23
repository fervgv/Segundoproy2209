package cl.ipvg.com.segundoproy2209;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Aceptar1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentA1;

        intentA1= new Intent(this,MainUno.class);

        Aceptar1= (Button) findViewById(R.id.btAceptarA);
        Aceptar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentA1);
            }
        });
    }


}