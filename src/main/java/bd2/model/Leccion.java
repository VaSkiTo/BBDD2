package bd2.model;

public class Leccion {

	private int ID;
	private String nombre;

	public Leccion(){
		
	}
	
	public Leccion(String s){
		this.setNombre(s);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
}
