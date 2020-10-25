package banco;
public class Cuenta {
    
    //Atributos
    private String titular;
    private double importe;
    
    //Contruir las cuentas con el metodo constructor
    public Cuenta(String p_titular, double p_importe) {
        this.titular = p_titular;
        this.importe = p_importe;
    }
    public void ingresar (double p_importe){
        if (p_importe > 0){
            this.importe += p_importe;
        }
    }
    public void retirar (double p_importe){
        if (this.importe - p_importe < 0){
            this.importe = 0;
        }else{
            this.importe -= p_importe;
        }
    }
    @Override
    public String toString() {
        return "El titular " + titular + " tiene una saldo de " + importe;
    }
}
