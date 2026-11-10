import Clientes.*;
import Cuentas.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cliente Daniel = new Cliente("Daniel", 102, 123221);
        CuentaBancaria _01 = new CuentaAhorros(1, 10000f, Daniel); // Nota: Se quitó el '0' inicial para evitar malentendidos de formato octal
        ArrayList<CuentaBancaria> cuentas_Daniel = new ArrayList<CuentaBancaria>();

        // Si quieres probar que funciona, añade un print:
        System.out.println("Cliente y cuenta creados con éxito.");
    }
}
