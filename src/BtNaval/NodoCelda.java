package BtNaval;





public class NodoCelda implements Comparable<NodoCelda>{
    private int cant;
    private int xant;
    private int yant;
    private int xpost;
    private int ypost;
    private int x;
    private int y;
    private boolean tocado;
    private boolean hundido;
    private boolean usado;
    public NodoCelda(){
        
    }
    public NodoCelda(int c, int xa, int ya, int xp, int yp, int x1, int y1, boolean toc, boolean hund, boolean usad){
        cant=c;xant=xa;yant=ya;xpost=xp;ypost=yp;x=x1;y=y1;tocado=toc;hundido=hund;usado=usad;
    }
    public void setcanti(int c){
        cant=c;
    }
    public void setxanti(int c){
        xant=c;
    }
    public void setyanti(int c){
        yant=c;
    }
    public void setxposte(int c){
        xpost=c;
    }
    public void setyposte(int c){
        ypost=c;
    }
    public void setxx(int c){
        x=c;
    }
    public void setyy(int c){
        y=c;
    }
    public void settoc(boolean c){
        tocado=c;
    }
    public void sethund(boolean c){
        hundido=c;
    }
    public void setusa(boolean c){
        usado=c;
    }
    public int getcant(){
        return cant;
    }
    public int getxant(){
        return xant;
    }
    public int getyant(){
        return yant;
    }
    public int getxpost(){
        return xpost;
    }
    public int getypost(){
        return ypost;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public boolean gettocado(){
        return tocado;
    }
    public boolean gethundido(){
        return hundido;
    }
    public boolean getusado(){
        return usado;
    }

    @Override
    public int compareTo(NodoCelda o) {
        if (x < o.x) {
                return -1;
            }
            if (x > o.x) {
                return 1;
            }
            return 0;
    }
}
