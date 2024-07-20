package programasbasicos;

import java.util.Scanner;

public class MainPrograma3 {
    public static void main(String[] args) {

        programa3 programa3 = new programa3();
        Scanner scanner = new Scanner(System.in);

        System.out.println("escriba un numero mayor o igual a 70");
        programa3.especial = scanner.nextInt();

        programa3.result();

    }
}
