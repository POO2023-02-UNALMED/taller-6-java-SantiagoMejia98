package vehiculos;

public class Camion extends vehiculo {

	protected int ejes;
	
	protected Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Vehiculo.cantidadCamiones++;
	}
	
	protected int getEjes() {
		return ejes;
	}
	
	protected void setEjes(int ejes) {
		this.ejes = ejes;
	}
}