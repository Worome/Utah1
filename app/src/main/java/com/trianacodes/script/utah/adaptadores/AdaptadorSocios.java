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

public class AdaptadorSocios extends
        RecyclerView.Adapter<AdaptadorSocios.SociosViewHolder>
        implements View.OnClickListener{

        ArrayList<Socios> listaSocios;
    private View.OnClickListener listener;

    public AdaptadorSocios(ArrayList<Socios> listaSocios) {
        this.listaSocios = listaSocios;
    }

    @Override
    public SociosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        view.setOnClickListener(this);
        return new SociosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SociosViewHolder holder, int position) {

        holder.txtNombre.setText(listaSocios.get(position).getNombre());
        holder.txtNick.setText(listaSocios.get(position).getNick());
        holder.txtCargo.setText(listaSocios.get(position).getCargo());
        holder.ivFoto.setImageResource(listaSocios.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaSocios.size();
    }

    public void setOnCliCkListener(View.OnClickListener listener ){
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if(listener != null){

            listener.onClick(view);

        }
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
