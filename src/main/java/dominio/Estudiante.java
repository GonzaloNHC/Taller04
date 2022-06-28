package dominio;

public class Estudiante {
    private String Nombre,rut,corre;

    public Estudiante(String nombre, String rut, String corre) {
        Nombre = nombre;
        this.rut = rut;
        this.corre = corre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorre() {
        return corre;
    }

    public void setCorre(String corre) {
        this.corre = corre;
    }
}
