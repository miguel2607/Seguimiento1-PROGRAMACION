package TRABAJOenCLASE;

public class persona {
    public int id;
    private String nombre;

    public String MostrarNombre() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override //sobreescribir//
    public String toString() {
        return "persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
//METODOS SET Y GET_; GET PARA OBTENER Y SET PARA CARGAR EL ATRIBUO DE LA CLASE//