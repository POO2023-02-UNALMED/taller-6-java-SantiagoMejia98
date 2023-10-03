package vehiculos;
import java.util.*;

public class Fabricante {
	
	protected String nombre;
	protected Pais pais;
	protected static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

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
	
	
}


