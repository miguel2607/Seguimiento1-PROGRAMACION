package operadores;

import java.util.Scanner;

public class MainEjemploLogicos2 {
    public static void main(String[] args) {

        Ejemplo5Logicos2 ejemplo5Logicos2 = new Ejemplo5Logicos2();

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero");

        ejemplo5Logicos2.logico1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero");

        ejemplo5Logicos2.logico2 = scanner.nextInt();

        System.out.println("ingrese el tercer numero");
        ejemplo5Logicos2.logico3 = scanner.nextInt();

        System.out.println("ingrese el cuarto numero");
ejemplo5Logicos2.logico4 = scanner.nextInt();

        System.out.println(ejemplo5Logicos2.obtenerresutado());

    }
}
