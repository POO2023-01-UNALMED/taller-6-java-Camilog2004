package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	private static int cantidadCamion;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		Camion.cantidadCamion++;
		this.ejes=ejes;
	}

	public static int getCantidadCamion() {
		return cantidadCamion;
	}

	public static void setCantidadCamion(int cantidadCamion) {
		Camion.cantidadCamion = cantidadCamion;
	}
	
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

}
