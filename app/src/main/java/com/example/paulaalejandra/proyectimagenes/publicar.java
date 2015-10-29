package com.example.paulaalejandra.proyectimagenes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class publicar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar);
        Button cargar=(Button)findViewById(R.id.cargar);
        Button capturar=(Button)findViewById(R.id.capturar);
        Button publicar=(Button)findViewById(R.id.publicar);
        EditText nombre=(EditText)findViewById(R.id.enombre);
        EditText eubicacion=(EditText)findViewById(R.id.eubicacion);
        EditText efecha=(EditText)findViewById(R.id.efecha);
        findViewById(R.id.spcategoria).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_publicar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.PRINCIPAL:
                Intent i= new Intent(this,general.class);
                startActivity(i);
                return true;

            case R.id.CATEGORIAS:
                Intent ii= new Intent(this,categorias.class);
                startActivity(ii);
                return true;

            case R.id.MIS_INFORMES:
                Intent iii= new Intent(this,misInformes.class);
                startActivity(iii);
                return true;
            case R.id.CARRITO:
                Intent iv= new Intent(this,carrito.class);
                startActivity(iv);
                return true;
            case R.id.CERRAR_SESION:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
