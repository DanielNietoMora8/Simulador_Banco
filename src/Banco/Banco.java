package Banco;
import Clientes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    ArrayList<Cliente> lista_clientes = new ArrayList<>();
    Integer id = 0;
    public void registrar_clientes()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del cliente");
        String nombre = sc.nextLine();
        System.out.println("Ingrese documento");
        Integer documento = sc.nextInt();
        Cliente c = new Cliente(nombre, this.id, documento);
        lista_clientes.add(c);
    }

    public void crear_cuenta()
    {

    }
}
