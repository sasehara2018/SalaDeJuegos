
package PiedraPapelTijera;


public class PiedraPapelTijera {
public PiedraPapelTijera(){
    
}

    public int resultado(int juguno) {
        int res=0;
    int maquina =(int) (Math.random ()*3+1);    
    if(juguno==maquina){
     res=2;
     }else if(juguno==1){
      if(maquina==3){
      res=1;
      }else if(maquina==2){
        res=3;
       }
    }else if(juguno==2){
     if(maquina==1){
      res=1;
    }else if(maquina==3){
      res=3;
    }
    }else if(juguno==3){
     if(maquina==2){
      res=1;
    }else if(maquina==1){
      res=3;
     }
    

   }
    return res;
    }
}

    