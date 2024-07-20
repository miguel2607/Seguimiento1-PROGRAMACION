package elseIf;

import java.util.Scanner;

public class MainEjemplo3 {
    public static void main(String[] args) {

        Ejemplo3 ejemplo3 = new Ejemplo3();

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿cual es su orden ?  ( pasta , perro ,  salchipapa) Dijitelo 3 veces ");

        ejemplo3.tipodecomida = scanner.next();
        ejemplo3.tipodecomida1 = scanner.next();
        ejemplo3.tipodecomida2 = scanner.next();

        System.out.println(ejemplo3.Orden());

    }
}
