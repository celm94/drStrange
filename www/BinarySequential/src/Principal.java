import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("\n\n***MÉTODOS DE BÚSQUEDA***\n");
        System.out.println("ARRAY DE EJEMPLO:\n");
        int array[]={56,9985,85,526,45578,7844,1,2532,46578,5415,7981,56875,89,8525};

        System.out.println(Arrays.toString(array)+"\n");
        Arrays.sort(array);

        System.out.println("MENÚ:");
        System.out.println("1. Búsqueda Binaria");
        System.out.println("2. Búsqueda Secuencial");
        System.out.println("3. Salir\n\n");
        System.out.println("ELEGIR OPCIÓN:\n");

        Scanner scanner = new Scanner(System.in);
        int election = scanner.nextInt();

        while(election != 3){
            System.out.println("BÚSQUEDA BINARIA");
            System.out.println("Arreglo Ordenado:");
            System.out.println(Arrays.toString(array)+"\n");
            System.out.println("Ingrese el número que desea buscar:\n");
            int num = scanner.nextInt();
            int searching = Arrays.binarySearch(array, num);

            boolean x= true;
            while(x ==true){

                switch(election){
                    case 1:

                        if (searching== -1){
                            System.out.println("número no encontrado");

                        }


                        else{

                            System.out.println("El número se encuentra en el array en la posición: "+ searching);

                        }
                        break;



                    case 2:
                        System.out.println("BÚSQUEDA SECUENCIAL");
                        int num2 = scanner.nextInt();
                        System.out.println("Ingrese el número que desea buscar:\n");
                        break;

                    case 3:
                        break;


                }x=false;


            }



        }

    }

    public int BinarySearch(int array[], int searched){
        int first = 0;
        int last = array.length-1;
        int center, centerv;

        while(first<= last){
            center = (first + last)/2;
            centerv = array[center];

            if(searched == centerv){
                return center;
            }
            else if(searched < centerv){
                last= center-1;
            }
            else{
                first = center +1;
            }
        }
        return -1;
    }

////MÉTODO DE BÚSQUEDA BINARIA
//        public int BSearch (int array[], int searched) {
//            int first = 0;
//            int last= array.length-1;
//            int center;
//
//
//        }


}
