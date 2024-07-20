package operadores;

import java.util.Scanner;

public class MainEjemplo1 {
    public static void main(String[] args) {
Ejemplo1Sum ejemplo1 = new Ejemplo1Sum();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        ejemplo1.numero1 = scanner.nextInt();

        System.out.print("Ingresa otro número entero: ");
        ejemplo1.numero2 = scanner.nextInt();

        System.out.println(ejemplo1.obtenersuma());
    }
}
