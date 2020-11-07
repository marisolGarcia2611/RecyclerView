package com.marisolgarcia2611.myrecycleview;

public class usuario {
    private int perfil;
    private String titulo;
    private String contenido;
    private String boton;

    public usuario(int perfil, String titulo,String contenido,String boton )
    {
        this.perfil=perfil;
        this.titulo=titulo;
        this.contenido=contenido;
        this.boton=boton;

    }

    public int getPerfil()
    {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getBoton() {
        return boton;
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }
}
