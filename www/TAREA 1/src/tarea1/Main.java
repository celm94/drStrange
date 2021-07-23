package tarea1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Aldeano pj1 = new Aldeano("Angrod", 2);
        pj1.perder();
        System.out.println("Pierde ataque");

        Guerrero pj2 = new Heroe("Odiseo", 3);
        pj2.atacar();
        pj2 = new Elfo("Legolas", 3);
        System.out.println(pj2);


        Guerrero pj3 = new Elfo("Legolas", 3);
        System.out.println(pj3);
        pj3.atacar();
        pj3 = new Heroe("Odiseo", 3);
        System.out.println(pj3);



    }


}
