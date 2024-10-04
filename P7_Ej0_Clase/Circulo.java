package mx.unam.fi.poo.g1.p7_0;
import mx.unam.fi.poo.g1.p7_0.*;

class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        setRadio(radio);
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return this.radio;
    }
    
    @Override
    public double area() {
        return Math.PI *   this.radio * this.radio;
    }
    
    @Override
    public String toString() {
        return "El área del circulo es: " + this.area();
    }
}