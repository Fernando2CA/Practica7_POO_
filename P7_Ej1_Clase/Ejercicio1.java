package mx.unam.fi.poo.g1.p7_1;
import mx.unam.fi.poo.g1.p7_1.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Se crea un objeto CuentaBanco (C/b No. CB1234) con un saldo inicial de $450");
        CuentaBanco CB1234 = new CuentaAhorro("CB1234", 450.0);
        System.out.println("Se depositan $1000 a la cuenta CB1234");
        CB1234.depositar(1000.0);
        System.out.println("Saldo nuevo: " + CB1234.getSaldo());
        System.out.println("Se retiran $600 de la cuenta CB1234");
        CB1234.retirar(600.0);
        System.out.println("Saldo nuevo: " + CB1234.getSaldo());
        System.out.println("\nCreando un objeto CuentaAhorro (C/a No.CA1001) con un saldo inicial de $300");
        CuentaAhorro CA1001 = new CuentaAhorro("CA1001", 300.0);
        System.out.println("Se intenta retirar $250...");
        CA1001.retirar(250.0);
        System.out.println("Sueldo actual: " + CA1001.getSaldo());
    }
}