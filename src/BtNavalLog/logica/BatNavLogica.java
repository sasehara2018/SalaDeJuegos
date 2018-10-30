/*
 * Funciones logicas de la batalla naval
 *
 */
package BtNavalLog.logica;


import BtNaval.NodoCelda;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class BatNavLogica {
    // propiedades
    public NodoCelda nodo2=new NodoCelda();
    public NodoCelda nodo3=new NodoCelda();
    public NodoCelda matriz1[][]=new NodoCelda[10][10];
    public NodoCelda matrizj[][]=new NodoCelda[10][10];
    public boolean primero=true;
    public int n=0; // para tener un nro aleatorio de la cantidad de barcos de 3.
    public int columna=0;// tener en cuenta que columna 0 es A
    public int fila=0;
    public ArrayList<NodoCelda> arrtoc=new ArrayList();// guardo los nodos tocados.
    public ArrayList<NodoCelda> arrjugada=new ArrayList();// guardo los nodos tocados.
    
    // funciones y metodos
    public int caso3(int x, int y, NodoCelda matriz[][]){
        // función que recibe coordenadas x, y de un nodo de la matriz de objetos NodoCelda, y la matriz. 
        // debe buscar el primero de los nodos recorriendo hacia atrás mediante getxant, getyant
        // luego los recorre los 3 mediante getxpost, getypost, y verifica si los 3 están tocados.
        // si al salir de la repetitiva anterior, los 3 están tocados, los recorro de nuevo para marcarlos como hundidos (sethund(true))
        // devuelvo 1 si no están hundidos. Devuelvo 2 si están hundidos.
        
        int tocahundi=1;
        // agregar el resto del codigo aquí
        
        

        // aquí termina lo que hay que agregar.
        
        return tocahundi;
    }
    public int caso2(int x, int y, NodoCelda matriz[][]) {
      
        
        matriz[x][y].settoc(true);
        int xa=matriz[x][y].getxant();
        int ya=matriz[x][y].getyant();
        int xp=matriz[x][y].getxpost();
        int yp=matriz[x][y].getypost();
        int tocahundi=1; // el 1 es tocado, el 2 hundido
        boolean hundido=false;
        if(xa>=0){
            if(matriz[xa][ya].gettocado()){
                hundido=true;
                tocahundi=2;
                
                matriz[xa][ya].sethund(hundido);
                matriz[x][y].sethund(hundido);
            }
        }else if(xp>=0){
            if(matriz[xp][yp].gettocado()){
                hundido=true;
                tocahundi=2;
                matriz[xp][yp].sethund(hundido);
                matriz[x][y].sethund(hundido);
                
            }
        }
        
        return tocahundi;
    }
    public int caso3_1(int x, int y, NodoCelda matriz[][]) {
        matriz[x][y].settoc(true);
        int tocahundi=1;
        int xprim=x;
        int yprim=y;
        // busco el primero de los 3.
        for(int i=0;i<3;i++){
            if(matriz[xprim][yprim].getxant()>=0){
                int xp=matriz[xprim][yprim].getxant();
                int yp=matriz[xprim][yprim].getyant();
                xprim=xp;
                yprim=yp;
              
            }
        }
       
        int contador=0;
        int xprim1=xprim;// me guardo la direccion del primero
        int yprim1=yprim;
        int cant=matriz[xprim][yprim].getcant();
        
         // recorro los 3 para ver si estan los 3 tocados.
        while(cant>0){
            cant--;
            if(matriz[xprim][yprim].gettocado()){
                contador++;
                                          
            }
            int yp=matriz[xprim][yprim].getypost();
            int xp=matriz[xprim][yprim].getxpost();
            xprim=xp;
            yprim=yp;
        }
        // si contador es = 3 es porque los 3 estan tocados. Los recorro para marcar hundido y aviso.
        if(contador==3){
            
            for(int i=0;i<3;i++){
                matriz[xprim1][yprim1].sethund(true);
                int xp=xprim1;
                int yp=yprim1;
                xp=matriz[xprim1][yprim1].getxpost();
                yp=matriz[xprim1][yprim1].getypost();
                xprim1=xp;
                yprim1=yp;
            }
            
            tocahundi=2;
        }
        
        return tocahundi;
    }
    public void creolosdetres(NodoCelda matriz[][]) {
        n=(int)Math.floor(Math.random()*3);//
        n=n+1; // tengo un nro aleatorio entre 1 y 2, o sea, la cantidad minima y maxima de barcos de 3.
        
        int i=0;
        NodoCelda nodo=new NodoCelda();
        
        nodo2=null;nodo3=null;
        int x=0;
        int y=0;
        do{// estructura repetitiva para crear tantos barcos de 2 como determine el math random, o sea, un maximo de 4
            boolean okay=false;
            while(!okay){
                // primer nodo
                x=(int)Math.floor(Math.random()*9);//
                
                y=(int)Math.floor(Math.random()*9);//
                nodo=new NodoCelda();
                nodo=matriz[x][y];
                if(!nodo.getusado()){// si no está usado el nodo.
                    okay=cargo2nodos(x, y, matriz);
                    
                }   
            }
           matriz=matriz1;
            
            //actualizo el nodo actual con los datos del siguiente y anterior
            nodo=new NodoCelda();
            nodo.setcanti(3);
            nodo.setxposte(nodo2.getx());
            nodo.setyposte(nodo2.gety());
            nodo.setxanti(-1);
            nodo.setyanti(-1);
            nodo.setusa(true);
            nodo.settoc(false);
            nodo.sethund(false);
            matriz[x][y]=nodo;
            
            i++;
        }while(i<n);
        matriz1=matriz;
    }
    public boolean cargo2nodos(int x, int y, NodoCelda matriz[][]) {
        // tomando el primero en la posicion x, y, busca otros 2. El que esta en la posicion x,y es siempre el primero de los 3, en cualquier sentido.
        int tipo=(int)Math.floor(Math.random()*7);// esto me determina al azar como coloco el primer barco, 
                             // 0=diagonal arr der, 1=diagonal arr izq, 2= diagonal aba der, 3=diagonal aba izq, 
                             //4=vertical abajo, 5= vertical arriba 
                             // 6=horizontal der, 7=horizontal izq
        switch(tipo){
            case 0: if(this.diagonalarribader(x, y, matriz)) return true;break;
            case 1: if(diagonalarribaizq(x,y,matriz)) return true;break;
            case 2: if(diagonalabajoder(x,y,matriz)) return true;break;
            case 3: if(diagonalabajoizq(x,y,matriz)) return true;break;
            case 4: if(verticalabajo(x,y,matriz)) return true;break;
            case 5: if(verticalarriba(x,y,matriz)) return true;break;
            case 6: if(horizontalder(x,y,matriz)) return true;break;
            case 7: if(horizontalizq(x,y,matriz)) return true;break;
        }                    

        return false;
    }
    private boolean diagonalarribader(int x, int y, NodoCelda matriz[][]){
        try{
            // si diagonal arriba a la derecha esta libre lo uso
            
            if(!matriz[x+1][y-1].getusado() && !matriz[x+2][y-2].getusado() ){
                nodo2=new NodoCelda();
                nodo2.setcanti(3);
                nodo2.sethund(false);
                nodo2.setusa(true);
                nodo2.settoc(false);
                nodo2.setxanti(x);
                nodo2.setyanti(y);
                
                nodo2.setxposte(x+2);
                nodo2.setyposte(y-2);
                nodo2.setxx(x+1);
                nodo2.setyy(y-1);
                matriz[x+1][y-1]=nodo2;System.out.println(x+" "+y+" el 2a es ant de "+nodo2.getx()+" "+nodo2.gety()+" post "+nodo2.getxpost()+" "+nodo2.getypost());
                nodo3=new NodoCelda();
                nodo3.setcanti(3);
                nodo3.sethund(false);
                nodo3.setusa(true);
                nodo3.settoc(false);
                nodo3.setxanti(x+1);
                nodo3.setyanti(y-1);
                
                nodo3.setxposte(-1);
                nodo3.setyposte(-1);
                nodo3.setxx(x+2);
                nodo3.setyy(y-2);System.out.println(nodo3.getxant()+" "+nodo3.getyant()+" el 3a es ant de "+nodo3.getx()+" "+nodo3.gety()+" post "+nodo3.getxpost()+" "+nodo3.getypost());
                matriz[x+2][y-2]=nodo3;
                matriz1=matriz;
                return true;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        return false;
    }

    private boolean diagonalarribaizq(int x, int y, NodoCelda[][] matriz) {
        try{
            // si diagonal arriba a la izquierda
            if(!matriz[x-1][y-1].getusado() && !matriz[x-2][y-2].getusado() ){
                nodo2=new NodoCelda();
                nodo2.setcanti(3);
                nodo2.sethund(false);
                nodo2.setusa(true);
                nodo2.settoc(false);
                nodo2.setxanti(x);
                nodo2.setyanti(y);
                nodo2.setxposte(x-2);
                nodo2.setyposte(y-2);
                nodo2.setxx(x-1);
                nodo2.setyy(y-1);System.out.println(x+" "+y+" el 2c es ant de "+nodo2.getx()+" "+nodo2.gety()+" post "+nodo2.getxpost()+" "+nodo2.getypost());
                matriz[x-1][y-1]=nodo2;
                nodo3=new NodoCelda();
                nodo3.setcanti(3);
                nodo3.sethund(false);
                nodo3.setusa(true);
                nodo3.settoc(false);
                nodo3.setxanti(x-1);
                nodo3.setyanti(y-1);
                nodo3.setxposte(-1);
                nodo3.setyposte(-1);
                nodo3.setxx(x-2);
                nodo3.setyy(y-2);System.out.println(nodo3.getxant()+" "+nodo3.getyant()+" el 3c es ant de "+nodo3.getx()+" "+nodo3.gety()+" "+nodo3.gety()+" post "+nodo3.getxpost()+" "+nodo3.getypost());
                matriz[x-2][y-2]=nodo3;
                matriz1=matriz;
                return true;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        return false;
    }

    private boolean diagonalabajoizq(int x, int y, NodoCelda[][] matriz) {
        try{
            // si diagonal abajo a la izquierda
            if(!matriz[x-1][y+1].getusado() && !matriz[x-2][y+2].getusado() ){
                nodo2=new NodoCelda();
                nodo2.setcanti(3);
                nodo2.sethund(false);
                nodo2.setusa(true);
                nodo2.settoc(false);
                nodo2.setxanti(x);
                nodo2.setyanti(y);
                nodo2.setxposte(x-2);
                nodo2.setyposte(y+2);
                nodo2.setxx(x-1);
                nodo2.setyy(y+1);System.out.println(x+" "+y+" el 2b es ant de "+nodo2.getx()+" "+nodo2.gety()+" post "+nodo2.getxpost()+" "+nodo2.getypost());
                matriz[x-1][y+1]=nodo2;
                nodo3=new NodoCelda();
                nodo3.setcanti(3);
                nodo3.sethund(false);
                nodo3.setusa(true);
                nodo3.settoc(false);
                nodo3.setxanti(x-1);
                nodo3.setyanti(y+1);
                nodo3.setxposte(-1);
                nodo3.setyposte(-1);
                nodo3.setxx(x-2);
                nodo3.setyy(y+2);System.out.println(nodo3.getxant()+" "+nodo3.getyant()+" el 3b es ant de "+nodo3.getx()+" "+nodo3.gety()+" post "+nodo3.getxpost()+" "+nodo3.getypost());
                matriz[x-2][y+2]=nodo3;
                matriz1=matriz;
                return true;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        return false;
    }

    private boolean diagonalabajoder(int x, int y, NodoCelda[][] matriz) {
        try{
            // si diagonal abajo a la derecha
            if(!matriz[x+1][y+1].getusado() && !matriz[x+2][y+2].getusado() ){
                nodo2=new NodoCelda();
                nodo2.setcanti(3);
                nodo2.sethund(false);
                nodo2.setusa(true);
                nodo2.settoc(false);
                nodo2.setxanti(x);
                nodo2.setyanti(y);
                nodo2.setxposte(x+2);
                nodo2.setyposte(y+2);
                nodo2.setxx(x+1);
                nodo2.setyy(y+1);System.out.println(x+" "+y+" el 2d es ant de "+nodo2.getx()+" "+nodo2.gety()+" post "+nodo2.getxpost()+" "+nodo2.getypost());
                matriz[x+1][y+1]=nodo2;
                nodo3=new NodoCelda();
                nodo3.setcanti(3);
                nodo3.sethund(false);
                nodo3.setusa(true);
                nodo3.settoc(false);
                nodo3.setxanti(x+1);
                nodo3.setyanti(y+1);
                nodo3.setxposte(-1);
                nodo3.setyposte(-1);
                nodo3.setxx(x+2);
                nodo3.setyy(y+2);System.out.println(nodo3.getxant()+" "+nodo3.getyant()+" el 3d es ant de "+nodo3.getx()+" "+nodo3.gety()+" "+nodo3.gety()+" post "+nodo3.getxpost()+" "+nodo3.getypost());
                matriz[x+2][y+2]=nodo3;
                matriz1=matriz;
                return true;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        return false;
    }

    private boolean verticalarriba(int x, int y, NodoCelda[][] matriz) {
        try{
            // misma columna arriba
            if(!matriz[x][y-1].getusado() && !matriz[x][y-2].getusado() ){
                nodo2=new NodoCelda();
                nodo2.setcanti(3);
                nodo2.sethund(false);
                nodo2.setusa(true);
                nodo2.settoc(false);
                nodo2.setxanti(x);
                nodo2.setyanti(y);
                nodo2.setxposte(x);
                nodo2.setyposte(y-2);
                nodo2.setxx(x);
                nodo2.setyy(y-1);System.out.println(x+" "+y+" el 2e es ant de "+nodo2.getx()+" "+nodo2.gety()+" post "+nodo2.getxpost()+" "+nodo2.getypost());
                matriz[x][y-1]=nodo2;
                nodo3=new NodoCelda();
                nodo3.setcanti(3);
                nodo3.sethund(false);
                nodo3.setusa(true);
                nodo3.settoc(false);
                nodo3.setxanti(x);
                nodo3.setyanti(y-1);
                nodo3.setxposte(-1);
                nodo3.setyposte(-1);
                nodo3.setxx(x);
                nodo3.setyy(y-2);System.out.println(nodo3.getxant()+" "+nodo3.getyant()+" el 3e es ant de "+nodo3.getx()+" "+nodo3.gety()+" "+nodo3.gety()+" post "+nodo3.getxpost()+" "+nodo3.getypost());
                matriz[x][y-2]=nodo3;
                matriz1=matriz;
                return true;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        return false;
    }

    private boolean verticalabajo(int x, int y, NodoCelda[][] matriz) {
        try{
            // misma columna abajo
            if(!matriz[x][y+1].getusado() && !matriz[x][y+2].getusado() ){
                nodo2=new NodoCelda();
                nodo2.setcanti(3);
                nodo2.sethund(false);
                nodo2.setusa(true);
                nodo2.settoc(false);
                nodo2.setxanti(x);
                nodo2.setyanti(y);
                nodo2.setxposte(x);
                nodo2.setyposte(y+2);
                nodo2.setxx(x);
                nodo2.setyy(y+1);System.out.println(x+" "+y+" el 2f es ant de "+nodo2.getx()+" "+nodo2.gety()+" post "+nodo2.getxpost()+" "+nodo2.getypost());
                matriz[x][y+1]=nodo2;
                nodo3=new NodoCelda();
                nodo3.setcanti(3);
                nodo3.sethund(false);
                nodo3.setusa(true);
                nodo3.settoc(false);
                nodo3.setxanti(x);
                nodo3.setyanti(y+1);
                nodo3.setxposte(-1);
                nodo3.setyposte(-1);
                nodo3.setxx(x);
                nodo3.setyy(y+2);System.out.println(nodo3.getxant()+" "+nodo3.getyant()+" el 3f es ant de "+nodo3.getx()+" "+nodo3.gety()+" "+nodo3.gety()+" post "+nodo3.getxpost()+" "+nodo3.getypost());
                matriz[x][y+2]=nodo3;
                matriz1=matriz;
                return true;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        return false;
    }

    private boolean horizontalder(int x, int y, NodoCelda[][] matriz) {
        try{
            // misma fila derecha
            if(!matriz[x+1][y].getusado() && !matriz[x+2][y].getusado() ){
                nodo2=new NodoCelda();
                nodo2.setcanti(3);
                nodo2.sethund(false);
                nodo2.setusa(true);
                nodo2.settoc(false);
                nodo2.setxanti(x);
                nodo2.setyanti(y);
                nodo2.setxposte(x+2);
                nodo2.setyposte(y);
                nodo2.setxx(x+1);
                nodo2.setyy(y);System.out.println(x+" "+y+" el 2i es ant de "+nodo2.getx()+" "+nodo2.gety()+" post "+nodo2.getxpost()+" "+nodo2.getypost());
                matriz[x+1][y]=nodo2;
                nodo3=new NodoCelda();
                nodo3.setcanti(3);
                nodo3.sethund(false);
                nodo3.setusa(true);
                nodo3.settoc(false);
                nodo3.setxanti(x+1);
                nodo3.setyanti(y);
                nodo3.setxposte(-1);
                nodo3.setyposte(-1);
                nodo3.setxx(x+2);
                nodo3.setyy(y);System.out.println(nodo3.getxant()+" "+nodo3.getyant()+" el 3i es ant de "+nodo3.getx()+" "+nodo3.gety()+" "+nodo3.gety()+" post "+nodo3.getxpost()+" "+nodo3.getypost());
                matriz[x+2][y]=nodo3;
                matriz1=matriz;
                return true;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        return false;
    }

    private boolean horizontalizq(int x, int y, NodoCelda[][] matriz) {
        try{
            // misma fila izquierda
            if(!matriz[x-1][y].getusado() && !matriz[x-2][y].getusado() ){
                nodo2=new NodoCelda();
                nodo2.setcanti(3);
                nodo2.sethund(false);
                nodo2.setusa(true);
                nodo2.settoc(false);
                nodo2.setxanti(x);
                nodo2.setyanti(y);
                nodo2.setxposte(x-2);
                nodo2.setyposte(y);
                nodo2.setxx(x-1);
                nodo2.setyy(y);System.out.println(x+" "+y+" el 2g es ant de "+nodo2.getx()+" "+nodo2.gety()+" post "+nodo2.getxpost()+" "+nodo2.getypost());
                matriz[x-1][y]=nodo2;
                nodo3=new NodoCelda();
                nodo3.setcanti(3);
                nodo3.sethund(false);
                nodo3.setusa(true);
                nodo3.settoc(false);
                nodo3.setxanti(x-1);
                nodo3.setyanti(y);
                nodo3.setxposte(-1);
                nodo3.setyposte(-1);
                nodo3.setxx(x-2);
                nodo3.setyy(y);System.out.println(nodo3.getxant()+" "+nodo3.getyant()+" el 3g es ant de "+nodo3.getx()+" "+nodo3.gety()+" "+nodo3.gety()+" post "+nodo3.getxpost()+" "+nodo3.getypost());
                matriz[x-2][y]=nodo3;
                matriz1=matriz;
                return true;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        return false;
    }
    public void juegamaquina(String columnam, String filam, int midisparo){
        int col=0;
        switch(columnam){
            case "A": col=0;break;
            case "B": col=1;break;
            case "C": col=2;break;
            case "D": col=3;break;
            case "E": col=4;break;
            case "F": col=5;break;
            case "G": col=6;break;
            case "H": col=7;break;
            case "I": col=8;break;
            case "J": col=9;break;
            default: col=-1;break;
        }
        int fila=0;
        if(!"-".equals(filam)) fila=Integer.parseInt(filam);
        if (fila>0) fila--;

        
        if("-".equals(columnam) || arrtoc.isEmpty() && midisparo==1 ){// si es la primera vez o el arrtoc vacio y es agua.
            System.out.println("primero");
            if(!"-".equals(columnam)) guardanodomatriz(col,fila); // si no es la primera vez guardoel nodo en la matriz indicando usado.
            tirartiro();// busca un lugar no usado en la matriz y carga las variables columna-fila
        }else{
            if(arrtoc.isEmpty() && midisparo==3){
                System.out.println("segundo");
                avh(col,fila);// tocado y hundido, barco de 1.
            }else if(arrtoc.isEmpty() && midisparo==2){
                System.out.println("tercero");
                avt(col,fila);
            }else if(arrtoc.size()==1){
                System.out.println("cuarto");
                arrtoctiene1(col,fila,midisparo);
            }else{
                System.out.println("tiene mas 1");
                arrtoctienemas1(col,fila,midisparo);
            }
            
            }
        
    }

     private void guardanodomatriz(int col,int fila) {
        NodoCelda nodo=new NodoCelda();
        nodo.setcanti(0);
        nodo.sethund(false);
        nodo.settoc(false);
        nodo.setusa(true);
        nodo.setxanti(-1);
        nodo.setyanti(-1);
        nodo.setxposte(-1);
        nodo.setyposte(-1);
        nodo.setxx(col);
        nodo.setyy(fila);
        matrizj[col][fila]=nodo;
    }

    private void tirartiro() {
        // por ahora tiro al azar, pero luego cambio aqui por un algoritmo mas sofisticado.
        // funcion que elige un tiro.
        boolean otro=false;
        do{
            columna=(int)Math.floor(Math.random()*9);//
            fila=(int)Math.floor(Math.random()*9);//
            if(!matrizj[columna][fila].getusado()){
                matrizj[columna][fila].setusa(true);
                matrizj[columna][fila].setxx(columna);
                matrizj[columna][fila].setyy(fila);
                otro=true;
                columna++;
                fila++;
            }
        }while(!otro);
        
    }

    private void avh(int col, int fila) {
        matrizj[col][fila].setcanti(1);
        matrizj[col][fila].sethund(true);
        matrizj[col][fila].settoc(true);
        matrizj[col][fila].setusa(true);
        
        tirartiro();
    }

    private void avt(int col, int fila) {
        NodoCelda nodo=new NodoCelda();  
       
            
        matrizj[col][fila].setusa(true);
        arrtoc.add(matrizj[col][fila]);
        int cantx=4;
        
        int colx=0;
        if(col==0) {
            colx=0;
            
        }
        else colx=col-1;
        // si es la primer o ultima columna, solo recorro 2 columnas
        if(col==0 || col==9){
            cantx=3;
        }
        int filay=0;
        int canty=4;
        if (fila==0) {
            filay=0;
            
        }else filay=fila-1;
        
        // si es la primer o ultima fila, solo recorro 2 filas
        if(fila==0 || fila==9){
            canty=3;
        }

        for(int y=1;y<canty;y++){
            for(int x=1;x<cantx;x++){
                if(colx<10 && filay<10){
                    
                    if(!matrizj[colx][filay].getusado()){
                        nodo=new NodoCelda();
                        nodo.setcanti(0);
                        nodo.sethund(false);
                        nodo.settoc(false);
                        nodo.setusa(true);
                        nodo.setxx(colx);
                        nodo.setyy(filay);
                        nodo.setxanti(-1);
                        nodo.setyanti(-1);
                        nodo.setxposte(-1);
                        nodo.setyposte(-1);
                        arrjugada.add(nodo);
                        
                        
                    }
                    colx++;
                }
                
            }
            colx=0;
            if(col==0) colx=0;
            else colx=col-1;
            filay++;
        }
        // tomo al azar uno de los nodos de arrjugada
        int x=arrjugada.size()-1;
        int n=(int)Math.floor(Math.random()*x);//El random lo hago segun la cantidad de nodos.
        columna=arrjugada.get(n).getx()+1;
        this.fila=arrjugada.get(n).gety()+1;
        
    }

    private void arrtoctiene1(int col, int fila, int midisparo) {
        switch (midisparo) {
            case 1:
                {
                    int n=arrjugada.size()-1;
                    columna=arrjugada.get(n).getx();
                    this.fila=arrjugada.get(n).gety();
                    matrizj[columna][this.fila].setusa(true);
                    arrjugada.remove(n);
                    n=arrjugada.size()-1;
                    columna=arrjugada.get(n).getx()+1;
                    this.fila=arrjugada.get(n).gety()+1;
                    break;
                }
            case 2:
                {
                    int n=arrjugada.size()-1;
                    arrtoc.add(arrjugada.get(n));
                    matrizj[col][fila].setusa(true);
                    matrizj[col][fila].settoc(true);
                    arrjugada.remove(n);
                    determina2ndos(col,fila);
                    break;
                }
            case 3:
                {// 
                    int n=arrjugada.size()-1;
                    arrtoc.add(arrjugada.get(n));
                    matrizj[col][fila].setusa(true);
                    matrizj[col][fila].settoc(true);
                    matrizj[col][fila].sethund(true);
                    arrjugada.clear();
                    this.tirartiro();
                }
            default:
                break;
        }
    }

    private void arrtoctienemas1(int col, int mfila, int midisparo) {
        if(midisparo==1){
            int n=arrjugada.size()-1;
            columna=arrjugada.get(n).getx();
            this.fila=arrjugada.get(n).gety();
            matrizj[columna][this.fila].setusa(true);
            arrjugada.remove(n);
            n=arrjugada.size()-1;
            columna=arrjugada.get(n).getx()+1;
            this.fila=arrjugada.get(n).gety()+1;
        }else if(midisparo==2){
            int n=arrjugada.size()-1;
            columna=arrjugada.get(n).getx();
            this.fila=arrjugada.get(n).gety();
            matrizj[columna][this.fila].setusa(true);
            matrizj[columna][this.fila].settoc(true);
            // falta determinar el anterior y el posterior
            arrjugada.remove(n);
            n=arrjugada.size()-1;
            columna=arrjugada.get(n).getx()+1;
            this.fila=arrjugada.get(n).gety()+1;
            System.out.println("else");
        }
    }

    private void determina2ndos(int col, int fila) {
        arrtoc.sort(null);// ordena los nodos de arrtoc por columna de menor a mayor
        int x=arrtoc.get(0).getx();
        int y=arrtoc.get(0).gety();
        int x1=arrtoc.get(1).getx();
        int y1=arrtoc.get(1).gety();
        if(y==y1){// si las filas son iguales es horizontal.
            if(x>0){// si no estoy en la primer columna, armo nodo de mas a la izq.
                columna=arrtoc.get(0).getx()-1;
                this.fila=y;
                NodoCelda nodo=new NodoCelda();
                nodo.setcanti(0);
                nodo.sethund(false);
                nodo.settoc(true);
                nodo.setusa(true);
                nodo.setxanti(-1);
                nodo.setyanti(-1);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(columna);
                nodo.setyy(this.fila);
                arrjugada.add(nodo);
                
            }
            // ahora armo el segundo nodo
            if(x<9){
                columna=arrtoc.get(1).getx()+1;
                this.fila=y;
                NodoCelda nodo=new NodoCelda();
                nodo.setcanti(0);
                nodo.sethund(false);
                nodo.settoc(true);
                nodo.setusa(true);
                nodo.setxanti(-1);
                nodo.setyanti(-1);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(columna);
                nodo.setyy(this.fila);
                arrjugada.add(nodo);
                
            }
            // guardo en la matriz el primer nodo de arrjugadas y luego lo elimino, asi la siguiente vez me queda el otro nodo.
            columna=arrjugada.get(0).getx()+1;
            this.fila=arrjugada.get(0).gety()+1;
            matrizj[columna][this.fila]=arrjugada.get(0);
            arrjugada.remove(0);
        }else if(x==x1){// vertical
            if(y>0){// si no estoy en la primer columna, armo nodo de mas a la izq.
                this.fila=arrtoc.get(0).gety()-1;
                columna=x;
                NodoCelda nodo=new NodoCelda();
                nodo.setcanti(0);
                nodo.sethund(false);
                nodo.settoc(true);
                nodo.setusa(true);
                nodo.setxanti(-1);
                nodo.setyanti(-1);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(columna);
                nodo.setyy(this.fila);
                arrjugada.add(nodo);
                
            }
            // ahora armo el segundo nodo
            if(y<9){
                this.fila=arrtoc.get(1).gety()+1;
                columna=x;
                NodoCelda nodo=new NodoCelda();
                nodo.setcanti(0);
                nodo.sethund(false);
                nodo.settoc(true);
                nodo.setusa(true);
                nodo.setxanti(-1);
                nodo.setyanti(-1);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(columna);
                nodo.setyy(this.fila);
                arrjugada.add(nodo);
                
            }
            // guardo en la matriz el primer nodo de arrjugadas y luego lo elimino, asi la siguiente vez me queda el otro nodo.
            columna=arrjugada.get(0).getx()+1;
            this.fila=arrjugada.get(0).gety()+1;
            matrizj[columna][this.fila]=arrjugada.get(0);
            arrjugada.remove(0);
        }else{// es diagonal
            
            this.fila=arrtoc.get(0).gety();
            columna=arrtoc.get(0).getx();
            System.out.println("aqui 0 y uno "+arrtoc.get(0).gety()+" uno"+arrtoc.get(1).gety());
            if(arrtoc.get(0).gety()<arrtoc.get(1).gety()) {// resto y sumo en los 2.
                if(columna>0 && this.fila>0){
                    columna--;
                    this.fila--;
                    NodoCelda nodo=new NodoCelda();
                    nodo.setcanti(0);
                    nodo.sethund(false);
                    nodo.settoc(true);
                    nodo.setusa(true);
                    nodo.setxanti(-1);
                    nodo.setyanti(-1);
                    nodo.setxposte(-1);
                    nodo.setyposte(-1);
                    nodo.setxx(columna);
                    nodo.setyy(this.fila);
                    arrjugada.add(nodo);
                }
                if(columna<9 && this.fila<9){
                    columna++;
                    this.fila++;
                    NodoCelda nodo=new NodoCelda();
                    nodo.setcanti(0);
                    nodo.sethund(false);
                    nodo.settoc(true);
                    nodo.setusa(true);
                    nodo.setxanti(-1);
                    nodo.setyanti(-1);
                    nodo.setxposte(-1);
                    nodo.setyposte(-1);
                    nodo.setxx(columna);
                    nodo.setyy(this.fila);
                    arrjugada.add(nodo);
                }
            }else{
                if(columna>0 && this.fila<9){
                    columna--;
                    this.fila++;
                    NodoCelda nodo=new NodoCelda();
                    nodo.setcanti(0);
                    nodo.sethund(false);
                    nodo.settoc(true);
                    nodo.setusa(true);
                    nodo.setxanti(-1);
                    nodo.setyanti(-1);
                    nodo.setxposte(-1);
                    nodo.setyposte(-1);
                    nodo.setxx(columna);
                    nodo.setyy(this.fila);
                    arrjugada.add(nodo);
                }
                if(columna<9 && this.fila>0){
                    columna++;
                    this.fila--;
                    NodoCelda nodo=new NodoCelda();
                    nodo.setcanti(0);
                    nodo.sethund(false);
                    nodo.settoc(true);
                    nodo.setusa(true);
                    nodo.setxanti(-1);
                    nodo.setyanti(-1);
                    nodo.setxposte(-1);
                    nodo.setyposte(-1);
                    nodo.setxx(columna);
                    nodo.setyy(this.fila);
                    arrjugada.add(nodo);
                }
            }
            
            columna=arrjugada.get(0).getx()+1;
            this.fila=arrjugada.get(0).gety()+1;
            matrizj[columna][this.fila]=arrjugada.get(0);
            arrjugada.remove(0);
        }
    }

    
}
