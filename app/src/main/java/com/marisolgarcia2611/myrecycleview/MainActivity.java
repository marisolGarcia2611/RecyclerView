package com.marisolgarcia2611.myrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<usuario>usuarioList=new ArrayList<>();
        usuarioList.add(new usuario(R.drawable.usuario,"Liliana","Estudiante de UTT","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Oscar","Estudiante de UTT","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Marisol","Estudiante de UTT","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Ruben","Profesor","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Dulcinea","Estudiante de UTT","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Sol","Profesor","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Israel","Estudiante de UTT","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Sofia","Estudiante de UTT","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Roberto","Profesor de UTT","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Juan","Estudiante de UTT","Informacion"));
        usuarioList.add(new usuario(R.drawable.usuario,"Sonia","Estudiante de UTT","Informacion"));
         AdaptadorUsuario adapter=new AdaptadorUsuario(usuarioList);
         recyclerView.setAdapter(adapter);
         adapter.notifyDataSetChanged();


    }
}