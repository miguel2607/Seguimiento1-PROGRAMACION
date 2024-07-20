package sumas;

import javax.swing.*;
import java.util.Scanner;

public class MainSumas {
    public static void main(String[] args) {

        Sumas suma = new Sumas();

        //Scanner scanner = new Scanner(System.in);

        //System.out.print("Ingresa un número entero: ");
        //suma.numero1 = scanner.nextInt();

        //System.out.print("Ingresa un número entero: ");
        //suma.numero2 = scanner.nextInt();

        String num1 = JOptionPane.showInputDialog(null, "Por favor, introduce tu edad:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        suma.numero1 = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog(null, "Por favor, introduce tu edad:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        suma.numero2 = Integer.parseInt(num2);

        System.out.println(suma.sumaDeNumeros());

    }
}
