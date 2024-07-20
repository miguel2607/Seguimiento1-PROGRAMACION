package incrementoydecremento;

import ciclosejemplos.ejemplo1;

import java.util.Scanner;

public class MainIncrementoSuma {
    public static void main(String[] args) {

        ejemplo1 ejemplo1 = new ejemplo1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("escoge un numero de el 1 al 9");
        ejemplo1.x = scanner.nextInt();

        System.out.println(ejemplo1.obtener());

    }
}
