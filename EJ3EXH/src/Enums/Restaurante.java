package Enums;

public enum Restaurante {
    BAJO(30,10d), MEDIO(50,30d), ALTO(999,50d);

    public Integer personas;
    public Double precio;

    Restaurante( Integer personas, Double precio) {
        this.precio = precio;
        this.personas = personas;
    }
}
