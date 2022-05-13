
import java.util.Scanner;
public class Geniopolis {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        String nombre, apell;
        String nit;
        int epe, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0, num11 = 0, num12 = 0,
                num13 = 0, num14 = 0, num15 = 0, num16 = 0, num17 = 0, num18 = 0, num19 = 0, num20 = 0, num21 = 0;

        System.out.println("Ingrese su nombre");
        nombre= x.nextLine();
        if ("admin".equals(nombre)) {
            System.out.println ("1. ingreso de productos");
            System.out.println ("2. ventas por sesión");
            System.out.println ("3. salir del menú");
            epe = x.nextInt();
            if (epe == 1) {
                System.out.println("ingreso de productos");
            }
        }

        System.out.println("Ingrese su apellido");
        apell= x.nextLine();
        System.out.println("Ingrese su NIT");
        nit= x.nextLine();
        System.out.println("BIENVENIDO A CINE GENIOPOLIS");
        System.out.println("MENÚ PRINCIPAL DEL CINE GENIOPOLIS");
        System.out.println("1. Bebidas");
        System.out.println("2. Alimentos");
        System.out.println("3. Cartelera de Películas");
        System.out.println("4. Salir del Menu Principal");
        System.out.println("5. Impresión de Tiket");
        int op= x.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("MENÚ DE BEBIDAS");
                System.out.println("1. Coca Cola Pequeña      Q27.00");
                System.out.println("2. Coca Cola Mediana      Q28.00");
                System.out.println("3. Coca Cola Grande      Q30.00");
                System.out.println("4. Té Chai Latte Mediano      Q26.00");
                System.out.println("5. Café Americano Pequeño      Q18.00");
                System.out.println("6. Capuchino Mediano      Q25.00");
                System.out.println("7. Agua Pura      Q20.00");
                System.out.println("8. Salir del Menú de Bebidas");
                op = x.nextInt();
                switch (op) {
                    case 1 -> {
                        System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                        num1 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num1 * 27.00);
                        System.out.println("8. si desea volver al menu principal");
                        do {
                            System.out.println("MENÚ DE BEBIDAS");
                            System.out.println("1. Coca Cola Pequeña      Q27.00");
                            System.out.println("2. Coca Cola Mediana      Q28.00");
                            System.out.println("3. Coca Cola Grande      Q30.00");
                            System.out.println("4. Té Chai Latte Mediano      Q26.00");
                            System.out.println("5. Café Americano Pequeño      Q18.00");
                            System.out.println("6. Capuchino Mediano      Q25.00");
                            System.out.println("7. Agua Pura      Q20.00");
                            System.out.println("8. Salir del Menú de Bebidas");
                            op = x.nextInt();
                        }

                        while (op == 8);
                    }
                    case 2 -> {
                        System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                        num2 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num2 * 28.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 3 -> {
                        System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                        num3 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num3 * 30.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 4 -> {
                        System.out.println("¡Excelente! ¿Cuántas bebidas decea?");
                        num4 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num4 * 26.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 5 -> {
                        System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                        num5 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num5 * 18.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 6 -> {
                        System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                        num6 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num6 * 25.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 7 -> {
                        System.out.println("¡Excelente! ¿Cuántas bebidas desea?");
                        num7 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num7 * 20.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 8 -> System.out.println("Finalizo");
                }
            }
            case 2 -> {
                System.out.println("MENÚ DE ALIMENTOS");
                System.out.println("1. Pizza Personal      Q40.00");
                System.out.println("2. Pechuguitas de Pollo      Q57.00");
                System.out.println("3. Papas Fritas      Q32.00");
                System.out.println("4. Aros de Cebolla      Q32.00");
                System.out.println("5. Sweet Potatoe      Q32.00");
                System.out.println("6. Palomitas de Maiz Medianas      Q40.00");
                System.out.println("7. Palomitas de Maiz Grandes      Q60.00");
                System.out.println("8. Salir del Menú de Alimentos");
                op = x.nextInt();
                switch (op) {
                    case 1 -> {
                        System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                        num8 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num8 * 40.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 2 -> {
                        System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                        num9 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num9 * 57.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 3 -> {
                        System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                        num10 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num10 * 32.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 4 -> {
                        System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                        num11 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num11 * 32.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 5 -> {
                        System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                        num12 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num12 * 32.00);
                        System.out.println("8. si desea volver al menu principal");
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 6 -> {
                        System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                        num13 = x.nextInt();
                        System.out.println("¡Muy bien! Su total seria de:");
                        System.out.println(num13 * 40.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 7 -> {
                        System.out.println("¡Excelente! ¿Cuántos alimentos gusta?");
                        num14 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num14 * 60.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 8 -> System.out.println("Finalizado");
                }
            }
            case 3 -> {
                System.out.println("CARTELERA DE PELICULAS");
                System.out.println("1. Black window          Q60.00");
                System.out.println("2. Duro de cuidar II     Q60.00");
                System.out.println("3. La purga por siempre  Q60.00");
                System.out.println("4. Pasión, amor y muerte  Q70.00");
                System.out.println("5. Rápidos y Furiosos 9   Q65.00");
                System.out.println("6. Jefe en Pañales 2      Q65.00");
                System.out.println("7. Space Jam              Q70.00");
                System.out.println("8. Salir de la cartelera");
                op = x.nextInt();
                switch (op) {
                    case 1 -> {
                        System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                        num15 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num15 * 60.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 2 -> {
                        System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                        num16 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num16 * 60.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 3 -> {
                        System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                        num17 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num17 * 60.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 4 -> {
                        System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                        num18 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num18 * 70.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 5 -> {
                        System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                        num19 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num19 * 65.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 6 -> {
                        System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                        num20 = x.nextInt();
                        System.out.println("¡Muy bien! Su total seria de:");
                        System.out.println(num20 * 65.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 7 -> {
                        System.out.println("¡Excelente! ¿Cuántas personas ingresaran?");
                        num21 = x.nextInt();
                        System.out.println("¡Muy bien! Su total a cancelar seria de:");
                        System.out.println(num21 * 70.00);
                        System.out.println("8. si desea imprimir un ticket");
                        op = x.nextInt();
                        if (op == 8) {
                            int total;
                            total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                                    num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                                    num18 + num19 + num20 + num21;

                            System.out.println("nombre: " + nombre);
                            System.out.println("nombre: " + apell);
                            System.out.println("NIT: " + nit);
                            System.out.println("Descripcion de productos: ");
                            System.out.println("total: " + total);
                        }
                    }
                    case 8 -> System.out.println("Finalizado");
                }
            }
            case 4 -> System.out.println("Finalizado");
            case 5 -> {
                int total;
                total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 +
                        num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 +
                        num18 + num19 + num20 + num21;
                System.out.println("nombre: " + nombre);
                System.out.println("nombre: " + apell);
                System.out.println("NIT: " + nit);
                System.out.println("Descripcion de productos: ");
                System.out.println("total: " + total);
            }
        }

    }
}
