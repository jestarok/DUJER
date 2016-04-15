package datos;

public class Persona {
	
	private String nombre;
	private String p_apellido;
	private String s_apellido;
	private String idioma;
	private String direccion;
	private String correo;
	private String telefono;
	private String usuario;
	private String clave;
	// imagen;
	public Persona(String nombre, String p_apellido, String s_apellido,
			 String idioma, String direccion, String correo,
			String telefono, String usuario, String clave) {
		super();
		this.nombre = nombre;
		this.p_apellido = p_apellido;
		this.s_apellido = s_apellido;
		this.idioma = idioma;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.usuario = usuario;
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getP_apellido() {
		return p_apellido;
	}
	public void setP_apellido(String p_apellido) {
		this.p_apellido = p_apellido;
	}
	public String getS_apellido() {
		return s_apellido;
	}
	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}
	
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
