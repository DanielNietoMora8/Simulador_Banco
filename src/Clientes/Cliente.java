package Clientes;
import Cuentas.CuentaBancaria;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private Integer id;
    private Integer documento;
    private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    public Cliente(String nombre, Integer id, int documento)
    {
        this.nombre = nombre;
        this.id = id;
        this.documento = documento;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Integer getDocumento()
    {
        return this.documento;
    }

    public void set_documento(int documento)
    {
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

