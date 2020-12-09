package com.example.apppiamango;

import java.io.Serializable;

public class Entidad implements Serializable {
    private int imgFoto;
    private String titulo;
    private String contenido;
    private String precio;

    public Entidad(int imgFoto, String titulo, String contenido, String precio) {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.contenido = contenido;
        this.precio = precio;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getPrecio() {
        return precio;
    }
}
