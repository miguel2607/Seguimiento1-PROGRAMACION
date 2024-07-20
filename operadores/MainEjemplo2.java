package operadores;

import java.util.Scanner;

public class MainEjemplo2 {
    public static void main(String[] args) {

        Ejemplo2Rest ejemplo2Rest = new Ejemplo2Rest();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        ejemplo2Rest.x = scanner.nextDouble();

        System.out.print("Ingresa otro número decimal: ");
        ejemplo2Rest.y = scanner.nextDouble();

        System.out.println(ejemplo2Rest.restaentrenumeros());
    }
}
