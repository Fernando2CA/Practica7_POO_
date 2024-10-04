package mx.unam.fi.poo.g1.p7_1;

class CuentaBanco {
    private String numeroCuenta;
    private double saldo;
    
    public CuentaBanco(String numeroCuenta, double saldo) {
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getNumeroCUenta() {
        return this.numeroCuenta;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }
    public void retirar(double cantidad) {
        if(this.getSaldo() >= cantidad) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes...");
        }
    }
}
