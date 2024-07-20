package comparacion;

import java.util.Scanner;

public class MainEjemplo3 {
    public static void main(String[] args) {

        ejemplo3 ejemplo3 = new ejemplo3();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ponga su primer numero");

        ejemplo3.numero = scanner.nextInt();

        System.out.println("ponga el mismo numero que eligio antes");
ejemplo3.numerito = scanner.nextInt();

        System.out.println(ejemplo3.obtenerresultado());

    }
}
