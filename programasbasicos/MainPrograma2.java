package programasbasicos;

import java.util.Scanner;

public class MainPrograma2 {
    public static void main(String[] args) {


        programa2 programa2 = new programa2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("elija un numero menor a 4");
        programa2.y = scanner.nextInt();

        programa2.r();

    }
}
