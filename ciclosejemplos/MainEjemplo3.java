package ciclosejemplos;

import java.util.Scanner;

public class MainEjemplo3 {
    public static void main(String[] args) {

ejemplo3 ejemplo3 = new ejemplo3();

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero");
        ejemplo3.x = scanner.nextInt();

        ejemplo3.Resultado();
    }
}
