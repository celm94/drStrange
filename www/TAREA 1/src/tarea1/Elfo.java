package tarea1;

public class Elfo extends Personaje implements Guerrero{
    public Elfo(String nombre, int vida) {
        super(nombre, vida);
    }


    @Override
    public void atacar() {
        System.out.println("¡¡¡ELFO ATACA!!!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
