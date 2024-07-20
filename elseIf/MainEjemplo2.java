package elseIf;

import java.util.Scanner;

public class MainEjemplo2 {
    public static void main(String[] args) {
        Ejemplo2 ejemplo2 = new Ejemplo2();
        Scanner scanner = new Scanner(System.in);
        System.out.print ("cual es su nombre");
        ejemplo2.nombreusuraio = scanner.next();
        System.out.print ("cual es su edad");
        ejemplo2.edadusuario = scanner.nextInt();
        System.out.println(ejemplo2.verificarNombre());

    }
}
