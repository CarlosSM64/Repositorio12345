package herencia2;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo obj1 = new Vehiculo("Nissan","Renault Nissan Mitsubishi",2013);
		obj1.vehiculo();
		obj1.apagar();
		
		Auto obj2 = new Auto("BMW","BMW Group",2015,4);
		obj2.vehiculo();
		obj2.encender();
		obj2.abrirMaletero();
		
		Motocicleta obj3 = new Motocicleta("KTM","125 SMC R 2025",2025,"Casco Trial");
		obj3.vehiculo();
		obj3.hacerCaballito();
		
		Camion obj4 = new Camion("VOLVO","Gama FH",2020,"20 toneladas");
		obj4.vehiculo();
		obj4.descargar();
		
		

	}

}
