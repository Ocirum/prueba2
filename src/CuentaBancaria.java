public class CuentaBancaria {
    private String numeroCuenta;
    private String password;
    private double saldo;
    private String mensaje;
    private final String passwordusu = "abc123";

    //Inicialización
    public CuentaBancaria(String numeroCuenta, String password) {
        this.numeroCuenta = numeroCuenta;
        this.password = password;
        this.mensaje = "";
        this.saldo = 2000000;
    }

    //Métodos
    public boolean login() {
        boolean validacion = false;
        if (password.equals(passwordusu)) {
            validacion = true;
        }
        return validacion;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }
    public String retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            mensaje = "Retiro exitoso";
        } else {
            mensaje = "Saldo insuficiente";
        }
        return mensaje;
    }
    //Getter
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getPassword() {
        return password;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getMensaje() {
        return mensaje;
    }
}
