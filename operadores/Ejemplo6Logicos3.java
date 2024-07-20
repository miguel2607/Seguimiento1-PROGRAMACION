package operadores;

public class Ejemplo6Logicos3 {

   public int mbbappe;
   public int messi;

    public int tenerResultado() {

        if (!(mbbappe <= 0 || messi <= 0)){
            return mbbappe +messi;
        }else {
            return 0;
        }
    }
}
