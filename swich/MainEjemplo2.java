package swich;

import java.util.Scanner;

public class MainEjemplo2 {
    public static void main(String[] args) {

        ejemplo2 ejemplo2 = new ejemplo2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿dijite su nombre?");
        ejemplo2.nombre = scanner.next();

        ejemplo2.String();
    }
}
