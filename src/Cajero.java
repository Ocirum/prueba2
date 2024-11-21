import java.util.Scanner;

public class Cajero {
    public Scanner scanner;
    //Hola
    public void menu() {
        scanner = new Scanner(System.in);
        System.out.println("Digite la clave");
        String clave = scanner.next();
        CuentaBancaria cuentaBancaria = new CuentaBancaria("12221", clave);
        if (!cuentaBancaria.login()) {
            System.out.println("Clave incorrecta");
            System.exit(0);
        }
        while (true) {
            System.out.println("Por favor selecciones la opción");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            String opc = scanner.next();
            switch (opc) {
                case "1":
                    System.out.println("Su saldo es: " + cuentaBancaria.getSaldo());
                    System.exit(0);
                    break;
                case "2":
                    System.out.println("Cuanto deseas depositar?");
                    double deposito = scanner.nextDouble();
                    cuentaBancaria.depositar(deposito);
                    System.exit(0);
                    break;
                case "3":
                    System.out.println("Cuanto deseas retirar?");
                    double retiro = scanner.nextDouble();
                    cuentaBancaria.retirar(retiro);
                    System.out.println(cuentaBancaria.getMensaje());
                    System.exit(0);
                    break;
                case "4":
                    System.out.println("Gracias por usar nuestro cajero");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
