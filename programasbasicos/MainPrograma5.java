package programasbasicos;

import java.util.Scanner;

public class MainPrograma5 {
    public static void main(String[] args) {

        programa5 programa5 = new programa5();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija un numero mayor a 80");
        programa5.mainnnn = scanner.nextInt();

        programa5.ultimo();
    }
}
