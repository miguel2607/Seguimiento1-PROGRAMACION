package comparacion;

import java.util.Scanner;

public class MainEjemplo1 {
    public static void main(String[] args) {

        ejemplo1 ejemplo1 = new ejemplo1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numerito");
        ejemplo1.numero1 = scanner.nextInt();

        System.out.println("ingrese el segundo numerito");
        ejemplo1.numero2 = scanner.nextInt();

        System.out.println(ejemplo1.comparacion());

    }
}
