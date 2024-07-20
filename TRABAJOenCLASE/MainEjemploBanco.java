package TRABAJOenCLASE;

import java.util.Scanner;

public class MainEjemploBanco {
    public static void main(String[] args){

    EjemploBanco banco = new EjemploBanco();

        Scanner sc = new Scanner(System.in);

       EjemploBanco cuenta = new EjemploBanco();

        System.out.println("¿What do you want to do today? (1: withdraw money , 2: deposit money, 3: Check my credit )");

    int opccion = sc.nextInt();
    switch (opccion){

        case 1:

            System.out.println("ingrese la cantidad a retirar");
double saldito = sc.nextDouble();

banco.setRetiro(saldito);
            System.out.println("retiro realizado,  saldo actual : " + banco.getSaldo());
             break;

        case 2:
            System.out.println("cuanto dinero quiere depositar");

            int newsueldo = sc.nextInt();

            banco.setDepostiar(newsueldo);

            System.out.println("deposito realizado, saldo actual " + banco.getSaldo());
            break;

        case 3:
            System.out.println("saldo actual " + banco.getSaldo());
            break;
        default:
            System.out.println("accion no realizada");
    }









    }



}


