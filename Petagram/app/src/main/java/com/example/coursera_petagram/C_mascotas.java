package com.example.coursera_petagram;

public class C_mascotas {
    private String nombre;
    private  int rank;
    private  int foto;

    public C_mascotas()
    {

    }
    public C_mascotas(String nombre,int rank, int foto) {
        this.nombre = nombre;
        this.rank = rank;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
