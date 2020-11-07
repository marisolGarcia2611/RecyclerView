package com.marisolgarcia2611.myrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdaptadorUsuario extends RecyclerView.Adapter<AdaptadorUsuario.MiHolder>
{
 private List<usuario> usuarioList;
 public AdaptadorUsuario(List<usuario>usuarioList){this.usuarioList=usuarioList;}
 @NonNull
 @Override
 public AdaptadorUsuario.MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
 {
     View vistaUsuarios= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
     return new MiHolder(vistaUsuarios);
 }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorUsuario.MiHolder holder, int position) {
     holder.setData(usuarioList.get(position));
    }

    @Override
    public int getItemCount() {
     return usuarioList.size(); }

    public class MiHolder extends RecyclerView.ViewHolder {
           private ImageView perfil;
           private TextView titulo;
           private TextView contenido;
           private TextView boton;

        public MiHolder(@NonNull View itemView) {
            super(itemView);

            perfil=itemView.findViewById(R.id.imagen);
            titulo=itemView.findViewById(R.id.txt1);
            contenido=itemView.findViewById(R.id.txt2);
            boton=itemView.findViewById(R.id.btn1);
        }

        public void setData(usuario u) {
            perfil.setImageResource(u.getPerfil());
            titulo.setText(u.getTitulo());
            contenido.setText(u.getContenido());
            boton.setText(u.getBoton());
        }
    }
}
