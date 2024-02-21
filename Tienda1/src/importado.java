public class importado extends producto{
    public String licenciaImportacion;

    public importado(String nombre, int codigo, String licenciaImportacion) {
        super(nombre, codigo);
        this.licenciaImportacion = licenciaImportacion;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Código: " + getCodigo());
    }
}
