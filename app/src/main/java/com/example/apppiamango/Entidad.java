package com.example.apppiamango;

import java.io.Serializable;

public class Entidad implements Serializable {
    private int imgFoto;
    private String Contenido;
    private String descripcion;
    private String Nombre;

    public Entidad(int imgFoto, String contenido, String descripcion, String nombre) {
        this.imgFoto = imgFoto;

       this.Contenido = contenido;
        this.descripcion = descripcion;
        this.Nombre = nombre;
    }

    public int getImgFoto() {
        return imgFoto;
    }



    public String getContenido() {
        return Contenido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return Nombre;
    }
}
