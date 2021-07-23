package tarea1;

public class Heroe extends Personaje implements Guerrero{

    public Heroe(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public void atacar() {
        System.out.println("¡¡¡HEROE ATACA!!!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
