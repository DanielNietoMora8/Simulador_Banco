package Transaccion;
import Cuentas.CuentaBancaria;

import java.time.LocalDate;

public class Transaccion {
    String tipo;
    Integer cantidad;
    LocalDate fecha = LocalDate.of(2026, 11, 5);
    CuentaBancaria cuenta;

    public Transaccion(String tipo, Integer cantidad, LocalDate fecha, CuentaBancaria cuenta)
    {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.cuenta = cuenta;
    }

//    public void registrar_depositos()
//    {
//
//    }




}
