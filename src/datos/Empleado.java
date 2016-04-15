package datos;

import java.sql.Date;

public class Empleado extends Persona {
	
	
	private String cedula;
	private Date fecha_nacimiento;
	private int horas_semanal; 
	//private vehiculo carro;
	public Empleado(String nombre, String p_apellido, String s_apellido,
			String idioma, String direccion, String correo, String telefono,
			String usuario, String clave, String cedula, Date fecha_nacimiento,
			int horas_semanal) {
		super(nombre, p_apellido, s_apellido, idioma, direccion, correo,
				telefono, usuario, clave);
		this.cedula = cedula;
		this.fecha_nacimiento = fecha_nacimiento;
		this.horas_semanal = horas_semanal;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public int getHoras_semanal() {
		return horas_semanal;
	}
	public void setHoras_semanal(int horas_semanal) {
		this.horas_semanal = horas_semanal;
	}
	
	
	

}
