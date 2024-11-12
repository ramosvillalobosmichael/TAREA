public class ColeccionNombres {
    private static int FACTOR_CRECIMIENTO=2;
    private static String[] nombres=new String[FACTOR_CRECIMIENTO];
    private static int contadorNombres=0;

    public static void agregar(String nuevoNombre){
        if(contadorNombres==nombres.length){
            String[] nombresAux=new String[nombres.length*FACTOR_CRECIMIENTO];
            for(int i=0;i<nombres.length;i++){
                nombresAux[i]=nombres[i];
            }
            nombres=nombresAux;
        }
        nombres[contadorNombres]=nuevoNombre;
        contadorNombres++;
    }

    //public static void agregar(String[] nuevosNombres){
      ////    agregar(nuevosNombres[i]);
        //}
    //}

    public static void agregar(String... values){
        for(String value:values){
            agregar(value);
        }
    }

    public static void mostrarNombres(){
        System.out.println("Nombres:");
        for(int i=0;i<contadorNombres;i++){
            System.out.println(nombres[i]);
        }
    }

    public static void eliminar(String nombreBuscado,boolean ignorarMayusculaMinuscula,boolean eliminarTodasOcurrencias){
        for(int i=0;i<contadorNombres;i++){
            if(ignorarMayusculaMinuscula){
                if(nombres[i].equalsIgnoreCase(nombreBuscado)){
                    nombres[i]=null;
                    if(!eliminarTodasOcurrencias){
                        break;
                    }
                }
            }else{
                if(nombres[i].equals(nombreBuscado)){
                    nombres[i]=null;
                    if(!eliminarTodasOcurrencias){
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        //ColeccionNombres cn=new ColeccionNombres();
        ColeccionNombres.agregar("Juan");
        ColeccionNombres.agregar("Pedro");
        ColeccionNombres.agregar("Maria");
        ColeccionNombres.agregar("Ana");
        ColeccionNombres.agregar("Luis");
        ColeccionNombres.agregar("Carlos");
        ColeccionNombres.agregar("Sofia");
        ColeccionNombres.agregar("Ana");

        ColeccionNombres.agregar("Juan","Pedro","Maria","Ana","Luis","Carlos","Sofia");

        ColeccionNombres.mostrarNombres();

        System.out.println("Eliminar Ana");
        ColeccionNombres.eliminar("AnA",true,true);
        ColeccionNombres.mostrarNombres();

    }

}
