package TRABAJOenCLASE;

public class EjemploBanco {

    private int saldo = 1_000_000;

    private int retiro;

    private int depostiar;



    public int getSaldo() {
        return saldo;
    }



    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }




    public int getDepostiar() {
        return depostiar;
    }



    public void setDepostiar(int depostiar) {
        if (depostiar > 0){
            this.saldo = this.saldo + depostiar;
        }else{
            System.out.println("deposito no valido");
        }

    }







    public int getRetiro() {
        return retiro;
    }



    public void setRetiro(double retiro) {
        if (saldo > 0 && retiro < this.saldo){
            this.saldo -= retiro;
        }else {
            System.out.println("retiro no disponible");
        }

    }




    @Override
    public String toString() {
        return "EjemploBanco{" +
                "saldo=" + saldo +
                ", retiro=" + retiro +
                ", depostiar=" + depostiar +
                '}';
    }
}
