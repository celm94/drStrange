import java.util.List;

public class Cuartel {
    private String codigoc;
    private String nombrec;
    private String ubicacionc;
    private List<Compañia> compañias;
    private List<Soldado> soldados;

    public Cuartel() {
    }

    public String getCodigoc() {
        return codigoc;
    }

    public void setCodigoc(String codigoc) {
        this.codigoc = codigoc;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getUbicacionc() {
        return ubicacionc;
    }

    public void setUbicacionc(String ubicacionc) {
        this.ubicacionc = ubicacionc;
    }
}
