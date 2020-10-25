/*Dada la siguiente definición de clase y sus atributos. Completar los métodos que proporcionan 
los atributos de tipo privado y los que permiten modificar su valor (como ejemplo tienen a continuación 
los métodos para nombre):*/
package ejercicio_2;
public class Persona {
    private String nombre;
    private int edad;
    private int altura;
    private int peso;
    private String colorOjos;
    private String sexo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getColorOjos() {
        return colorOjos;
    }
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
