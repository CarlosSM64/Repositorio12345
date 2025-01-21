package herencia2;

public class Vehiculo {
	public String marca;
	public String modelo;
	public int anio;
	
	public Vehiculo(String marca, String modelo, int anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		
	}
	public void encender() {
        System.out.println("El vehículo está encendido");
	}
	
	 public void apagar() {
	        System.out.println("El vehículo está apagado");
	}
	 
	public void vehiculo() {
		System.out.println("***VEHICULO***");
		System.out.println("Marca: "+ this.marca);
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Año: "+ this.anio);
		
	}
	

}
