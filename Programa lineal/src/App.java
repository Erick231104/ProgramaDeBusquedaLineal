import java.util.Scanner;

public class App {

    private static String[] productos = new String[10];
    private static boolean[] disponible = new boolean[10];

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try (Scanner op = new Scanner (System.in)) {
            for(int i = 0; i < 10; i++) {
                 productos[i] = "";
                disponible[i] = false;
              }

              System.out.println("Ingrese los productos(Escriba salir para finalizar)");
              while (true) {
                 System.out.println("Escriba el nombre del producto");
                 String productoNombre = op.nextLine();
                 if (productoNombre.equals("Salir")) {
                      break;
                 }
                  registreProducto(productoNombre);
             }

               //Registrar los productos
               System.out.println( "Busque productos( Escriba salir para finalizar)");
               while (true) {
                System.err.println("Ingrese el nombre del producto: ");
                String productoNombre = op.nextLine();
                  if (productoNombre.equals("salir")) {
                      break;
                  }
                  buscarProducto(productoNombre);

               }
        }
    }

    private static void registreProducto(String productoNombre) {
        for (int i = 0; i < 10; i++) {
            if (productos[i].equals("")) {
                productos[i] = productoNombre;
                disponible[i] = true;
                System.out.println("Producto registrado y disponible");
                break;
            } else {
                System.out.println("El producto ya esta registrado");
                
            }

        }
        System.out.println("Producto registrado");
    }

    private static void buscarProducto(String productoNombre) {
        for (int i = 0; i < 10; i++) {
            if (productos[i].equals(productoNombre)) {
                if (disponible[i]) {
                    System.out.println("El producto esta disponible");
                } else {
                    System.out.println("El producto no esta disponible");
                }
                return;
            }
        }
        System.out.println("El producto no esta registrado");
    }


}

// Nombre: Erick Mateo Sequeira Centeno
//Numero de carnet: 2024-1660U
