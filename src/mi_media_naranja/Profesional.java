package mi_media_naranja;

/**
 *
 * @author Leslie
 */
public class Profesional extends Persona{
    protected String especialidad;
    protected int no_cuentaahorro;
    protected String respuesta;

    public Profesional() {
    }

    
    public Profesional(String especialidad, int no_cuentaahorro, String respuesta, String nom, String ape, String cc, String sx, String usu, String clv) {
        super(nom, ape, cc, sx, usu, clv);
        this.especialidad = especialidad;
        this.no_cuentaahorro = no_cuentaahorro;
        this.respuesta = respuesta;
    }
    
    /*
    constructores
    metodos
    clases que se derivan
    */
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNo_cuentaahorro() {
        return no_cuentaahorro;
    }

    public void setNo_cuentaahorro(int no_cuentaahorro) {
        this.no_cuentaahorro = no_cuentaahorro;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
}
