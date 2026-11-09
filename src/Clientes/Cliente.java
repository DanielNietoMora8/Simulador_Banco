package Clientes;
import Cuentas.CuentaBancaria;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nombre;
    Integer id;
    Integer documento;
    ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    public Cliente(String nombre, Integer id, int documento)
    {
        this.nombre = nombre;
        this.id = id;
        this.documento = documento;

    }

    public boolean buscar_Cuenta(CuentaBancaria cuenta)
    {
        if(this.cuentas.contains(cuenta))
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public void consultar_Cuentas()
    {
        System.out.println("Las cuentas bancarias a nombre de " + this.nombre + "son: ");
        for(CuentaBancaria cuenta: this.cuentas)
        {
            System.out.println(cuenta);
        }
    }

    public void agregar_Cuenta(CuentaBancaria cuenta)
    {
        this.cuentas.add(cuenta);
    }

}

