package elseIf;

public class Ejemplo1 {

   public int edad = 18;

    public int VerificarEdad () {


        if (edad < 18) {
            System.out.println("No puede ingresar");
        } else {
            System.out.println("Puede ingresar");
        }
        return edad;
    }
}

