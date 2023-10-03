package vehiculos;

import java.util.*;

public class Fabricante {
	private static List<Fabricante> fabricantes = new ArrayList<>();
	private List<Vehiculo> vehiculos = new ArrayList<>();
	private String nombre;
	private Pais pais;
	
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		setPais(pais);
		Fabricante.fabricantes.add(this);
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
		pais.anadirFabrica(this);
	}
	
	public void anadirVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayorVendedor = null;
		int ventasMaximas = 0;
		for (Fabricante fabricante: Fabricante.fabricantes) {
			if (fabricante.vehiculos.size() > ventasMaximas) {
				mayorVendedor = fabricante;
				ventasMaximas = fabricante.vehiculos.size();
			}
		}
		return mayorVendedor;
	}
	
	public int vehiculos() {
		return (this.vehiculos.size());
	}
}