package herencia2;

public class Camion extends Vehiculo{
	public String CapacidadDeCarga;

	public Camion(String marca, String modelo, int anio, String capacidadDeCarga) {
		super(marca, modelo, anio);
		CapacidadDeCarga = capacidadDeCarga;
	}
	
	public void descargar() {
		System.out.println("El camión está descargando");
	}
	
	@Override
	public void vehiculo() {
		System.out.println("***CAMIÓN***");
		System.out.println("Marca: "+ this.marca);
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Año: "+ this.anio);
		System.out.println("Capacidad de Carga: " + this.CapacidadDeCarga);
	
	}

}
