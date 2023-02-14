package Entidades.Hoteles;

import Enums.Gym;
import Enums.Restaurante;

public class Hotel4 extends Hotel {
    protected Gym gimnasio;
    protected String nombreRes;
    protected Integer capacidadR;

    public Hotel4() {
    }

    public Hotel4(String nombre, String direccion, String gerente, String localidad, Integer cHabitaciones, Integer pisos, Integer camas, Double precio, Gym gimnasio, String nombreRes, Integer capacidadR) {
        super(nombre, direccion, gerente, localidad, cHabitaciones, pisos, camas, precio);
        this.gimnasio = gimnasio;
        this.nombreRes = nombreRes;
        this.capacidadR = capacidadR;
    }


    public Gym getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gym gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRes() {
        return nombreRes;
    }

    public void setNombreRes(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public Integer getCapacidadR() {
        return capacidadR;
    }

    public void setCapacidadR(Integer capacidadR) {
        this.capacidadR = capacidadR;
    }

    @Override
    public String toString() {
        return "Hotel4{" +
                "gimnasio=" + gimnasio +
                ", nombreRes='" + nombreRes + '\'' +
                ", capacidadR=" + capacidadR +
                ", cHabitaciones=" + cHabitaciones +
                ", pisos=" + pisos +
                ", camas=" + camas +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", gerente='" + gerente + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
    @Override
    public Double calcularPrecio(){
        for (Restaurante aux: Restaurante.values() ) {
            if(capacidadR > aux.personas){
                precio = aux.precio;
                break;
            }
        }

        precio += (double) 50 + (camas * cHabitaciones) + gimnasio.precio;
        return precio;
    }
}

