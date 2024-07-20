package operadores;

public class Ejemplo4Logicos1 {

   public int primerNumero;

 public    int segundoNumero;

    public int resultado() {
        if (primerNumero > 0 && segundoNumero > 0){
           return primerNumero * segundoNumero;
        }else {
            return 0;
        }
    }
}
