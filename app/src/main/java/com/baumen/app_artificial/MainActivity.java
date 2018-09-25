package com.baumen.app_artificial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mensaje;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
        mensaje.setText("era el disco duro");
    }
    private void inicializar(){
        mensaje=(TextView)findViewById(R.id.mensaje);
        button=(Button)findViewById(R.id.button);

    }
    public void onClick(View view ){
        Intent i = new Intent(this,TablaMultiplicar.class);
        startActivity(i);
    }
}
