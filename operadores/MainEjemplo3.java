package operadores;

import java.util.Scanner;

public class MainEjemplo3 {
    public static void main(String[] args) {

        Ejemplo3Multi ejemplo3Multi = new Ejemplo3Multi();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número  largo: ");
        ejemplo3Multi.r = scanner.nextLong();

        System.out.print("Ingresa otro número  largo: ");
        ejemplo3Multi.e = scanner.nextLong();

        System.out.println(ejemplo3Multi.resultadoDecimalLargo());

    }
}
