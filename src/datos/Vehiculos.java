package datos;

public abstract class Vehiculos {

	private String placa;
	private String marca;
	private String modelo;
	private String color;
	private int year;
	private float tarifa_km;
	
	public Vehiculos(String placa, String marca,
			String modelo, String color, int year, float tarifa_km) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.year = year;
		this.tarifa_km = tarifa_km;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getTarifa_km() {
		return tarifa_km;
	}

	public void setTarifa_km(float tarifa_km) {
		this.tarifa_km = tarifa_km;
	}
	
	public abstract int tarifa();

	
	

}
