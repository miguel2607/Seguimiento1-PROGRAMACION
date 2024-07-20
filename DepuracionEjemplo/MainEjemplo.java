package DepuracionEjemplo;

import java.util.Scanner;

public class MainEjemplo {
    public static void main(String[] args) {

        ejemplo ejemplo = new ejemplo();
        Scanner sc = new Scanner(System.in);


        System.out.println("digite el numero a");
        ejemplo.a = sc.nextInt();

        System.out.println("elige el numero b");
        ejemplo.b = sc.nextInt();


    }
}
