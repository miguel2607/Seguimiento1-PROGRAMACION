package swich;

public class ejemplo3 {


String Tipoderopa;

    public void String () {

        switch (Tipoderopa){
            case "camisa" :
                System.out.println("la ropa que eligio fue una camisa");
            break;
            case "pantalon" :
                System.out.println("la ropa que eligio fue un pantalon");
                break;
            case "medias":
                System.out.println("la ropa que eligio fue medias");
                break;
            default:
                System.out.println("no tenemos ese tipo de ropa");
        }

    }
}
