import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Nacional> productosNacionales = new ArrayList<>();
        ArrayList<importado> productosImportados = new ArrayList<>();
        int opcion = 0;
        while (opcion >= 0 && opcion < 7) {
            System.out.println("1 - Registrar productos nacionales");
            System.out.println("2 - Registrar productos importados");
            System.out.println("3 - Listar productos nacionales");
            System.out.println("4 - Listar productos importados");
            System.out.println("5 - Buscar producto nacional");
            System.out.println("6 - Buscar producto importado");
            System.out.println("0 - Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del producto nacional: ");
                    String nombreNacional = scanner.next();
                    System.out.print("Ingrese código del producto nacional: ");
                    int codigoNacional = scanner.nextInt();
                    System.out.print("Ingrese registro días del producto nacional: ");
                    String registroDias = scanner.next();
                    productosNacionales.add(new Nacional(nombreNacional, codigoNacional, registroDias));
                    break;
                case 2:
                    System.out.print("Ingrese nombre del producto importado: ");
                    String nombreImportado = scanner.next();
                    System.out.print("Ingrese código del producto importado: ");
                    int codigoImportado = scanner.nextInt();
                    System.out.print("Ingrese licencia de importación del producto importado: ");
                    String licenciaImportacion = scanner.next();
                    productosImportados.add(new importado(nombreImportado, codigoImportado, licenciaImportacion));
                    break;
                case 3:
                    System.out.println("Los productos nacionales son: ");
                    for(int i = 0; i < productosNacionales.size(); i++){
                        Nacional productoNacional = productosNacionales.get(i);
                        System.out.println("Nombre: " + productoNacional.nombre + ", Código: " + productoNacional.getCodigo() + ", Registro: " + productoNacional.registroDias);
                    }
                    break;
                case 4:
                    System.out.println("Los productos importados son: ");
                    for(int i = 0; i < productosImportados.size(); i++){
                        importado productoimportado = productosImportados.get(i);
                        System.out.println("Nombre: "+ productoimportado.nombre + ", Código: "+ productoimportado.getCodigo() + ", Licencia: " + productoimportado.licenciaImportacion);
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el Nombre del producto Nacional a buscar: ");
                    String nombreBuscarNacional = scanner.next().toLowerCase();
                    nombreBuscarNacional = nombreBuscarNacional.substring(0, 1).toUpperCase() + nombreBuscarNacional.substring(1);
                    boolean encontradoNacional = false;

                    for (Nacional producto : productosNacionales) {
                        if (producto.nombre.equals(nombreBuscarNacional)) {
                            System.out.println("¡Producto Nacional encontrado!");
                            System.out.println("Nombre: " + producto.nombre + ", Registro: " + producto.registroDias + ", Codigo: "+ producto.getCodigo());
                            encontradoNacional = true;
                            break;
                        }
                    }

                    if (!encontradoNacional) {
                        System.out.println("Producto Nacional con nombre " + nombreBuscarNacional + " no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el Nombre del producto Importado a buscar: ");
                    String nombreBuscarImportado = scanner.next().toLowerCase();
                    nombreBuscarImportado = nombreBuscarImportado.substring(0, 1).toUpperCase() + nombreBuscarImportado.substring(1);
                    boolean encontradoImportado = false;

                    for (importado producto : productosImportados) {
                        if (producto.nombre.equals(nombreBuscarImportado)) {
                            System.out.println("¡Producto Importado encontrado!");
                            System.out.println("Nombre: " + producto.nombre + ", Registro: " + producto.licenciaImportacion + ", Codigo: "+ producto.getCodigo());
                            encontradoImportado = true;
                            break;
                        }
                    }

                    if (!encontradoImportado) {
                        System.out.println("Producto Nacional con nombre " + nombreBuscarImportado + " no encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }
    }
}