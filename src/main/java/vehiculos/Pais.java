package vehiculos;

import java.util.List;
import java.util.ArrayList;

public class Pais {
	private static List<Pais> paises = new ArrayList<>();
	private List<Fabricante> fabricas= new ArrayList<>();
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.paises.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void anadirFabrica(Fabricante fabrica) {
		this.fabricas.add(fabrica);
	}
	
	public static Pais paisMasVendedor() {
		Pais paisMasVendedor = null;
		int mayorVenta = 0;
		for (Pais pais : Pais.paises) {
			int ventas = 0;
			for (Fabricante fabrica : pais.fabricas) {
				ventas = ventas + fabrica.vehiculos();
			}
			if (ventas > mayorVenta) {
				paisMasVendedor = pais;
				mayorVenta = ventas;
			}
		}
		return paisMasVendedor;
	}
}