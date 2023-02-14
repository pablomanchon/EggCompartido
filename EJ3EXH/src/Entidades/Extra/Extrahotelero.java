package Entidades.Extra;

import Entidades.Alojamiento;

public class Extrahotelero extends Alojamiento {
    protected boolean privado;
    protected Double m2;

    public Extrahotelero() {
    }

    public Extrahotelero(String nombre, String direccion, String gerente, String localidad, boolean privado, Double m2) {
        super(nombre, direccion, gerente, localidad);
        this.privado = privado;
        this.m2 = m2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }
}
