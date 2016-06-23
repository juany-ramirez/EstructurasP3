
package complejos;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Ubicacion implements Serializable {
    int identificador;
    String nombre;

    public Ubicacion(){
        
    }
    
    public Ubicacion(String nombre){
        this.nombre = nombre;
    }
    
    public Ubicacion(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
