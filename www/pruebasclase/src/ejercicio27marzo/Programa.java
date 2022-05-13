package ejercicio27marzo;

import java.util.Scanner;

public class Programa {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        Estudiantes[] listaEstudiantes = new Estudiantes[5];
        int cont = 0;
        while(cont < 5){
            System.out.println("Ingrese nombre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese edad");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese carnet");
            String carnet = sc.nextLine();
            System.out.println("indique si está solvente");
            boolean solvente = Boolean.parseBoolean(sc.nextLine());

            Estudiantes estudiante = new Estudiantes(nombre, edad, carnet, solvente);

            listaEstudiantes[cont] = estudiante;
            cont++;

        }
        System.out.println("LISTA ");

        for (int i =0; i<5; i++){
            Estudiantes estudiante = listaEstudiantes[i];
            System.out.println("nombre Estudiante" + estudiante.nombre+ " carnet " + estudiante.carnet);

        }
    }
}
