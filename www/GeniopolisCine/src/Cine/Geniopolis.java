package Cine;
import jdk.swing.interop.SwingInterOpUtils;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Geniopolis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean opcion = false, bebidas = false, opcion2 = false;
        boolean menu = false;
        boolean alimentos = false;
        boolean cartelera = false;
        int i=0;
        int contadorTICKET = 0;
        int epe, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0, num11 = 0, num12 = 0,
                num13 = 0, num14 = 0, num15 = 0, num16 = 0, num17 = 0, num18 = 0, num19 = 0, num20 = 0, num21 = 0;



        while(opcion == false) {
            System.out.println("Bienvenido a Geniopolis");
            System.out.println("1. Vista Jefe");
            System.out.println("2. Vista Empleado");
            System.out.println("3. Salir");
            System.out.println("Seleccione una Opción");
            i = scanner.nextInt();

            switch(i){
                case 1:
                    System.out.println("Introduzca su Usuario: ");
                    String usuario;
                    Scanner usuarios = new Scanner(System.in);
                    usuario = usuarios.nextLine();

                    System.out.println("Introduzca su Contraseña: ");
                    String contraseña;
                    contraseña = scanner.nextLine();
                    Scanner contraseñas = new Scanner(System.in);
                    contraseña = contraseñas.nextLine();
                    System.out.println("");
                    System.out.println("Ingresando a área de Jefe...");
                    break;
                case 2:
                    while(opcion2 == false){
                        contadorTICKET++;
                        System.out.println("Introduzca su Usuario: ");
                        String usuarioE;
                        Scanner usuariosE = new Scanner(System.in);
                        usuarioE = usuariosE.nextLine();

                        System.out.println("Introduzca su Contraseña: ");
                        String contraseñaE;
                        Scanner contraseñasE = new Scanner(System.in);
                        contraseñaE = contraseñasE.nextLine();

                        System.out.println("");
                        System.out.println("Ingresando a área de Empleado...");
                        System.out.println("");
                        System.out.println("Ingrese nombre del cliente: ");
                        String nombreC;
                        Scanner nombresC = new Scanner(System.in);
                        nombreC = nombresC.nextLine();

                        System.out.println("");
                        System.out.println("Ingrese apellido del cliente: ");
                        String apellidoC;
                        Scanner apellidosC = new Scanner(System.in);
                        apellidoC = apellidosC.nextLine();

                        System.out.println("");
                        System.out.println("Ingrese NIT del cliente: ");
                        String nitC;
                        Scanner nitsC = new Scanner(System.in);
                        nitC = nitsC.nextLine();
                        System.out.println("Ingresando al menú principal...");
                        System.out.println("");



                        while(menu == false){
                            System.out.println("MENÚ PRINCIPAL: ");
                            System.out.println("1. BEBIDAS");
                            System.out.println("2. ALIMENTOS");
                            System.out.println("3. CARTELERA DE PELÍCULAS");
                            System.out.println("4. SALIR DEL MENÚ PIRNCIPAL");
                            System.out.println("5. IMPRESIÓN DE TICKET");
                            System.out.println("Seleccione una opción");
                            int m=0;
                            Scanner ms = new Scanner(System.in);
                            m = ms.nextInt();

                            switch(m){
                                case 1:
                                    while(bebidas == false){
                                        System.out.println("CINE GENIOPOLIS");
                                        System.out.println("MENÚ DE BEBIDAS");
                                        System.out.println("");
                                        System.out.println("1. Coca Cola Pequeña.........Q27.00");
                                        System.out.println("2. Coca Cola Mediana.........Q28.00");
                                        System.out.println("3. Coca Cola Grande..........Q30.00");
                                        System.out.println("4. Té chai latte mediano.....Q26.00");
                                        System.out.println("5. Café americano pequeño....Q18.00");
                                        System.out.println("6. Capuchino Mediano.........Q25.00");
                                        System.out.println("7. AGUA PURA.................Q20.00");
                                        System.out.println("8. SALIR DEL MENÚ DE BEBIDAS");
                                        int opB = 0;
                                        Scanner opsB = new Scanner(System.in);
                                        opB = opsB.nextInt();

                                        switch(opB){
                                            case 1:
                                                System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                                                num1 = opsB.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num1 * 27.00);
                                                break;

                                            case 2:
                                                System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                                                num1 = opsB.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num1 * 28.00);
                                                break;
                                            case 3:
                                                System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                                                num1 = opsB.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num1 * 30.00);
                                                break;
                                            case 4:
                                                System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                                                num1 = opsB.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num1 * 26.00);
                                                break;
                                            case 5:
                                                System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                                                num1 = opsB.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num1 * 18.00);
                                                break;
                                            case 6:
                                                System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                                                num1 = opsB.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num1 * 25.00);
                                                break;
                                            case 7:
                                                System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                                                num1 = opsB.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num1 * 20.00);
                                                break;
                                            case 8:
                                                System.out.println("Volviendo al menú anterior...");
                                                bebidas = true;
                                                break;
                                            default:
                                                System.out.println("Opción no existe... elija otra opción");
                                                break;


                                        }

                                    }

                                    break;
                                case 2:
                                    while(alimentos == false){
                                        System.out.println("MENÚ DE ALIMENTOS");
                                        System.out.println("1. Pizza Personal      Q40.00");
                                        System.out.println("2. Pechuguitas de Pollo      Q57.00");
                                        System.out.println("3. Papas Fritas      Q32.00");
                                        System.out.println("4. Aros de Cebolla      Q32.00");
                                        System.out.println("5. Sweet Potatoe      Q32.00");
                                        System.out.println("6. Palomitas de Maiz Medianas      Q40.00");
                                        System.out.println("7. Palomitas de Maiz Grandes      Q60.00");
                                        System.out.println("8. Salir del Menú de Alimentos");
                                        int opA = 0;
                                        Scanner opsA = new Scanner(System.in);
                                        opA = opsA.nextInt();

                                        switch(opA){
                                            case 1:
                                                System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                                                num8 = opsA.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num8 * 40.00);
                                                break;
                                            case 2:
                                                System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                                                num8 = opsA.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num8 * 57.00);
                                                break;
                                            case 3:
                                                System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                                                num8 = opsA.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num8 * 32.00);
                                                break;

                                            case 4:
                                                System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                                                num8 = opsA.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num8 * 26.00);
                                                break;
                                            case 5:
                                                System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                                                num8 = opsA.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num8 * 32.00);
                                                break;
                                            case 6:
                                                System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                                                num8 = opsA.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num8 * 40.00);
                                                break;
                                            case 7:
                                                System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                                                num8 = opsA.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num8 * 60.00);
                                                break;
                                            case 8:
                                                System.out.println("volviendo al menú anterior...");
                                                alimentos = true;
                                                break;
                                            default:
                                                System.out.println("elija de nuevo una opción...");
                                                break;


                                        }

                                    }


                                    break;

                                case 3:
                                    while(cartelera == false){
                                        System.out.println("CARTELERA DE PELICULAS");
                                        System.out.println("1. Black window          Q60.00");
                                        System.out.println("2. Duro de cuidar II     Q60.00");
                                        System.out.println("3. La purga por siempre  Q60.00");
                                        System.out.println("4. Pasión, amor y muerte  Q70.00");
                                        System.out.println("5. Rápidos y Furiosos 9   Q65.00");
                                        System.out.println("6. Jefe en Pañales 2      Q65.00");
                                        System.out.println("7. Space Jam              Q70.00");
                                        System.out.println("8. Salir de la cartelera");
                                        int opP=0;
                                        Scanner opPs = new Scanner(System.in);
                                        opP = opPs.nextInt();

                                        switch(opP) {
                                            case 1:
                                                System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                                                num15 = opPs.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num15 * 60.00);
                                                break;
                                            case 2:
                                                System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                                                num15 = opPs.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num15 * 60.00);
                                                break;
                                            case 3:
                                                System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                                                num15 = opPs.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num15 * 60.00);
                                                break;

                                            case 4:
                                                System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                                                num15 = opPs.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num15 * 70.00);
                                                break;


                                            case 5:
                                                System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                                                num15 = opPs.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num15 * 65.00);
                                                break;

                                            case 6:
                                                System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                                                num15 = opPs.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num15 * 65.00);
                                                break;

                                            case 7:
                                                System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                                                num15 = opPs.nextInt();
                                                System.out.println("¡Muy bien! Su total a cancelar seria de:");
                                                System.out.println(num15 * 70.00);
                                                break;
                                            case 8:
                                                System.out.println("Volviendo al menú anterior...");
                                                cartelera = true;

                                                break;
                                            default:
                                                System.out.println("escoja una opción disponible...");
                                                break;


                                        }

                                    }

                                    break;

                                case 4:
                                    System.out.println("Saliendo del menú principal...");
                                    menu = true;
                                    break;
                                case 5:

                                    System.out.println("TICKET NÚMERO "+ contadorTICKET);
                                    System.out.println("Nombre del Cliente:  "+nombreC);
                                    System.out.println("Apellido del Cliente: "+ apellidoC);
                                    System.out.println(" NIT del Cliente: " + nitC);
                                    System.out.println("****** VUELVE PRONTO*****");
                                    System.out.println("Atendido por "+ usuarioE);


                                    System.out.println("");
                                    System.out.println("");
                                    opcion2 = true;
                                    menu = true;





                                    break;


                                default:
                                    System.out.println("La opción seleccionada no existe. Elija otra opción");
                                    break;

                            }

                        }

                    }




                    break;
                case 3:
                    System.out.println("Hasta Pronto");
                    opcion = true;
                    break;
                default:
                    System.out.println("La opción seleccionada no existe. Elija otra opción");
                    break;


            }

            opcion= false;
            opcion2= false;
            menu = false;
            bebidas = false;
            alimentos = false;
            cartelera = false;
        }


    }

}
