package com.trianacodes.script.utah;

import android.app.Fragment;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.trianacodes.script.utah.fragments.DetalleSociosFragment;
import com.trianacodes.script.utah.fragments.ListaSocioFragment;

public class MainActivity extends AppCompatActivity implements ListaSocioFragment.OnFragmentInteractionListener {

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

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
