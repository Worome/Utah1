package com.trianacodes.script.utah.adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AdaptadorSocios extends RecyclerView.Adapter<AdaptadorSocios.SociosViewHolder> {
    @Override
    public SociosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(SociosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class SociosViewHolder extends RecyclerView.ViewHolder{
        public SociosViewHolder(View itemView) {
            super(itemView);
        }
    }
}
