package ciclosejemplos;

import java.util.Scanner;

public class MainEjemplo2 {
    public static void main(String[] args) {

        ejemplo2 ejemplo2 = new ejemplo2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("elige un numero");
        ejemplo2.y = scanner.nextInt();
ejemplo2.obtenersumatoria();


    }
}
