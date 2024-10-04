package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.*;
import java.util.Scanner;

/**
 * Clase principal de la Practica 7
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
 */

public class Practica7 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Manager manager = new Manager("Fernanda Lopez", "Calle Las Flores 789, Urbanización Las Palmas", 30000, "Project Manager");
        Desarrollador desarrollador = new Desarrollador("Adrian Gonzales", "Calle Jardines 123, Ciudad del Sol", 25000, "Desarrollador Frontend");
        Programador programador = new Programador("Carlos Rodríguez", "Avenida Central 456, Colonia Vista Hermosa", 20000, "Programador Backend");
        
        int desempenio, avance;
        String nombreProyecto; 
        
        manager.mostrarDatos();
        manager.bonos(300.0, 500.0);
        System.out.print("¿Cuál ha sido el desempeño del empleado? (1-10)\n> ");
        desempenio = entrada.nextInt();
        manager.cartaDesempenio(desempenio);

        entrada.nextLine(); 

        System.out.print("¿En qué proyecto trabaja?\n> ");
        nombreProyecto = entrada.nextLine();

        System.out.print("¿Cuál es su avance?\n> ");
        avance = entrada.nextInt();
        manager.manejoProyectos(nombreProyecto, avance);
        System.out.println();

        desarrollador.mostrarDatos();
        desarrollador.bonos(300.0, 500.0);
        System.out.print("¿Cuál ha sido el desempeño del empleado? (1-10)\n> ");
        desempenio = entrada.nextInt();
        desarrollador.cartaDesempenio(desempenio);

        entrada.nextLine(); 

        System.out.print("¿En qué proyecto trabaja?\n> ");
        nombreProyecto = entrada.nextLine(); 

        System.out.print("¿Cuál es su avance?\n> ");
        avance = entrada.nextInt();
        desarrollador.manejoProyectos(nombreProyecto, avance);
        System.out.println();

        programador.mostrarDatos();
        programador.bonos(300.0, 500.0);
        System.out.print("¿Cuál ha sido el desempeño del empleado? (1-10)\n> ");
        desempenio = entrada.nextInt();
        programador.cartaDesempenio(desempenio);

        entrada.nextLine(); 

        System.out.print("¿En qué proyecto trabaja?\n> ");
        nombreProyecto = entrada.nextLine(); 

        System.out.print("¿Cuál es su avance?\n> ");
        avance = entrada.nextInt();
        programador.manejoProyectos(nombreProyecto, avance);
        System.out.println();

        entrada.close(); 
    }
}
