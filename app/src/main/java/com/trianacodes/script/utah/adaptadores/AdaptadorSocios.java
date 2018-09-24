package com.trianacodes.script.utah.adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.trianacodes.script.utah.Entidades.Socios;
import com.trianacodes.script.utah.R;

import java.util.ArrayList;

public class AdaptadorSocios extends RecyclerView.Adapter<AdaptadorSocios.SociosViewHolder> {

    ArrayList<Socios> listaSocios;

    public AdaptadorSocios(ArrayList<Socios> listaSocios) {
        this.listaSocios = listaSocios;
    }

    @Override
    public SociosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);

        return new SociosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SociosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class SociosViewHolder extends RecyclerView.ViewHolder{

        TextView txtNombre, txtNick, txtCargo;
        ImageView ivFoto;

        public SociosViewHolder(View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtNick = itemView.findViewById(R.id.txtNick);
            txtCargo = itemView.findViewById(R.id.txtCargo);
            ivFoto = itemView.findViewById(R.id.ivFoto);
        }
    }
}
