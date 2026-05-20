package edu.cecade.tareas.modelo;

public class Estudiante extends Usuario {
    private String carnet;
    private String grado;
    public Estudiante(String nombre, String carnet, String grado){
        super(nombre);
        this.carnet = carnet;
        this.grado = grado;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + "Carnet: " + carnet);
    }
}
