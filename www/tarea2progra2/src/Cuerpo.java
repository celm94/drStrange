import java.util.List;

public class Cuerpo {
    private String codigoc;
    private String denominacion;
    private List<Soldado> soldados;

    public Cuerpo() {
    }

    public String getCodigoc() {
        return codigoc;
    }

    public void setCodigoc(String codigoc) {
        this.codigoc = codigoc;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
