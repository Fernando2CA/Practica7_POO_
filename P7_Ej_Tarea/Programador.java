package mx.unam.fi.poo.g1.p7;
import mx.unam.fi.poo.g1.p7.*;

/**
 * Clase Programador que extiende(hereda) la clase Empleado.
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class Programador extends Empleado {

    /**
     * Constructor para crear un Empleado Programador.
     * @param nombre -> Atributo para el nombre del Programador.
     * @param direccion -> Atributo para la dirección del Programador.
     * @param salario -> Atributo para el salario del Programador.
     * @param nomTrabajo -> Atributo para el nombre del trabajo del Programador.
     */
    public Programador(String nombre, String direccion, double salario, String nomTrabajo){
        super(nombre, direccion, salario, nomTrabajo);
    }

    /**
     * Método que aplica un bono especial al salario del Programador así como los bonos adicionales.
     * @param bono1 -> Primer bono adicional por trabajar cierta cantidad de horas extras.
     * @param bono2 -> Segundo bono adicional por trabajar cierta cantidad de horas extras.
     */
    @Override
    public void bonos(double bono1, double bono2){
        System.out.println("Al finalizar el mes, su bono por ser Programador es del 7% del salario");
        System.out.print("Salario inicial sin bono: " + getSalario() + "\n");
        setSalario(getSalario() + (getSalario() * 0.07));
        System.out.println("Salario despues del bono: " + getSalario());
        System.out.println();

        super.bonos(bono1, bono2);
    }

    /**
     * Método que genera un informe de desempeño personalizado para el Programador basado en un rango numérico.
     * Dependiendo del valor del desempeño, se clasifica para el reporte. 
     * @param desempenio -> Calificación del desempeño del Programador entre 1-10.
     */
    @Override
    public void cartaDesempenio(int desempenio){
        String reporte;

        if (desempenio >= 1 && desempenio <= 6) {
            reporte = "Bajo rendimiento. Se recomienda resolver los problemas tecnicos y hacer revisiones constantes.";
        } else if (desempenio > 6 && desempenio <= 8) {
            reporte = "Buen desempeño. Sin embargo, se sugiere poner mas atencion a los detalles.";
        } else if (desempenio > 8 && desempenio <= 10) {
            reporte = "Excelente desempeño. Se ha demostrado un gran rendimiento y un trabajo impecable.";
        } else {
            reporte = "El rango del desempeño es de 1-10...";
        } 

        System.out.println(getNombre() + ": " + reporte);

        super.cartaDesempenio(desempenio);
    }

    /**
     * Método que gestiona los proyectos del Programador.
     * Dependiendo del avance del proyecto (de 1 a 10), se proporcionan 
     * felicitaciones o posibles mejoras.
     * @param nombreProyecto -> Nombre del proyecto en el que está trabajando el Programador.
     * @param avance -> Avance del proyecto, en un rango del 1 al 10.
     */
    @Override
    public void manejoProyectos(String nombreProyecto, int avance){
        super.manejoProyectos(nombreProyecto, avance);

        if (avance > 0 && avance <= 5){
            System.out.println("Se recomienda un mejor uso de tiempo y recursos...");
        } else if(avance >= 6 && avance <=10){
            System.out.println("Todo bien, Continue con el buen trabajo...");
        } else {
            System.out.println("Fuera de rango...");
        }
    }

    /**
     * Método que muestra los datos del Programador.
     */
    @Override
    public void mostrarDatos(){
        System.out.println("--- Datos del Programador ---");
        super.mostrarDatos();    
    }
}