package com.example.paulaalejandra.proyectimagenes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_categorias, menu);
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

            case R.id.PUBLICAR:
                Intent ii= new Intent(this,publicar.class);
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
