package edu.cecade.tareas.modelo;

public class Docente extends Usuario {
    private String grado;
    private int codigo;

    public Docente(String nombre, String grado, int codigo){
        super(nombre);
        this.grado = grado;
        this.codigo = codigo;
    }

    @Override
    public void mostrarInfo() {

    }
}
