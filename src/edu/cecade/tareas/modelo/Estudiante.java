package edu.cecade.tareas.modelo;
import java.util.ArrayList;
import java.util.List;
public class Estudiante extends Usuario {
    List<Estudiante> estudiantes = new ArrayList<>();

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
