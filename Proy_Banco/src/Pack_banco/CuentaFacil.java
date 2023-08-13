
package Pack_banco;


public class CuentaFacil {
    private String titular;
    private double cantidad;

    public CuentaFacil(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public CuentaFacil(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void depositar(double cantidad) {
        this.cantidad += cantidad;
    }

    public String retirar(double cantidad) {
        if (cantidad > this.cantidad) {
            return "Saldo insuficiente";
        } else {
            this.cantidad -= cantidad;
            return "retiro Exitoso";
        }
    }
}
