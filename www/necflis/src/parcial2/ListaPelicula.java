package parcial2;
import java.util.ArrayList;

import java.util.Scanner;

public class ListaPelicula {
    Scanner sc = new Scanner(System.in);

    ArrayList<Pelicula> listapeliculas = new ArrayList();
    ArrayList<Pelicula> playlist = new ArrayList();


    public void AñadirPelicula()
    {
        System.out.println("INGRESE NOMBRE DE LA PELÍCULA: ");
        String nombrepel = sc.nextLine();
        System.out.println("INGRESE EL TIPO DE PELÍCULA: ");
        String tipo = sc.nextLine();
        System.out.println("INGRESE EL GÉNERO DE LA PELÍCULA: ");
        String genero = sc.nextLine();
        System.out.println("INGRESE LA SINOPSIS DE LA PELÍCULA: ");
        String sinopsis = sc.nextLine();

        Pelicula pelicula = new Pelicula();
        pelicula.SetNombrepel(nombrepel);
        pelicula.SetTipo(tipo);
        pelicula.SetGenero(genero);
        pelicula.SetSinopsis(sinopsis);

        listapeliculas.add(pelicula);
    }
    public void VerListadoPeliculas()
    {
        String listaP = "";
        for(int p=0; p<listapeliculas.size(); p++)
        {
            listaP+= ""+(p+1)+listapeliculas.get(p).GetNombrepel();
            System.out.println(listaP);
        }

    }

    public void VerPeliculas()
    {
        String pelis = "";
        for(int a=0; a<listapeliculas.size(); a++)
        {
            pelis+="PELÍCULA "+(a+1)+"\n";
            pelis+="NOMBRE: "+ listapeliculas.get(a).GetNombrepel()+"\n";
            pelis+="TIPO: "+ listapeliculas.get(a).GetTipo()+"\n";
            pelis+="GENERO: "+ listapeliculas.get(a).GetGenero()+"\n";
            pelis+="SINOPSIS: "+ listapeliculas.get(a).GetSinopsis()+"\n";
            System.out.println(pelis);


        }


    }

    public void AñadirPlaylist()
    {
        System.out.println("Seleccione la Película que desea agregar");
        for(int s=0; s<listapeliculas.size(); s++)
        {
            System.out.println("Película "+s+ listapeliculas.get(s).GetNombrepel());
        }

    }


}
