package com.trianacodes.script.utah;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.trianacodes.script.utah.fragments.DetalleSociosFragment;
import com.trianacodes.script.utah.fragments.ListaSocioFragment;

public class MainActivity extends AppCompatActivity {

    ListaSocioFragment listaFragment;
    DetalleSociosFragment detalleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFragment = new ListaSocioFragment();
        detalleFragment = new DetalleSociosFragment();
        getSupportFragmentManager().beginTransaction().
                replace(R.id.contenedorFragment,listaFragment).commit();

    }
}
