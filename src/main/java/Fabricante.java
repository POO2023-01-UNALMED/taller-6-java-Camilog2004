package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	public static ArrayList<Fabricante> listaFabricantes=new ArrayList<Fabricante>();
	public static ArrayList<Integer> cantidadPorFabricante=new ArrayList<Integer>();
	
	public static Fabricante fabricaMayorVentas() {
		int valorMax=-1;
		Fabricante fabricanteMasVentas=null;
		
		for(Integer i:Fabricante.cantidadPorFabricante) {
			if(i>valorMax) {
				valorMax=i;
				fabricanteMasVentas=Fabricante.listaFabricantes.get(valorMax);		
			}
		}
		
		return fabricanteMasVentas;
	}
	
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

	

}
