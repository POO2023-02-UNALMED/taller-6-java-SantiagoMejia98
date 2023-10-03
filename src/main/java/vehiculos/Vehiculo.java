package vehiculos;

public class Vehiculo {

	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int cantidadVehiculos;
	protected static int cantidadAutomoviles;
	protected static int cantidadCamiones;
	protected static int cantidadCamionetas;
	
	static {
		cantidadVehiculos = 0;
		cantidadAutomoviles = 0;
		cantidadCamiones = 0;
		cantidadCamionetas = 0;
	}
	
	protected Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
	}
	
	protected String getPlaca() {
		return placa;
	}
	protected void setPlaca(String placa) {
		this.placa = placa;
	}
	
	protected int getPuertas() {
		return puertas;
	}
	protected void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	protected int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	protected void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected int getPrecio() {
		return precio;
	}
	protected void setPrecio(int precio) {
		this.precio = precio;
	}
	
	protected int getPeso() {
		return peso;
	}
	protected void setPeso(int peso) {
		this.peso = peso;
	}
	
	protected String getTraccion() {
		return traccion;
	}
	protected void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	protected Fabricante getFabricante() {
		return fabricante;
	}
	protected void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	protected static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	protected static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	protected static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}
	protected static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Vehiculo.cantidadAutomoviles = cantidadAutomoviles;
	}
	
	protected static int getCantidadCamiones() {
		return cantidadCamiones;
	}
	protected static void setCantidadCamiones(int cantidadCamiones) {
		Vehiculo.cantidadCamiones = cantidadCamiones;
	}
	
	protected static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}
	protected static void setCantidadCamionetas(int cantidadCamionetas) {
		Vehiculo.cantidadCamionetas = cantidadCamionetas;
	}
	
	protected static String vehiculosPorTipo() {
		return "Automoviles: " + cantidadAutomoviles + "\n" + "Camionetas: " + cantidadCamionetas + "\n" + "Camiones: " + cantidadCamiones;
	}
}