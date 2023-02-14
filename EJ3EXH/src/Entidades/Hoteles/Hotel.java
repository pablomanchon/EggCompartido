package Entidades.Hoteles;
//Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones.

import Entidades.Alojamiento;

public abstract class Hotel extends Alojamiento {
    protected Integer cHabitaciones, pisos, camas;
    protected Double precio;


    public Hotel(String nombre, String direccion, String gerente, String localidad, Integer cHabitaciones, Integer pisos, Integer camas, Double precio) {
        super(nombre, direccion, gerente, localidad);
        this.cHabitaciones = cHabitaciones;
        this.pisos = pisos;
        this.camas = camas;
        this.precio = precio;
    }

    public Hotel() {
    }

    public Integer getcHabitaciones() {
        return cHabitaciones;
    }

    public void setcHabitaciones(Integer cHabitaciones) {
        this.cHabitaciones = cHabitaciones;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).*/
    public abstract Double calcularPrecio();
}
