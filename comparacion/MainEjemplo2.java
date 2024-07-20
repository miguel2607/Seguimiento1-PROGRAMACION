package comparacion;

import java.util.Scanner;

public class MainEjemplo2 {
    public static void main(String[] args) {

        ejemplo2 ejemplo2 = new ejemplo2();
        Scanner scanner = new Scanner(System.in);


        System.out.println("ingrese el numero ");

        ejemplo2.numero2 = scanner.nextInt();

        System.out.println(ejemplo2.obtenerComparacion());
    }
}
