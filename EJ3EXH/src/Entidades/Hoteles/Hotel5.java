package Entidades.Hoteles;

import Enums.Gym;

/*Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
        Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
        Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.*/
public final class Hotel5 extends Hotel4{
    private Integer salones, suites, limusinas;

    public Hotel5() {
    }

    public Hotel5(String nombre, String direccion, String gerente, String localidad, Integer cHabitaciones, Integer pisos, Integer camas, Double precio, Gym gimnasio, String nombreRes, Integer capacidadR, Integer salones, Integer suites, Integer limusinas) {
        super(nombre, direccion, gerente, localidad, cHabitaciones, pisos, camas, precio, gimnasio, nombreRes, capacidadR);
        this.salones = salones;
        this.suites = suites;
        this.limusinas = limusinas;
    }

    public Integer getSalones() {
        return salones;
    }

    public void setSalones(Integer salones) {
        this.salones = salones;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimusinas() {
        return limusinas;
    }

    public void setLimusinas(Integer limusinas) {
        this.limusinas = limusinas;
    }
    @Override
    public Double calcularPrecio(){
        super.calcularPrecio();
        precio += limusinas * 15;
        return precio;
    }

}

