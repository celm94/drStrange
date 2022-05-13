package Test;




import abstractfactory.*;

public class TestMultiIdioma {
    public static void main(String[] args) {

        test_es();
        test_en();
    }



    public static void test_es() {
        //implementar Abstract factory
        AbstractFactory pses = new EsFactory();
        Preguntas preguntas = pses.GetPreguntas();
        Saludos saludos = pses.GetSaludos();
        System.out.println(preguntas);
        System.out.println(saludos);
    }


    public static void test_en() {
        //implementar Abstract factor
         AbstractFactory ps = new EnFactory();
        Preguntas preguntas = ps.GetPreguntas();
        Saludos saludos =ps.GetSaludos();
        System.out.println(preguntas);
        System.out.println(saludos);
    }

}
