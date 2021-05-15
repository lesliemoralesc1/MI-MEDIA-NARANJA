/************************************************* ***********************
* Palabra de honor:
* - No he discutido ni mostrado el código de mi programa con alguien que no sea mi compañero
*   Profesor o con el monitor asignado a este curso
* 
* - No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* - Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o curso
* Notas, debe ser claramente señalado con una cita apropiada en
* Los comentarios de mi programa.
*
* <LESLIE LISETH MORALES CASSERES- 0221710026>
*
************************************************** ******************** */

package mi_media_naranja;
import Ventana.Inicio;
import java.util.ArrayList;

public class Agencia {
    
    ArrayList<Cliente> cliente = new ArrayList();
    ArrayList<Profesional> personal = new ArrayList();
    ArrayList<Cliente> baja = new ArrayList();
    ArrayList<Cliente> satisfaccion = new ArrayList();
    ArrayList<Persona> usuario = new ArrayList();
    ArrayList<Cita> cita = new ArrayList();
      
    public ArrayList<Profesional> getPersonal() { return personal; }
    public ArrayList<Cliente> getCliente() { return cliente;}
    public ArrayList<Cliente> getBaja() {return baja; }   
    public ArrayList<Cliente> getSatisfaccion() { return satisfaccion;}   
    public ArrayList<Persona> getUsuario() { return usuario;}    
    public ArrayList<Cita> getCita() { return cita;}
    
    public void setPersonal(ArrayList<Profesional> personal) { this.personal = personal;} 
    public void setCliente(ArrayList<Cliente> cliente) { this.cliente = cliente;}
    public void setBaja(ArrayList<Cliente> baja) { this.baja = baja;}
    public void setSatisfaccion(ArrayList<Cliente> satisfaccion) {this.satisfaccion = satisfaccion;}
    public void setUsuario(ArrayList<Persona> usuario) {this.usuario = usuario;}
    public void setCita(ArrayList<Cita> cita) {this.cita = cita; }
   
    public static void main(String[] args) {
       Inicio p = new Inicio();
       
       p.setVisible(true);
       
    }
    public Agencia() {
    }
     
    public Agencia asignarUsuario() {
    Agencia a = new Agencia();
      return   a;
    }
}
