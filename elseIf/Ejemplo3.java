package elseIf;

public class Ejemplo3 {


public String tipodecomida = "pasta";

   public String tipodecomida1 = "salchipapa";

   public String tipodecomida2 = "perro";

    public String Orden() {

        if (tipodecomida.equals("pasta")){
            System.out.println("su pasta sera entregada pronto");
        } else if (tipodecomida1.equals("salchipapa")) {
            System.out.println("su salchipapa sera entregada pronto");
        } else if (tipodecomida2.equals("perro")) {
            System.out.println("su perro sera entregado pronto");
        }else {
            System.out.println("ese tipo de comida no lo tenemos");
        }
;
        return "gracias por usar nuestro servicio";
    }
}
