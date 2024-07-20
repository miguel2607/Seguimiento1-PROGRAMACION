package programasbasicos;

import java.util.Scanner;

public class MainPrograma1 {
    public static void main(String[] args) {

        programa1 programa1 = new programa1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija un numero");
        programa1.x = scanner.nextInt();

        programa1.mensaje();

    }
}
