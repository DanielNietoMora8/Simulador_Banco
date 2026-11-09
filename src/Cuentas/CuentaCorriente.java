package Cuentas;
import Clientes.*;

public class CuentaCorriente extends CuentaBancaria{
    Integer numero_cuenta;
    Float saldo;
    String titular;

    public CuentaCorriente(Integer numero_cuenta, Float saldo, Cliente titular)
    {
        super(numero_cuenta, saldo, titular);
    }

    public void calcular_intereses()
    {
        System.out.println("Tu cuenta corriente no genera intereses");
    }

    public void retirar(float valor_retiro)
    {
        if(this.saldo - valor_retiro >= -500000)
        {
            this.saldo = this.saldo - valor_retiro;
        }

        else
        {
            System.out.println("Su cuenta está sobregirada al límite");
        }
    }
}
