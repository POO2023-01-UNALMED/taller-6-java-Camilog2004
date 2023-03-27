package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	public static ArrayList<Pais> listaPaises=new ArrayList<Pais>();
	public static ArrayList<Integer> cantidadPorPais=new ArrayList<Integer>();
	
	
	public Pais(String nombre) {
		this.nombre=nombre;
		
	}

	public static Pais paisMasVendedor() {
		
		int valorMax=-1;
		Pais paisMasVendedor=null;
		int indice=-1;
		
		for (Integer i:Pais.cantidadPorPais) {
			if(i>valorMax) {
				valorMax=i;
				indice=Pais.cantidadPorPais.indexOf(valorMax);
				paisMasVendedor=Pais.listaPaises.get(indice);
				
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
