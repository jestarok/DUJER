package datos;

import java.util.ArrayList;

import vistas.Principal;
import vistas.Registrar_cliente;

public class Company {

	private static ArrayList<Cliente> clientes;
	private static ArrayList<Empleado> empleados;
	private static Company company;
	
	
	public static void main(String[] args) {
		clientes = new ArrayList<>();
		Principal p = new Principal();
		p.show();
		}
	
	
	public Company(){
		clientes = new ArrayList<>();
	}
	public static Company getIntances()
	{
		if (company == null)
		{
			company = new Company();
		}
		return company;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public static Company getCompany() {
		return company;
	}

	public static void setCompany(Company company) {
		Company.company = company;
	}


	public static ArrayList<Empleado> getEmpleados() {
		return empleados;
	}


	public static void setEmpleados(ArrayList<Empleado> empleados) {
		Company.empleados = empleados;
	}
	
	
	
	
	
	

}
