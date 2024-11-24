package Controlador;
import Modelo.LenguajeProgramacion;

public class GestionLenguaje {
    // AtributOS
    private static final int FACTOR_CRECIMIENTO = 2;  //una constante con valor 2 
    private static int ContadorLenguajes = 0;        // contador inicializado en 0 ,sabe cuantos lenguajes se han ingresado
    private static LenguajeProgramacion  [] ArregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];//arreglo de objetos tipo LenguajeProgramacion[]

    // Metodo para agregar un lenguaje
    public static void AgregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {//metodo agrega nuevo objeto
        // Verifica si el arreglo está lleno y lo expande si es necesario
        if (ContadorLenguajes == ArregloLenguajes.length) {//comienza en 0 y si ellga a 2 copiara a otro arreglo
            // Crear arreglo con mas espacio
            LenguajeProgramacion[] copiaArreglo = new LenguajeProgramacion[ArregloLenguajes.length + FACTOR_CRECIMIENTO];//ahora tendra 4
            // Copiar los elementos al copiaArreglo
            System.arraycopy(ArregloLenguajes, 0, copiaArreglo, 0, ArregloLenguajes.length);//se hara copia de ArregloLenguajes a copiaArreglo
            ArregloLenguajes = copiaArreglo;  // Actualizar el estado de copiaArreglo
            
        }
        //******
        // Crea nuevo lenguaje y agrega al arreglo
        ArregloLenguajes[ContadorLenguajes] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
        ContadorLenguajes++;  // incrementa contador
    }

    // Método para busqueda de un lenguaje por nombre
    public static LenguajeProgramacion BuscarLenguaje(String nombre) {//mediante el nombre
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].GetNombre().equalsIgnoreCase(nombre)) {//getnombre del objeto LenguajeProgramacion
                return ArregloLenguajes[i];  // retorna lenguaje encontrado , retorna un objeto de tipo LenguajePorgramacion
            }
        }
        return null;  // retorna nullr
    }

    // Método para elimnacion de un lenguaje por nombre
    public static boolean EliminarLenguaje(String nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].GetNombre().equalsIgnoreCase(nombre)) {//si ha encontrado esta instruccion sigue el for
                for (int j = i; j < ContadorLenguajes - 1; j++) {//esta linea de codigo desplaza elementos a la izquierda
                    ArregloLenguajes[j] = ArregloLenguajes[j + 1];
                }
                ArregloLenguajes[ContadorLenguajes - 1] = null;  // Eliminar la referencia al último elemento.
                ContadorLenguajes--;  // decrementa contador en uno
                return true;  // Lenguaje eliminado correctamente/
            }
        }
        return false;  // si no encuentra, no elimina
    }

    // Método que retorna el arreglo completo de lenguajes
    public static LenguajeProgramacion[] GetArregloLenguajes() {//retornar los arreglos almacenados en ArregloLenguajes de tipo lenguajeprogramacion
        return ArregloLenguajes;  //solo acceso mas no modificacion
    }

    // Método que imprime elementos del arreglo
    public static void ImprimirLenguajes() {
        LenguajeProgramacion[] imprelenguaje= GetArregloLenguajes();  // Obtener el arreglo de lenguajes usando el metodo GetArregloLenguajes
        for (LenguajeProgramacion forlenguaje : imprelenguaje) {
            if (forlenguaje != null) {  // Solo imprimir si el lenguaje no es null
                System.out.println(forlenguaje);  // Imprimir la representación del objeto
            }
        }
    }
}
