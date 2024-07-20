package swich;

import java.util.Scanner;

public class MainEjemplo3 {
    public static void main(String[] args) {

        ejemplo3 ejemplo3 = new ejemplo3();

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿que tipo de ropa quiere elegir? (camisa, pantalon, medias)");
        ejemplo3.Tipoderopa =scanner.next();

        ejemplo3.String();


    }
}
