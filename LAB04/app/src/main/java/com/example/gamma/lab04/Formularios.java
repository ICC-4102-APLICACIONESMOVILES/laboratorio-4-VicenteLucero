package com.example.gamma.lab04;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity
public class Formularios {
    @NonNull
    @PrimaryKey
    private String Nombre;
    private String Fecha;
    private String Categoria;
    private String Comentario;


    public Formularios() {
    }

    public String getNombre() { return Nombre; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }
    public String getFecha() {return Fecha;}
    public void setFecha(String Fecha) {this.Fecha = Fecha;}
    public String getCategoria() { return Categoria; }
    public void setCategoria (String Categoria) { this.Categoria = Categoria; }
    public String getComentario() {return Comentario;}
    public void setComentario(String Comentario) {this.Comentario = Comentario;}

}