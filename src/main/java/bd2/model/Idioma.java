package bd2.model;

public class Idioma {

	private int ID;
	private String nombre;
	private Diccionario diccionario;
	
	public Idioma(){
		
	}
	
	public Idioma(String i){
		this.setNombre(i);
		this.diccionario = new Diccionario();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Diccionario getDiccionario() {
		return diccionario;
	}

	public void setDiccionario(Diccionario diccionario) {
		this.diccionario = diccionario;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
