package Entidades;

public class Alojamiento {
    protected String nombre, direccion, gerente, localidad;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String gerente, String localidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
