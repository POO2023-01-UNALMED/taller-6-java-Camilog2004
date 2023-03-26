package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	public static ArrayList<Pais> listaPaises=new ArrayList<Pais>();
	public static ArrayList<Integer> cantidadPorPais=new ArrayList<Integer>();

	public static Pais paisMasVendedor() {
		
		int valorMax=-1;
		Pais paisMasVendedor=null;
		
		for (Integer i:Pais.cantidadPorPais) {
			if(i>valorMax) {
				valorMax=i;
				paisMasVendedor=Pais.listaPaises.get(valorMax);
				
			}
		}
		
		return paisMasVendedor;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	

}
