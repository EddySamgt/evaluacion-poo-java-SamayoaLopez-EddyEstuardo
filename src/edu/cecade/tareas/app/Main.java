package edu.cecade.tareas.app;
import edu.cecade.tareas.modelo.Usuario;
import edu.cecade.tareas.modelo.Tarea;
import edu.cecade.tareas.servicio.ServicioTareas;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n====== MENÚ ======");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Registrar docente");
        System.out.println("3. Crear tarea");
        System.out.println("4. Avance");
        System.out.println("5. Registro de actividades");
        sc.nextLine();


    }

}
