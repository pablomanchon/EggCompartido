package Entidades.Extra;
/*Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
        disponibles y si posee o no un restaurante dentro de las instalaciones.*/
public class Camping extends Extrahotelero {
private Integer carpasMax;
private Integer cBanos;
private Boolean restaurante;

    public Camping(String nombre, String direccion, String gerente, String localidad, boolean privado, Double m2, Integer carpasMax, Integer cBanos, Boolean restaurante) {
        super(nombre, direccion, gerente, localidad, privado, m2);
        this.carpasMax = carpasMax;
        this.cBanos = cBanos;
        this.restaurante = restaurante;
    }

    public Camping() {
    }

    public Integer getCarpasMax() {
        return carpasMax;
    }

    public void setCarpasMax(Integer carpasMax) {
        this.carpasMax = carpasMax;
    }

    public Integer getcBanos() {
        return cBanos;
    }

    public void setcBanos(Integer cBanos) {
        this.cBanos = cBanos;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }
}
