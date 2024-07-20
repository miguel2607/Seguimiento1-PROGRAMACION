package swich;

import java.util.Scanner;

public class MainEjemplo1 {
    public static void main(String[] args) {

        ejemplo1 ejemplo1 = new ejemplo1();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de camisa: ");
        ejemplo1.numerocamisa = scanner.nextInt();

        ejemplo1.elegir();


    }
}
