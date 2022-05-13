package Villano;

public abstract class Villano {
    private String nombre;
    private String poder;
    private int vidas;
    private int energia;

    public Villano(String nombre, String poder, int vidas, int energia) {
        this.nombre = nombre;
        this.poder = poder;
        this.vidas = vidas;
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
