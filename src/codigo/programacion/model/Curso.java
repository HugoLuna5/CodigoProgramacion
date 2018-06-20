/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.model;

/**
 *
 * @author HugoLuna
 */
public class Curso {
    
    public String id;
    public String nombre;
    public String descripcion;
    public String autor;
    public String estudiantes;
    public String img;
    public String created_at;

    public Curso() {
    }

    public Curso(String id, String nombre, String descripcion, String autor, String estudiantes, String img, String created_at) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.autor = autor;
        this.estudiantes = estudiantes;
        this.img = img;
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

   
    
}
