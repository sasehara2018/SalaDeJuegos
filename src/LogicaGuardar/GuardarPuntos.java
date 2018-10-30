/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaGuardar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author malol
 */
public class GuardarPuntos {
  
   
public void setEscritura(ArrayList<Puntos> pun, String archivo) {
    try
        {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(archivo));
            for(int i=0;i<pun.size();i++){
                Puntos p = new Puntos(pun.get(i).getnombrejuego(),pun.get(i).getnombrejugador(),pun.get(i).getpuntos(),  pun.get(i).getnivel());
                oos.writeObject(p);
            }
                
            
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
}

public ArrayList<Puntos> getLectura(String archivo){
   ObjectInputStream ois=null;
    ArrayList<Puntos> arr=new ArrayList<>();
      
        try{
            File g=new File(archivo);
            FileInputStream fis=new FileInputStream(g);
            ois=new ObjectInputStream(fis);
            
            while(true){
                Puntos gu=(Puntos) ois.readObject();
                arr.add(gu);
                
            }
        }catch(IOException io){           
            
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(GuardarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }
        return arr;
}



}
