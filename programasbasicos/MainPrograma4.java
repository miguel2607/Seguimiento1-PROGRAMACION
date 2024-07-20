package programasbasicos;

import java.util.Scanner;

public class MainPrograma4 {
    public static void main(String[] args) {

        programa4 programa4 = new programa4();
        Scanner scanner = new Scanner(System.in);

        System.out.println("escriba un nunmero decimal menor a 2.1");
        programa4.objetivo = scanner.nextDouble();

        programa4.resultObjetivo();


    }
}
