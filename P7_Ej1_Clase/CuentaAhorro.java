package mx.unam.fi.poo.g1.p7_1;
import mx.unam.fi.poo.g1.p7_1.*;

class CuentaAhorro extends CuentaBanco {
    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }
    @Override
    public void retirar(double cantidad) {
        if(getSaldo() - cantidad < 100) {
            System.out.println("Se requiere un saldo de al menos $100");
        } else {
            super.retirar(cantidad);
        }
    }
}
