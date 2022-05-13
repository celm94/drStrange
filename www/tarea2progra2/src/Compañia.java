import java.util.List;

public class Compañia {
    private int numero;
    private String actividad;
    private List<Soldado> soldadoslist;
    private List<Cuartel> cuarteles;


    public Compañia() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
