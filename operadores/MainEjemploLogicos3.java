package operadores;

import java.util.Scanner;

public class MainEjemploLogicos3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        Ejemplo6Logicos3 ejemplo6Logicos3 = new Ejemplo6Logicos3();

        System.out.print("Ingrese el valor de mbbappe: ");
        ejemplo6Logicos3.mbbappe = scanner.nextInt();

        System.out.print("Ingrese el valor de messi: ");
        ejemplo6Logicos3.messi = scanner.nextInt();

        System.out.println(ejemplo6Logicos3.tenerResultado());

    }
}
