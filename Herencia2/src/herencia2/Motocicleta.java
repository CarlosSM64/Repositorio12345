package herencia2;

public class Motocicleta extends Vehiculo {
	public String tipoCasco;

	public Motocicleta(String marca, String modelo, int anio, String tipoCasco) {
		super(marca, modelo, anio);
		this.tipoCasco = tipoCasco;
	}
	
	public void hacerCaballito() {
		System.out.println("La motocicleta está haciendo un caballito");
	}
	
	@Override
	public void vehiculo() {
		System.out.println("***MOTOCICLETA***");
		System.out.println("Marca: "+ this.marca);
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Año: "+ this.anio);
		System.out.println("Tipo de Casco: "+ this.tipoCasco);
	
	}
	
	
}
