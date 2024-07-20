package incrementoydecremento;

import java.util.Scanner;

public class MainEjemplodecremento {
    public static void main(String[] args) {

        decrementoEjemplo decrementoEjemplo = new decrementoEjemplo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("elije un numero");
        decrementoEjemplo.x = scanner.nextInt();
        decrementoEjemplo.obtener();

    }
}
