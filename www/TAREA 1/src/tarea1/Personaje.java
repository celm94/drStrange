package tarea1;
abstract class Personaje {
    private static final int pierde = 0;
    private static final int gana = 1;

    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setNombre(int vida) {
        this.vida = vida;
    }


    public void ganar(){
        this.vida = gana;
        System.out.println(gana);
    }

    public void perder(){
        this.vida = pierde;
        System.out.println(pierde);
    }
}


