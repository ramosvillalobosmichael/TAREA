package Vista;

import java.util.Scanner;
import Controlador.GestionLenguaje;
import Modelo.LenguajeProgramacion;

public class SistemaRegistro {

    // Método que muestra el menú y permite la interacción con el usuario
    public static void Menu() {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        do {
            
            
            System.out.println("""
                               Menu opciones Lenguajes
                               1.- Agregar lenguaje
                               2.- Buscar lenguaje
                               3.- Eliminar lenguaje
                               4.- Imprimir lenguajes
                               5.- Salir
                               Selecione opcion :
                               """);
            
            // capturara la opcion ingresada por teclado
            opcion = lectura.nextInt();
            lectura.nextLine();  //linea para limpieza de buffer

            switch (opcion) {
                case 1:
                    // Agregar lenguaje
                    System.out.print("Ingrese anio de creacion: ");
                    int anioCreacion = lectura.nextInt();
                    lectura.nextLine(); // Limpiar buffer

                    System.out.print("Ingrese caracteristica principal: ");
                    String caracteristicaPrincipal = lectura.nextLine();

                    System.out.print("Ingrese nombre del lenguaje: ");
                    String nombre = lectura.nextLine();

                    System.out.print("Ingrese utilizacion del lenguaje: ");
                    String utilizacion = lectura.nextLine();

                    // Llamado del metodo AgregarLenguaje()
                    GestionLenguaje.AgregarLenguaje(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
                    System.out.println("Requerimientos completos.\n");
                    break;

                case 2:
                    // Buscar lenguaje
                    System.out.print("Ingrese nombre del lenguaje a buscar: ");
                    String buscar = lectura.nextLine();

                    LenguajeProgramacion encontrado = GestionLenguaje.BuscarLenguaje(buscar);//haciendo uso de metodo BuscarLenguaje
                    if (encontrado!= null) {
                        System.out.println("Lenguaje encontrado: " + encontrado);
                    } else {
                        System.out.println("Lenguaje NO encontrado.\n");
                    }
                    break;

                case 3:
                    // Eliminar lenguaje
                    System.out.print("Ingrese nombre del lenguaje a eliminar ");
                    String eliminar = lectura.nextLine();

                    boolean eliminado = GestionLenguaje.EliminarLenguaje(eliminar);
                    if (eliminado) {
                        System.out.println("Eliminacion correcta \n");
                    } else {
                        System.out.println("Lenguaje No encontrado para eliminar.\n");
                    }
                    break;

                case 4:
                    // Imprimir lenguaje
                    System.out.println("Lista de lenguajes:");
                    GestionLenguaje.ImprimirLenguajes();
                    break;

                case 5:
                    // Opción 5: Salir
                    System.out.println("Gracias por su preferencia!");
                    break;

                default:
                    // Opción invalida
                    System.out.println("Opcion Invalida .intente denuevo \n");
            }
        } while (opcion != 5);  // El usuario elige opcion 5 sale del sistema
    }

    // Metodo main principal
    public static void main(String[] args) {
        Menu();  // Llamada del metodo Menu();
    }
}
