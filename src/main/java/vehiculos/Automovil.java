package vehiculos;

public class Automovil extends Vehiculo {

	protected int puestos;
	
	protected Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Vehiculo.cantidadAutomoviles++;
	}
	
	protected int getPuestos() {
		return puestos;
	}
	
	protected void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}