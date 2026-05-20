package edu.cecade.tareas.modelo;

public class Docente extends Usuario {
    private String cursoAsignado;
    private int codigo;

    public Docente(String nombre, String cursoAsignado, int codigo){
        super(nombre);
        this.cursoAsignado = cursoAsignado;
        this.codigo = codigo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + nombre + "Curso Asignado: " + cursoAsignado + "Codigo: " + codigo);
    }
}
