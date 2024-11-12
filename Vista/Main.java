import java.util.Random;

public class Main {
    public static Random generador;

    private void generarArreglos(int[] arrNotas,String[] arrNombres){
        generador = new Random();
        for (int i = 0; i < arrNotas.length; i++) {
            arrNotas[i] = generador.nextInt(20);
            arrNombres[i] = "Estudiante "+(i+1);
        }
    }

    private void imprimirArreglos(int[] arrNotas,String[] arrNombres){
        System.out.println("Nombres y Notas de los estudiantes");
        for (int i = 0; i < arrNotas.length; i++) {
            System.out.println(arrNombres[i]+" : "+arrNotas[i]);
        }
    }


    private void imprimirNotaMayor(int[] arrNotas,String[] arrNombres){
        int mayor=0;
        for(int i=0;i<arrNotas.length;i++){
            if(arrNotas[i]>mayor){
                mayor=arrNotas[i];
            }
        }

        System.out.println("Estudiantes con la nota mayor");

        for(int i=0;i<arrNotas.length;i++){
            if(arrNotas[i]==mayor){
                System.out.println(arrNombres[i]+" : "+arrNotas[i]);
            }
        }
    }


    private void imprimirNotaMenor(int[] arrNotas,String[] arrNombres){
        int menor=20;
        for(int i=0;i<arrNotas.length;i++){
            if(arrNotas[i]<menor){
                menor=arrNotas[i];
            }
        }

        System.out.println("Estudiantes con la nota menor");

        for(int i=0;i<arrNotas.length;i++){
            if(arrNotas[i]==menor){
                System.out.println(arrNombres[i]+" : "+arrNotas[i]);
            }
        }
    }

    public static void main(String[] args) {
        Main principal=new Main();
        int[] arrNotas = new int[20];
        String[] arrNombres = new String[20];

        principal.generarArreglos(arrNotas,arrNombres);
        principal.imprimirArreglos(arrNotas,arrNombres);
        principal.imprimirNotaMayor(arrNotas,arrNombres);
        principal.imprimirNotaMenor(arrNotas,arrNombres);
    }
}
