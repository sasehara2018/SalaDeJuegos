
package LogicaGuardar;


import java.io.Serializable;

/**
 *
 * @author malol
 */
public class Puntos implements Serializable {
    private String nombrejuego;
    private String nombrejugador;
    private int puntos;
    private int nivel;
   
    public Puntos(String nombrejuego, String nombrejugador, int puntos, int nivel){
        super();
        this.nombrejuego=nombrejuego;
        this.nombrejugador=nombrejugador;
        this.puntos=puntos;
        this.nivel=nivel;
    }
    public Puntos(){
        
    }
           

public void setnombrejuego(String t){
    nombrejuego=t;
}
public void setnombrejugador(String q){
    nombrejugador=q;
}
public void setpuntos(int x){
    puntos=x;
}
public String getnombrejuego(){
    return nombrejuego;
}
public String getnombrejugador(){
    return nombrejugador;
}
public int getpuntos(){
    return puntos;
}
public int getnivel(){
    return nivel;
}
}

