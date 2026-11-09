package Cuentas;
import Clientes.*;

public class CuentaBancaria {
    Integer numero_cuenta;
    Float saldo;
    String titular;

    public CuentaBancaria(Integer numero_cuenta, Float saldo, Cliente titular)
    {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(float valor_deposito)
    {
        if(valor_deposito > 0)
        {
            this.saldo = this.saldo + valor_deposito;
        }

        else
        {
            System.out.printf("No se pudo realizar la transacción");
        }
    }

    public void retirar(float valor_retiro)
    {
        if(this.saldo > valor_retiro)
        {
            this.saldo = this.saldo - valor_retiro;
        }

        else
        {
            System.out.println("No se pudo realizar el retiro");
        }
    }

    public void mostrar_saldo()
    {
        System.out.println("Su saldo es: "+this.saldo);
    }

    public void calcular_intereses()
    {
        System.out.println("");
    }
}