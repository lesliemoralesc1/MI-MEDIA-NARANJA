
package Archivos;

import java.io.*;
import java.util.ArrayList;
import mi_media_naranja.Cliente;

public class Archivo {
    
    private FileOutputStream fileO = null;
    private ObjectOutputStream output = null;
    private FileInputStream fileI = null;
    private ObjectInputStream input = null;
    //creo el archivo para poder escribir en él
    public void abrirEscribir(String url){
        try {
            fileO = new FileOutputStream(url);
            output = new ObjectOutputStream(fileO);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    //abrir el archivo para luego leerlo por el metodo leer
    public void abrirLeer(String url){
        try {
            fileI = new FileInputStream(url);
            input = new ObjectInputStream(fileI);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    //Cuando mando los datos al archivo
    
    
    
    public void escribir( ArrayList<Cliente> cliente ){
        try{
            if(output != null){
                output.writeObject(cliente);
                
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    //Lee los objetos que estan el archivo
    public Cliente[] leer(){
        Cliente p[] = null;
            if(input != null){
                try{
                    p = (Cliente[]) input.readObject();
                }catch(IOException | ClassNotFoundException e){
                    System.out.println(e.getMessage());
                }
            }
        return p;//Devuelve un objeto vector
    }
    
    public void cerrar(){
        try{
            if(fileO != null){//Si el output está abierto lo cierra, para poder terminar y guardar toda la información
                fileO.close();
            }else if(fileI != null){//Si el input está abierto lo cierra, para poder terminar y guardar toda la información
                fileI.close();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
