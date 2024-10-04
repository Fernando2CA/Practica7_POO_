package mx.unam.fi.poo.g1.p7;
import java.util.Scanner;

/**
 * Clase Empleado
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class Empleado {
    private String nombre;
    private String direccion;
    private double salario;
    private String nomTrabajo;

    /**
     * Método constructor
     * Para construir objetos Empleado.
     * @param nombre -> Atributo para el nombre del empleado.
     * @param direccion -> Atributo para la direccion del empleado.
     * @param salario -> Atributo para el salario del empleado.
     * @param nomTrabajo -> Atributo para el nombre de trabajo del empleado.
     */
    public Empleado(String nombre, String direccion, double salario, String nomTrabajo){
        setNombre(nombre);
        setDireccion(direccion);
        setSalario(salario);
        setNomTrabajo(nomTrabajo);
    }

    /**
     * Método set
     * @param nombre -> Para asignar el nombre del empleado.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método get
     * @return nombre -> Regresa el atributo nombre del empleado.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Método set
     * @param direccion -> Para asignar la direccion del empleado.
     */
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    /**
     * Método get
     * @return direccion -> Regresa el atributo direccion del empleado.
     */
    public String getDireccion(){
        return this.direccion;
    }

    /**
     * Método set
     * @param salario -> Para asignar el salario del empleado.
     */
    public void setSalario(double salario){
        this.salario = salario;
    }

    /**
     * Método get
     * @return salario -> Regresa el atributo salario del empleado.
     */
    public double getSalario(){
        return this.salario;
    }

    /**
     * Método set
     * @param nomTrabajo -> Para asignar el nombre de trabajo del empleado.
     */
    public void setNomTrabajo(String nomTrabajo){
        this.nomTrabajo = nomTrabajo;
    }

    /**
     * Método get
     * @return nomTrabajo -> Regresa el atributo nombre de trabajo del empleado.
     */
    public String getNomTrabajo(){
        return this.nomTrabajo;
    }

    /**
     * Método que calcula los bonos dependiendo de las horas extras trabajadas.
     * @param bono1 -> Bono asignado por trabajar entre 1 y 3 horas extras.
     * @param bono2 -> Bono asignado por trabajar entre 4 y 5 horas extras.
     */
    public void bonos(double bono1, double bono2){  
        Scanner entrada = new Scanner(System.in);
        int hAdicionales;
    
        System.out.print("¿Ha trabajado horas adicionales?(S/N)\n> "); 
        String respuesta = entrada.next();

        if (respuesta.compareToIgnoreCase("S") == 0){
            System.out.print("¿Cuantas horas extra se quedó?\n> ");
            hAdicionales = entrada.nextInt();
    
            if (hAdicionales >= 1 && hAdicionales <= 3){
                System.out.println("Su bono es de $300...");
                this.salario += bono1;
                System.out.println("Salario final: " + this.getSalario());
                System.out.println();
            } else if(hAdicionales > 3 && hAdicionales <= 5){
                System.out.println("Gran desempeño!, su bono es de $500...");
                this.salario += bono2;
                System.out.println("Salario final: " + this.getSalario());
                System.out.println();
            } else{
                System.out.println("Cantidad de horas inválida...\n");
                System.out.println();
            }
        } else {
            System.out.println("No horas extras, no bono:(");
            System.out.println("Salario final: " + this.getSalario());
            System.out.println();
        }
    }
    
    /**
     * Método que genera un informe de desempeño basado en un rango numérico.
     * Dependiendo del valor del desempeño, se clasifica para el reporte.
     * @param desempenio -> Calificación del desempeño del empleado entre 1-10.
     */
    public void cartaDesempenio(int desempenio) {

        String reporte1 = "Desempeño general:\nHa superado las expectativas al alcanzar un desempeño en el rango de 9-10 de los objetivos establecidos.\nAdemás, ha demostrado excelentes habilidades de comunicación, recibiendo comentarios positivos en el 98%\nde las encuestas de satisfacción.";
        String reporte2 = "Desempeño general:\nHa cumplido con los objetivos en el rango de 7-8. Ha demostrado una actitud proactiva al asumir\nresponsabilidades adicionales y ha cumplido con todos los plazos de los proyectos asignados.\nSin embargo, se ha identificado la necesidad de mejorar la calidad de los reportes, ya que algunos\nhan requerido correcciones.";
        String reporte3 = "Desempeño general:\nHa tenido un bajo rendimiento, cumpliendo solo en el rango de 1-6 de los objetivos establecidos.\nHa mostrado dificultades en la gestión del tiempo, lo que ha resultado en varios proyectos\nentregados con retraso. Además, ha recibido comentarios negativos sobre la falta de colaboración\nen tareas grupales.";

        if (desempenio >= 1 && desempenio <= 6) {
            System.out.println(this.nombre + " " + reporte3);
            System.out.println();
        } else if (desempenio > 6 && desempenio <= 8) {
            System.out.println(this.nombre + " " + reporte2);
            System.out.println();
        } else if (desempenio > 8 && desempenio <= 10) {
            System.out.println(this.nombre + " " + reporte1);
            System.out.println();
        } else {
            System.out.println("El rango del desempeño es de 1-10...");
            System.out.println();
        }
    }

    /**
     * Método que muestra información sobre el proyecto en el que está trabajando el empleado, así como su avance.
     * @param nombreProyecto -> Nombre del proyecto en el que está trabajando el empleado.
     * @param avance -> Avance del proyecto, en un rango del 1 al 10.
     */
    public void manejoProyectos(String nombreProyecto, int avance){
        System.out.println(this.nombre + " esta trabajando en el proyecto: " + nombreProyecto);
        System.out.println("Avance del proyecto: " + avance + " de 10");
    }

    /**
     * Método que imprime los datos de cada empleado.
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Salario: $" + this.getSalario());
        System.out.println("Nombre del Trabajo: " + this.getNomTrabajo());
        System.out.println();
    }
}
