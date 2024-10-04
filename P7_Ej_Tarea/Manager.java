package mx.unam.fi.poo.g1.p7;
import mx.unam.fi.poo.g1.p7.*;

/**
 * Clase Manager que extiende(hereda) la clase Empleado.
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class Manager extends Empleado {

    /**
     * Constructor para crear un Empleado Manager.
     * 
     * @param nombre -> Atributo para el nombre del Manager.
     * @param direccion -> Atributo para la dirección del Manager.
     * @param salario -> Atributo para el salario del Manager.
     * @param nomTrabajo -> Atributo para el nombre del trabajo del Manager.
     */
    public Manager(String nombre, String direccion, double salario, String nomTrabajo){
        super(nombre, direccion, salario, nomTrabajo);
    }

    /**
     * Método que aplica un bono especial al salario del Manager así como los bonos adicionales.
     * @param bono1 -> Primer bono adicional por trabajar cierta cantidad de horas extras.
     * @param bono2 -> Segundo bono adicional por trabajar cierta cantidad de horas extras.
     */
    @Override
    public void bonos(double bono1, double bono2){

        System.out.println("Al finalizar el mes, su bono por ser Proyect Manager es del 5% del salario");
        System.out.print("Salario inicial sin bono: " + getSalario() + "\n");
        setSalario(getSalario() + (getSalario() * 0.05));
        System.out.println("Salario despues del bono: " + getSalario());
        System.out.println();

        super.bonos(bono1, bono2);
    }

    /**
     * Método que genera un informe de desempeño personalizado para el Manager basado en un rango numérico.
     * Dependiendo del valor del desempeño, se clasifica para el reporte. 
     * @param desempenio -> Calificación del desempeño del Manager entre 1-10.
     */
    @Override
    public void cartaDesempenio(int desempenio){
        String reporte;

        if (desempenio >= 1 && desempenio <= 6) {
            reporte = "Bajo rendimiento. Se recomienda mejorar la gestión del equipo.";
        } else if (desempenio > 6 && desempenio <= 8) {
            reporte = "Buen desempeño. Sin embargo, se sugiere mejorar la comunicación con el equipo.";
        } else if (desempenio > 8 && desempenio <= 10) {
            reporte = "Excelente desempeño. Se ha demostrado un gran liderazgo y éxito en los proyectos.";
        } else {
            reporte = "El rango del desempeño es de 1-10...";
        } 

        System.out.println(getNombre() + ": " + reporte);

        super.cartaDesempenio(desempenio);
    }

     /**
     * Método que gestiona los proyectos del Manager.
     * Dependiendo del avance del proyecto (de 1 a 10), se proporcionan 
     * felicitaciones o posibles mejoras.
     * @param nombreProyecto -> Nombre del proyecto en el que está trabajando el Manager.
     * @param avance -> Avance del proyecto, en un rango del 1 al 10.
     */
    @Override
    public void manejoProyectos(String nombreProyecto, int avance){
        super.manejoProyectos(nombreProyecto, avance);

        if (avance > 0 && avance <= 5){
            System.out.println("Se recomienda una mejor comunicacion y priorizacion de tareas...");
        } else if(avance >= 6 && avance <=10){
            System.out.println("Todo bien, tu y tu equipo sigan asi...");
        } else {
            System.out.println("Fuera de rango...");
        }
    }

    /**
     * Método que muestra los datos del Manager.
     */
    @Override
    public void mostrarDatos(){
        System.out.println("--- Datos del Proyect Manager ---");
        super.mostrarDatos();    
    }
}

