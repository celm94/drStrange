import java.util.Date;
import java.util.List;

public class Soldado {

    private int codigo;
    private String nombres;
    private String apellidos;
    private Date graduacion;
    private Compañia compañia;
    private Cuerpo cuerpo;
    private Cuartel cuartel;
    private List<Servicio> servicios;

    public Soldado() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(Date graduacion) {
        this.graduacion = graduacion;
    }
}
