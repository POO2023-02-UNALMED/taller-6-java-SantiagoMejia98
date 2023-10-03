package vehiculos;
import java.util.*;

public class Fabricante {
	
	protected String nombre;
	protected Pais pais;
	protected static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	protected int cantidadVendidos=0;

	protected Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected Pais getPais() {
		return pais;
	}
	protected void setPais(Pais pais) {
		this.pais = pais;
	}
	
	protected int getCantidadVehiculos() {
		return cantidadVendidos;
	}
	protected void setCantidadVehiculos(int cantidadVehiculos) {
		this.cantidadVendidos = cantidadVehiculos;
	}

	protected static List<Fabricante> getFabricantes() {
		return fabricantes;
	}

	protected static void setFabricantes(ArrayList<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}
	
	protected static Fabricante fabricaMayorVentas() {
		int vendidos = 0;
		Fabricante Vendedor = null;
		
		for (int i = 0; i<Fabricante.fabricantes.size(); i++){
			int x = Fabricante.fabricantes.get(i).cantidadVendidos;
			if (vendidos < x) {
				vendidos = x;
				Vendedor = Fabricante.fabricantes.get(i);
			}
		}
		return Vendedor;
	}
}