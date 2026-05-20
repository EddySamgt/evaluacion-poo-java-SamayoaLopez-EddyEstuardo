package edu.cecade.tareas.modelo;
public class Tarea {
    private String titulo;
    private int id;
    private String descripcion;
    private String estado;
    private String fechaDeEntrega;

public Tarea(String titulo, int id, String descripcion, String estado, String fechaDeEntrega) {
    this.titulo = titulo;
    this.id = id;
    this.descripcion = descripcion;
    this.estado = "Pendiente";
    this.fechaDeEntrega = fechaDeEntrega;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaDeEntrega() {
        return fechaDeEntrega;
    }
}
