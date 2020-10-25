/*Crear la clase Perro en java, teniendo en cuenta que sus atributos son: nombre, raza, altura; y 
sus métodos: ladrar(), caminar(), saltar(), recobrar(). Generar el método constructor, los getters y 
setters correspondientes y el método toString. */
package ejercicio_4;
public class Perro {
    private String nombre;
    private String raza;
    private double altura;
    
    public void ladrar (){
        
    }
    public void caminar (){
        
    }
    public void saltar (){
        
    }
    public void recobrar (){
        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "El perro " + nombre + ", de raza " + raza + ", tiene una altura de " + altura + " cm.";
    }
}
