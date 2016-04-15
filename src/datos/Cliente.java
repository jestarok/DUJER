package datos;

import java.sql.Date;
import java.util.ArrayList;

public class Cliente extends Persona {
	private String tarjeta;
	private int codigo;
	private String fecha_exp;
	//private ArrayList<Ride> viajes;
	public Cliente(String nombre, String p_apellido, String s_apellido, String idioma, String direccion, String correo,
			String telefono, String usuario, String clave, String tarjeta,
			int codigo, String fecha_exp) {
		super(nombre, p_apellido, s_apellido, idioma, direccion, correo,
				telefono, usuario, clave);
		this.tarjeta = tarjeta;
		this.codigo = codigo;
		this.fecha_exp = fecha_exp;
	}
	public String getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFecha_exp() {
		return fecha_exp;
	}
	public void setFecha_exp(String fecha_exp) {
		this.fecha_exp = fecha_exp;
	}
	
	
	
	

}
