package Banco;
import Clientes.*;
import Cuentas.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    ArrayList<Cliente> lista_clientes = new ArrayList<>();
    Integer id = 1;
    ArrayList<CuentaBancaria> lista_cuentas = new ArrayList<>();
    Integer numero_cuenta_secuencial = 1;

    public void registrar_clientes()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del cliente");
        String nombre = sc.nextLine();
        System.out.println("Ingrese documento");
        Integer documento = sc.nextInt();
        Cliente c = new Cliente(nombre, this.id, documento);
        this.id++;
        lista_clientes.add(c);
    }

    public void crear_cuenta()
    {
        Scanner sc = new Scanner(System.in);

        if (lista_clientes.isEmpty()) {
            System.out.println("Error: No hay clientes registrados en el banco. Registre uno primero.");
            return;
        }

        System.out.println("Ingrese el documento del cliente para asociar la cuenta:");
        Integer docBuscar = sc.nextInt();
        Cliente clienteEncontrado = null;

        for (Cliente c : lista_clientes) {
            if (c.getDocumento().equals(docBuscar)) { // Asumiendo que tienes un método getDocumento() en Cliente
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Error: Cliente no encontrado con ese documento.");
            return;
        }

        System.out.println("Seleccione el tipo de cuenta:\n1. Cuenta de Ahorros\n2. Cuenta Corriente");
        int opcion = sc.nextInt();

        System.out.println("Ingrese el saldo inicial de la cuenta:");
        float saldoInicial = sc.nextFloat();

        if (opcion == 1) {
            CuentaAhorros nuevaCuenta = new CuentaAhorros(numero_cuenta_secuencial, saldoInicial, clienteEncontrado);
            System.out.println("¡Cuenta de Ahorros creada con éxito!");
            lista_cuentas.add(nuevaCuenta);
        } else if (opcion == 2) {
            CuentaCorriente nuevaCuenta = new CuentaCorriente(numero_cuenta_secuencial, saldoInicial, clienteEncontrado);
            System.out.println("¡Cuenta Corriente creada con éxito!");
            lista_cuentas.add(nuevaCuenta);
        } else {
            System.out.println("Opción inválida. Proceso cancelado.");
            return;
        }

        numero_cuenta_secuencial++;

    }
}
