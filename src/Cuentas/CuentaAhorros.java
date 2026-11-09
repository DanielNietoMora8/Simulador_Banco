package Cuentas;

public class CuentaAhorros extends CuentaBancaria {
    Integer numero_cuenta;
    Float saldo;
    String titular;
    float tasa_interes = 0.05f;

    public CuentaAhorros(Integer numero_cuenta, Float saldo, String titular)
    {
        super(numero_cuenta, saldo, titular);
    }
    public void calcular_intereses()
    {
        System.out.println("");

    }

    public void retirar(float valor_retiro)
    {
        if(this.saldo > 50000)
        {
            this.saldo = this.saldo - valor_retiro;
        }

        else
        {
            System.out.printf("Saldo insuficiente, no se pudo realizar el retiro");
        }
    }
}
