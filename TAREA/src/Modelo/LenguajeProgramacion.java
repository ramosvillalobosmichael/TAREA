package Modelo;

public class LenguajeProgramacion {
    private int AnioCreacion;
    private String CaracteristicaPrincipal;
    private String Nombre;
    private String Utilizacion;

    // Constructor
    public LenguajeProgramacion(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        this.AnioCreacion = anioCreacion;
        this.CaracteristicaPrincipal = caracteristicaPrincipal;
        this.Nombre = nombre;
        this.Utilizacion = utilizacion;
    }

    // metodos getters y setters
    public int GetAnioCreacion() {
        return AnioCreacion;
    }

    public void SetAnioCreacion(int anioCreacion) {
        this.AnioCreacion = anioCreacion;
    }

    public String GetCaracteristicaPrincipal() {
        return CaracteristicaPrincipal;
    }

    public void SetCaracteristicaPrincipal(String caracteristicaPrincipal) {
        this.CaracteristicaPrincipal = caracteristicaPrincipal;
    }

    public String GetNombre() {
        return Nombre;
    }

    public void SetNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String GetUtilizacion() {
        return Utilizacion;
    }

    public void SetUtilizacion(String utilizacion) {
        this.Utilizacion = utilizacion;
    }

    // Override de toString()
    @Override
   public String toString() {
   
    String ast = "***************************************************************************";
    String cabeza = "* %-30s -> %-38s *"; // Formato para las columnas

    // El retorno del toString con formato en ASCII
    return ast + "\n" +
           "|                   Lenguaje de Programacion             |\n" +
           ast+ "\n" +
            
          
            
            
           String.format(cabeza, " Nombre", Nombre) + "\n" +
           String.format(cabeza, " Anio de Creacion", AnioCreacion) + "\n" +
           String.format(cabeza, " Caracteristica Principal", CaracteristicaPrincipal) + "\n" +
           String.format(cabeza, " Utilizacion", Utilizacion) + "\n" +
           ast;
    }
}
