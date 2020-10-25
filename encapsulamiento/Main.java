package encapsulamiento;
public class Unidad_02_POO {

    public static void main(String[] args) {
        Metodos MM = new Metodos ();
        int var_edad;
        var_edad = 35 ;
        
        //asignarle un valor a la edad del metodo MM
        MM.setEdad(var_edad);
        
        System.out.println(MM.getEdad());
    }
    
}
