
package LogicaGuardar;

import java.io.Serializable;

/**
 *
 * @author 4to Info 2018
 */
public class Jugador implements Serializable{
private String nombre;
private char[] contrasena;
private static final long serialVersionVID=1L;
public Jugador(String nombre, char[] contrasena){
    
    this.nombre=nombre;
    this.contrasena=contrasena;
}
public void setnombre(String s){
    nombre=s;    
}
public void setcontrasena(char[] f){
    contrasena=f;    
}
public String getnombre(){
    return nombre;    
}
public char[] getcontrasena(){
    return contrasena;    
}
}
