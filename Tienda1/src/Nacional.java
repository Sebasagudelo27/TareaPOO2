public class Nacional extends producto{
    public String registroDias;

    public Nacional(String nombre, int codigo, String registroDias) {
        super(nombre, codigo);
        this.registroDias = registroDias;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Código: " + getCodigo());
    }

}
