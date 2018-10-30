
package LogicaGuardar;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 4to Info 2018
 */
public class GuardarUsuario implements Serializable {
private static final long serialVersionVID=1L;

public GuardarUsuario(){
  
}
 
public void setEscritura(ArrayList<Jugador> pun, String archivo){
    try
        {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(archivo));
            for(int i=0;i<pun.size();i++){
                Jugador p = new Jugador(pun.get(i).getnombre(),pun.get(i).getcontrasena());
                oos.writeObject(p);
            }
                
            
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
   
}

public ArrayList<Jugador> getLectura(String archivo){
   ObjectInputStream ois=null;
    ArrayList<Jugador> arr=new ArrayList<>();
      
        try{
            File g=new File(archivo);
            FileInputStream fis=new FileInputStream(g);
            ois=new ObjectInputStream(fis);
            
            while(true){
                Jugador gu=(Jugador) ois.readObject();
                arr.add(gu);
                
            }
        }catch(IOException io){           
            
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(GuardarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }
        return arr;
}

}
