package operadores;

public class Ejemplo5Logicos2 {

   public int logico1;
  public   int logico2;
public int logico3;
public int logico4;

    public int obtenerresutado() {
if (logico1 < logico2 || logico3 > logico4){
    return logico2 + logico3;
}else {
    return logico1 - logico4;
}
    }
}
