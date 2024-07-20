package ciclobrake;

import java.util.Scanner;

public class MainEjemplo {
    public static void main(String[] args) {
        ejemplo ejemplo = new ejemplo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿cual es su nombre?");
        ejemplo.saludo = scanner.next();

        ejemplo.String();
    }
}
