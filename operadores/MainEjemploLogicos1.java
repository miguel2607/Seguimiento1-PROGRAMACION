package operadores;

import java.util.Scanner;

public class MainEjemploLogicos1 {
    public static void main(String[] args) {

Ejemplo4Logicos1 ejemplo4Logicos = new Ejemplo4Logicos1();

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero");

        ejemplo4Logicos.primerNumero = scanner.nextInt();

        System.out.println("ingrese el segundo numero");

        ejemplo4Logicos.segundoNumero = scanner.nextInt();

        System.out.println(ejemplo4Logicos.resultado());
    }
}
