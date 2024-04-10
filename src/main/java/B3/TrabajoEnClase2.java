package B3;
import java.util.Scanner;

public class TrabajoEnClase2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();

        // Solicitar el segundo número
        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();

        // Verificar si b es cero antes de la división
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            double result = (double) a / b;
            System.out.println("El resultado de la división es: " + result);
        }
    }
}
