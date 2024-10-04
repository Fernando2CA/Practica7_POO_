package mx.unam.fi.poo.g1.p7;
import mx.unam.fi.poo.g1.p7.*;

/**
 * Clase Desarrollador que extiende(hereda) la clase Empleado.
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class Desarrollador extends Empleado {

    /**
     * Constructor para crear un Empleado Desarrollador.
     * @param nombre -> Atributo para el nombre del Desarrollador.
     * @param direccion -> Atributo para la dirección del Desarrollador.
     * @param salario -> Atributo para el salario del Desarrollador.
     * @param nomTrabajo -> Atributo para el nombre del trabajo del Desarrollador.
     */
    public Desarrollador(String nombre, String direccion, double salario, String nomTrabajo){
        super(nombre, direccion, salario, nomTrabajo);
    }

    /**
     * Método que aplica un bono especial al salario del Desarrollador así como los bonos adicionales.
     * @param bono1 -> Primer bono adicional por trabajar cierta cantidad de horas extras.
     * @param bono2 -> Segundo bono adicional por trabajar cierta cantidad de horas extras.
     */
    @Override
    public void bonos(double bono1, double bono2){
        System.out.println("Al finalizar el mes, su bono por ser Desarrollador es del 9% del salario");
        System.out.print("Salario inicial sin bono: " + getSalario() + "\n");
        setSalario(getSalario() + (getSalario() * 0.09));
        System.out.println("Salario despues del bono: " + getSalario());
        System.out.println();

        super.bonos(bono1, bono2);
    }

    /**
     * Método que genera un informe de desempeño personalizado para el Desarrollador basado en un rango numérico.
     * Dependiendo del valor del desempeño, se clasifica para el reporte. 
     * @param desempenio -> Calificación del desempeño del Desarrollador entre 1-10.
     */
    @Override
    public void cartaDesempenio(int desempenio){
        String reporte;

        if (desempenio >= 1 && desempenio <= 6) {
            reporte = "Bajo rendimiento. Se recomienda capacitacion continua y mejor gestion del tiempo.";
        } else if (desempenio > 6 && desempenio <= 8) {
            reporte = "Buen desempeño. Sin embargo, se sugiere colaborar mas con el equipo de trabajo.";
        } else if (desempenio > 8 && desempenio <= 10) {
            reporte = "Excelente desempeño. Se ha demostrado un gran rendimiento y trabajo en equipo.";
        } else {
            reporte = "El rango del desempeño es de 1-10...";
        } 

        System.out.println(getNombre() + ": " + reporte);

        super.cartaDesempenio(desempenio);
    }

    /**
     * Método que gestiona los proyectos del Desarrollador.
     * Dependiendo del avance del proyecto (de 1 a 10), se proporcionan 
     * felicitaciones o posibles mejoras.
     * @param nombreProyecto -> Nombre del proyecto en el que está trabajando el Desarrollador.
     * @param avance -> Avance del proyecto, en un rango del 1 al 10.
     */
    @Override
    public void manejoProyectos(String nombreProyecto, int avance){
        super.manejoProyectos(nombreProyecto, avance);

        if (avance > 0 && avance <= 5){
            System.out.println("Se recomienda una mejor organizacion y planificacion del tiempo...");
        } else if(avance >= 6 && avance <=10){
            System.out.println("Todo bien, Continue con el buen trabajo...");
        } else {
            System.out.println("Fuera de rango...");
        }
    }

    /**
     * Método que muestra los datos del Desarrollador.
     */
    @Override
    public void mostrarDatos(){
        System.out.println("--- Datos del Desarrollador ---");
        super.mostrarDatos();    
    }
}