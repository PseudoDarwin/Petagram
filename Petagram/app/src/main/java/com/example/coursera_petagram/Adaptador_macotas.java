package com.example.coursera_petagram;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador_macotas extends RecyclerView.Adapter<Adaptador_macotas.ViewHolderMascotas> {
    ArrayList<C_mascotas> lista_mascotas;

    public Adaptador_macotas(ArrayList<C_mascotas> lista_mascotas) {
        this.lista_mascotas = lista_mascotas;
    }

    @Override
    public Adaptador_macotas.ViewHolderMascotas onCreateViewHolder(@NonNull ViewGroup parent, int i) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.info_mascotas ,null,false);
        return new ViewHolderMascotas(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderMascotas holder, int i) {
        holder.txt_nombre.setText(lista_mascotas.get(i).getNombre().toString());
        holder.txt_rank.setText(String.valueOf(lista_mascotas.get(i).getRank()));
        holder.img_foto.setImageResource(lista_mascotas.get(i).getFoto());
    }

    @Override
    public int getItemCount() {
        return lista_mascotas.size();
    }

    public class ViewHolderMascotas extends RecyclerView.ViewHolder {

        ImageView img_foto;
        TextView txt_nombre,txt_rank;
        public ViewHolderMascotas(View itemView) {
            super(itemView);
            img_foto=(ImageView) itemView.findViewById(R.id.iv_foto);
            txt_nombre=(TextView) itemView.findViewById(R.id.txt_nombre);
            txt_rank=(TextView) itemView.findViewById(R.id.txt_contador);

        }
    }
}
