public class producto {
    String nombre;
    private int codigo;

    public producto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void buscar(int codigo){

    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Código: " + codigo);
    }

}
