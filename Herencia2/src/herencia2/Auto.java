package herencia2;

public class Auto extends Vehiculo{
	public int NumerodePuertas;

	public Auto(String marca, String modelo, int anio, int numerodePuertas) {
		super(marca, modelo, anio);
		NumerodePuertas = numerodePuertas;
	}
	
	public void abrirMaletero() {
		System.out.println("El maletero está abierto");
	}
	
	@Override
	public void vehiculo() {
		System.out.println("***AUTO***");
		System.out.println("Marca: "+ this.marca);
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Año: "+ this.anio);
		System.out.println("NumerodePuertas: "+ this.NumerodePuertas);
	
	}
}
