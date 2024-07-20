package TRABAJOenCLASE;

import javax.swing.*;
import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {

        persona persona = new persona();

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el id");


        persona.setId(scanner.nextInt());


        persona.id = 23;

        persona.setNombre(JOptionPane.showInputDialog(null , "nombre"));

JOptionPane.showInputDialog(persona.getNombre()); //obtener nombre de la persona//

        System.out.println(persona);



        int x = 3;
        Integer y = 3;




    }


}
