package mi_media_naranja;

/**
 *
 * @author Leslie
 */
public class Cliente extends Persona{

    protected String pais;
    protected String departamento;
    protected String ciudad;
    protected String direccion;
    protected String email;
    protected String estadocivil;
    protected int edad;
    protected boolean hijos;
    protected String no_tarjetacredito;
    protected String codigo_tarjeta;
    protected float estatura;
    protected float peso;
    protected String nivelcultural;
    protected String niveleducativo;
    protected String aficiones;
    //--------------Datos De Su Media Naranja---------------------
   protected String estadocivilmedia;
   protected int edadmedia;
   protected boolean hijosmedia;
   protected String nivelculturalmedia;
   protected float estaturamedia;
   protected float pesomedia;
    
    //Constructores
   public Cliente(){
       
   }
   
    public Cliente(String nom, String cc){
       super(nom,cc); 
       
    }
    
    public Cliente(String nom, String ape, String cc, String sx) {
        super(nom, ape, cc, sx);
    }
      public Cliente(String pais, String departamento, String ciudad, String direccion, String email, String estadocivil, int edad, boolean hijos, String no_tarjetacredito, String codigo_tarjeta, float estatura, float peso, String nivelcultural, String niveleducativo, String aficiones, String estadocivilmedia, int edadmedia, boolean hijosmedia, String nivelculturalmedia, float estaturamedia, float pesomedia, String nom, String ape, String cc, String sx, String usu, String clv) {
        super(nom, ape, cc, sx, usu, clv);
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.email = email;
        this.estadocivil = estadocivil;
        this.edad = edad;
        this.hijos = hijos;
        this.no_tarjetacredito = no_tarjetacredito;
        this.codigo_tarjeta = codigo_tarjeta;
        this.estatura = estatura;
        this.peso = peso;
        this.nivelcultural = nivelcultural;
        this.niveleducativo = niveleducativo;
        this.aficiones = aficiones;
        this.estadocivilmedia = estadocivilmedia;
        this.edadmedia = edadmedia;
        this.hijosmedia = hijosmedia;
        this.nivelculturalmedia = nivelculturalmedia;
        this.estaturamedia = estaturamedia;
        this.pesomedia = pesomedia;
    }
   

    //public static void 
    
    public String getPais(){
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isHijos() {
        return hijos;
    }

    public void setHijos(boolean hijos) {
        this.hijos = hijos;
    }

    public String getNo_tarjetacredito() {
        return no_tarjetacredito;
    }

    public void setNo_tarjetacredito(String no_tarjetacredito) {
        this.no_tarjetacredito = no_tarjetacredito;
    }

    public String getCodigo_tarjeta() {
        return codigo_tarjeta;
    }

    public void setCodigo_tarjeta(String codigo_tarjeta) {
        this.codigo_tarjeta = codigo_tarjeta;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNivelcultural() {
        return nivelcultural;
    }

    public void setNivelcultural(String nivelcultural) {
        this.nivelcultural = nivelcultural;
    }

    public String getNiveleducativo() {
        return niveleducativo;
    }

    public void setNiveleducativo(String niveleducativo) {
        this.niveleducativo = niveleducativo;
    }

    public String getAficiones() {
        return aficiones;
    }

    public void setAficiones(String aficiones) {
        this.aficiones = aficiones;
    }

    public String getEstadocivilmedia() {
        return estadocivilmedia;
    }

    public void setEstadocivilmedia(String estadocivilmedia) {
        this.estadocivilmedia = estadocivilmedia;
    }

    public int getEdadmedia() {
        return edadmedia;
    }

    public void setEdadmedia(int edadmedia) {
        this.edadmedia = edadmedia;
    }

    public boolean isHijosmedia() {
        return hijosmedia;
    }

    public void setHijosmedia(boolean hijosmedia) {
        this.hijosmedia = hijosmedia;
    }

    public String getNivelculturalmedia() {
        return nivelculturalmedia;
    }

    public void setNivelculturalmedia(String nivelculturalmedia) {
        this.nivelculturalmedia = nivelculturalmedia;
    }

    public float getEstaturamedia() {
        return estaturamedia;
    }

    public void setEstaturamedia(float estaturamedia) {
        this.estaturamedia = estaturamedia;
    }

    public float getPesomedia() {
        return pesomedia;
    }

    public void setPesomedia(float pesomedia) {
        this.pesomedia = pesomedia;
    }
}
