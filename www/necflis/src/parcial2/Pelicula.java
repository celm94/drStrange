package parcial2;

public class Pelicula
{
    public String nombrepel;
    public String tipo;
    public String genero;
    public String sinopsis;

    public Pelicula()
    {
        nombrepel = "";
        tipo = "";
        genero = "";
        sinopsis = "";
    }
//nombrepel
    public String GetNombrepel()
    {
        return nombrepel;
    }
    public void SetNombrepel(String nombrepel)
    {
        this.nombrepel = nombrepel;
    }
//tipo
    public String GetTipo()
    {
        return tipo;
    }
    public void SetTipo(String tipo)
    {
        this.tipo = tipo;
    }

//genero
    public String GetGenero()
    {
    return genero;
    }
    public void SetGenero(String genero)
    {
        this.genero = genero;
    }
    //sinopsis
    public String GetSinopsis()
    {
        return sinopsis;
    }
    public void SetSinopsis(String sinopsis)
    {
        this.sinopsis = sinopsis;
    }



}
