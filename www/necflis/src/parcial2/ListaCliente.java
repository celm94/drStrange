package parcial2;


import java.util.ArrayList;

import java.util.Scanner;

public class ListaCliente {

    Scanner scan = new Scanner(System.in);

    ArrayList<Cliente> listaclientes = new ArrayList();
//ingreso de valores

    public void AñadirCliente()
    {
        System.out.println("INGRESE NOMBRE DEL CLIENTE: ");
        String nombre = scan.nextLine();
        System.out.println("INGRESE DIRECCIÓN DEL CLIENTE: ");
        String direccion = scan.nextLine();
        System.out.println("INGRESE EDAD DEL CLIENTE: ");
        int edad = Integer.parseInt(scan.nextLine());

        Cliente cliente = new Cliente();
        cliente.SetNombre(nombre);
        cliente.SetDireccion(direccion);
        cliente.SetEdad(edad);

        listaclientes.add(cliente);
    }

    public void Verclientes()
    {
        String clients = "";
        for(int i=0; i<listaclientes.size(); i++)
        {
            clients+="CLIENTE "+(i+1)+"\n";
            clients+="NOMBRE: "+listaclientes.get(i).GetNombre()+"\n";
            clients+="DIRECCIÓN: "+listaclientes.get(i).GetDireccion()+"\n";
            clients+="EDAD: "+listaclientes.get(i).GetEdad()+ '\n';
            System.out.println("");
            System.out.println("");
            System.out.println(clients);
        }


    }

    public void VerListadoClientes() {
        String listac = "";
        for(int j=0; j<listaclientes.size(); j++)
        {
            listac= "CLIENTE "+(j+1)+": " + listaclientes.get(j).GetNombre();
            System.out.println(listac);
        }

    }
}
