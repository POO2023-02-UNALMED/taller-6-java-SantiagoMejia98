package vehiculos;
import java.util.*;

public class Pais {
	
	protected String nombre;
	protected static ArrayList<Pais> paises = new ArrayList<Pais>();
	protected int cantidadVendidos = 0;
	
	protected Pais(String nombre) {	
		this.nombre = nombre;		
		paises.add(this);
		cantidadVendidos++;
	}

	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getCantidadVehiculos() {
		return cantidadVendidos;
	}
	protected void setCantidadVehiculos(int cantidadVehiculos) {
		this.cantidadVendidos = cantidadVehiculos;
	}

	protected static List<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}

	public static Pais paisMasVendedor() {
		int vendidos = 0;
		Pais Vendedor = null;
		
		for (int i = 0; i<Pais.paises.size(); i++){	
			int x = Pais.paises.get(i).cantidadVendidos;	
			if (vendidos < x) {		
				vendidos = x;
				Vendedor = Pais.paises.get(i);
			}	
		}
		return Vendedor;
	}
	
}







