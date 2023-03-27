package vehiculos;

public class Vehiculo {
	
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos++;
		
		//Código para llenar las listas fabricante y pais
		
		if(Pais.listaPaises.contains(fabricante.getPais())) {
			//Indice del Pais ingresado (Ya existente)
			int indice=Pais.listaPaises.indexOf(fabricante.getPais());
			//Valor que tiene la otra lista en ese indice
			int valorMomentaneo=Pais.cantidadPorPais.get(indice);
			//Se le suma 1
			Pais.cantidadPorPais.set(indice,valorMomentaneo+1);
		}else {
			Pais.listaPaises.add(fabricante.getPais());
			//Add añade al final de la lista
			Pais.cantidadPorPais.add(1);
		}
		
		if (Fabricante.listaFabricantes.contains(fabricante)) {
			//Indice del Fabricante ingresado (Ya existente)
			int indice=Fabricante.listaFabricantes.indexOf(fabricante);
			//Valor que tiene la otra lista en ese indice
			int valorMomentaneo=Fabricante.cantidadPorFabricante.get(indice);
			//Se le suma 1
			Fabricante.cantidadPorFabricante.set(indice, valorMomentaneo+1);
			
		}else {
			Fabricante.listaFabricantes.add(fabricante);
			Fabricante.cantidadPorFabricante.add(1);
		}
		
	}
	
	public String vehiculosPorTipo() {
		
		return "Automoviles: " + Automovil.getCantidadAutomovil() +"\nCamionetas: " + Camioneta.getCantidadCamioneta()+"\nCamiones: "+Camion.getCantidadCamion();
		
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.CantidadVehiculos = cantidadVehiculos;
	}
	
	
	
	
}
