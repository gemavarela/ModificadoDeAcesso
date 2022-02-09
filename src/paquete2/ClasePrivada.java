package paquete2;

public class ClasePrivada {
	
	private String nombre;
	private int edad;
	
	public void setSaludar(String nombre) {//Fijar un valor
		this.nombre=nombre;
		
	}
	
	public String getSaludar() {
		return this.nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
