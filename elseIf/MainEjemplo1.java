package elseIf;

import java.util.Scanner;

public class MainEjemplo1 {
    public static void main(String[] args) {
       Ejemplo1 ejemplo = new Ejemplo1();
        Scanner scanner = new Scanner(System.in);
        System.out.print ("cual es su edad");
      ejemplo.edad = scanner.nextInt();
      System.out.println(ejemplo.VerificarEdad());

    }


}
