package com.baumen.app_artificial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
        mensaje.setText("sicorrio");
    }
    private void inicializar(){
        mensaje=(TextView)findViewById(R.id.mensaje);

    }
}
