package banco;
public class Banco {
    public static void main(String[] args) {
        
        // creacion de las cuentas mediante instnacia la objeto Cuenta.java
        Cuenta cuentaPesos = new Cuenta ("Jose", 200 );
        Cuenta cuentaDolares = new Cuenta ("Jorge", 30 );
        
        // ingreso de dinero en cuenta
        cuentaPesos.ingresar(1000);
        cuentaDolares.ingresar(400);
        
        //retiro de dinero de la cuenta
        cuentaPesos.retirar(800);
        cuentaDolares.retirar(50);
        
        //Mostrar informacion de lad cuentas con el metodo toString
        System.out.println(cuentaPesos + " pesos");
        System.out.println(cuentaDolares + " dolares");
    }
}
