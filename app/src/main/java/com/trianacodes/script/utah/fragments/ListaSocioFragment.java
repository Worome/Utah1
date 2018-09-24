package com.trianacodes.script.utah.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.trianacodes.script.utah.Entidades.Socios;
import com.trianacodes.script.utah.R;
import com.trianacodes.script.utah.adaptadores.AdaptadorSocios;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListaSocioFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListaSocioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaSocioFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    ArrayList<Socios> listaSocios;
    RecyclerView recyclerSocios;

    public ListaSocioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListaSocioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListaSocioFragment newInstance(String param1, String param2) {
        ListaSocioFragment fragment = new ListaSocioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_lista_socio, container, false);
        Log.i("Listasocio","ArrayList");
        listaSocios = new ArrayList<Socios>();
        Log.i("Listasocio","Recycler");
        recyclerSocios=vista.findViewById(R.id.recyclerId);
        Log.i("Listasocio","setLayout");
        recyclerSocios.setLayoutManager(new LinearLayoutManager(getContext()));
        Log.i("Listasocio","llenarLista");
        llenarListaSocios();
        Log.i("Listasocio","Adapter");
        AdaptadorSocios adapter = new AdaptadorSocios(listaSocios);
        Log.i("Listasocio","setAdapter");
        recyclerSocios.setAdapter(adapter);
        Log.i("Listasocio","Adapter Listener");
        adapter.setOnCliCkListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Seleccionado: " + listaSocios.get(
                        recyclerSocios.getChildAdapterPosition(view)).getNombre(),
                        Toast.LENGTH_LONG).show();
            }
        });
        return vista;
    }

    private void llenarListaSocios() {

        Log.i("Listasocio","llenado Lista socios");
        listaSocios.add(new Socios("Rafa","Mekaniks","Presidente", R.drawable.mekaniks));
        listaSocios.add(new Socios("Carlos","Ghost","Vicepresidente", R.drawable.ghost));
        listaSocios.add(new Socios("Angel","Angelito","", R.drawable.angel));
        listaSocios.add(new Socios("Javier","Worome","Secretario", R.drawable.worome));

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
