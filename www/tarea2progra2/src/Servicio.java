import java.util.Date;
import java.util.List;

public class Servicio {
    private int codigos;
    private String descripcion;
    private Date fecha;
    private List<Soldado> soldados;

    public Servicio() {
    }

    public int getCodigos() {
        return codigos;
    }

    public void setCodigos(int codigos) {
        this.codigos = codigos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
