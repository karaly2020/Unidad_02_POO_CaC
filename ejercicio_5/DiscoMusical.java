/* Desarrollar un programa en Java donde se puedan instanciar objetos de tipo DiscoMusical. Definir una clase llamada DiscoMusical considerando los siguientes atributos de clase:
• titulo (String)
• autor (String)
• anioEdicion (int)
• formato (String)
• digital (boolean)
Definir un constructor y los métodos para poder establecer y obtener los valores de los atributos. Compilar el código para 
comprobar que no presenta errores. Crea un objeto y comprueba sus métodos. Para realizar el ejercicio deberá considerar 
aplicar el concepto de encapsulamiento, utilizar modificadores de acceso para los atributos y escribir el código de los 
getters y setters. Ayuda: crear un método main para poder crear el objeto “disco1” e imprimir con él sus valores con 
System.out utilizando el método toString.
 */
package ejercicio_5;
public class DiscoMusical {
    private String titulo;
    private String autor;
    private int anio_edicion;
    private String formato;
    private boolean digital;

    public DiscoMusical(String titulo, String autor, int anio_edicion, String formato, boolean digital) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio_edicion = anio_edicion;
        this.formato = formato;
        this.digital = digital;
    }
      
    //get devolver valor del atributo y set modificar el valor del atributo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio_edicion() {
        return anio_edicion;
    }

    public void setAnio_edicion(int anio_edicion) {
        this.anio_edicion = anio_edicion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    public boolean isDigital() {
        return digital;
    }
    public void setDigital() {
        this.digital = digital;
    }
    public boolean definirDigital(){
        if (this.digital == true){
        }
        return digital;
    }
        @Override
    public String toString() {
        
        return "El Disco " + titulo + ", del autor " + autor + ", del anio_edicion " + anio_edicion + ", "
                + "se encuentra en formato " + formato+ ". Se encuentra en digital = " +digital;
    }
}

