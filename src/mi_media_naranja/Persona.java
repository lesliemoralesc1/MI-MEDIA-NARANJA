
package mi_media_naranja;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String sexo;
    protected String usuario;
    protected String clave;
    
    //Constructores
    public Persona(){
        
    }
    
    public Persona (String nom,String cc){
        nombre = nom;
        cedula = cc;
    }
    
    public Persona(String nom,String ape, String cc,String sx){
        nombre = nom;
        apellido = ape;
        cedula = cc;
        sexo =sx;
    }
    public Persona(String nom,String ape, String cc,String sx,String usu,String clv){
        nombre = nom;
        apellido = ape;
        cedula = cc;
        sexo =sx;
        usuario =usu;
        clave = clv;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
