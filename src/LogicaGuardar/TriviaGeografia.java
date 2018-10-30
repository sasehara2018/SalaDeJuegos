
package LogicaGuardar;

/**
 *
 * @author Usuario
 */
public class TriviaGeografia {
    private String pregunta;
    private int resp;
    private String r1;
    private String r2;
    private String r3;
    public TriviaGeografia(String pr, int r, String r1, String r2, String r3){
        this.pregunta=pr;
        resp=r;
        this.r1=r1;
        this.r2=r2;
        this.r3=r3;
    }
    public String getpregunta(){
        return pregunta;
    }
    public int getresp(){
        return resp;
    }
    public String getr1(){
        return r1;
    }
    public String getr2(){
        return r2;
    }
    public String getr3(){
        return r3;
    }
}
