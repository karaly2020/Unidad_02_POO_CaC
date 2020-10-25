/* Dado el siguiente diagrama de clases, crear la clase Persona en Java. Declarar sus atributos. Crear el método constructor
por defecto y otro constructor que reciba como parámetros todos los valores correspondientes a todos los 
atributos de la clase. Crear también todos los getters y setters.*/
package ejercicio_1;
public class Ejercicio_1 {
    public String nombre;
    public double altura;
    public int edad;
    public String genero;
    
    public Ejercicio_1(){
        
    }
    public Ejercicio_1(String nombre, double altura, int edad, String genero) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.genero = genero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
