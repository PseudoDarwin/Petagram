package com.example.coursera_petagram;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<C_mascotas> lista_mascotas;
    RecyclerView recycler_mascots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mi_barra = (Toolbar) findViewById(R.id.barra_p);
        setSupportActionBar(mi_barra);


        lista_mascotas =   new ArrayList<C_mascotas>();
        iniciar_lista();
        recycler_mascots = (RecyclerView) findViewById(R.id.rv_listaprincipa);
        recycler_mascots.setLayoutManager(new LinearLayoutManager(this));

        Adaptador_macotas adapter = new Adaptador_macotas(lista_mascotas);
        recycler_mascots.setAdapter(adapter);

    }


    public boolean onCreateOptionsMenu(Menu men){
        getMenuInflater().inflate(R.menu.menu_barra, men);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mRank:
                Intent intent = new Intent(this, mostrar_rank_activity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void iniciar_lista() {

        lista_mascotas.add(new C_mascotas("Orejas",15,R.drawable.perrito1));
        lista_mascotas.add(new C_mascotas("Jorge",12,R.drawable.perrito2));
        lista_mascotas.add(new C_mascotas("Pancho",13,R.drawable.perrito3));
        lista_mascotas.add(new C_mascotas("Ice Cube",22,R.drawable.perrito4));
        lista_mascotas.add(new C_mascotas("Braulio",17,R.drawable.perrito5));
    }


}