package Entidades.Extra;


public class Residencia extends Extrahotelero {
    private boolean descuentos, campoDeportivo;

    public Residencia() {
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "descuentos=" + descuentos +
                ", campoDeportivo=" + campoDeportivo +
                '}';
    }
}
