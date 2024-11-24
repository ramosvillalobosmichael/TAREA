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
        return "Nombre: " + Nombre + 
                ", Anio de Creacion: " + 
                AnioCreacion + ", Caracteristica Principal: " + 
                CaracteristicaPrincipal + ", Utilizacion: " + 
                Utilizacion;
    }
}
