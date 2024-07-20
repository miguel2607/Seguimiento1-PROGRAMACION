package elseIf;

public class Ejemplo2 {

   public String nombreusuraio = " miguel ";

  public   int edadusuario = 19;

    public String verificarNombre() {

        if (nombreusuraio.equals("miguel")){
            System.out.println("bienvenido a el programa");
        }else if (edadusuario < 18){
            System.out.println("no estas bienvenido");
        }else {
            System.out.println("error");
        }
        return (nombreusuraio + edadusuario);
    }
}
