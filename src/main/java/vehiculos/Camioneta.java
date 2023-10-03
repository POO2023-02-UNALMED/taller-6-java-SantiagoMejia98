package vehiculos;

public class Camioneta extends vehiculo {

	protected boolean volco;
	
	protected Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Vehiculo.cantidadCamionetas++;
	}
	
	protected boolean isVolco() {
		return volco;
	}
	
	protected void setVolco(boolean volco) {
		this.volco = volco;
	}
}