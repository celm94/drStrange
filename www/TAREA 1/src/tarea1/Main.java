package tarea1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Aldeano pj1 = new Aldeano("Angrod", 2);
        pj1.perder();
        System.out.println("Pierde ataque");
        Heroe pj2 = new Heroe("Odiseo", 3);
        pj2.atacar();
        pj2.ganar();
        System.out.println(pj2);
        Elfo pj3 = new Elfo("Legolas", 3);
        System.out.println(pj3);
        pj3.atacar();
        pj3.perder();
        pj3 = new Elfo("Odiseo", 2);
        System.out.println(pj3);



    }


}
