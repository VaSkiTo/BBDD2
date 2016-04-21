package bd2.model;
import java.util.HashMap;
import java.util.Map;

public class Diccionario {

	private int ID;
	private Map<String, String> definiciones = new HashMap<String, String>();
	private String edicion;
	private Idioma idioma;
	
	public Diccionario(){
		
	}
	
	public Diccionario(Idioma i, String texto){
		this.setIdioma(i);
	}
	
	public void agregarDefinicion(String clave, String valor){
		this.definiciones.put(clave, valor);
	}
	
	public String definicion(String clave){
		//buscar en el diccionario el valor para la clave dada
		return this.definiciones.get(clave);
	}
	
	public Map<String, String> getDefiniciones(){
		return this.definiciones;
	}
	
	public void setIdioma(Idioma i){
		this.idioma = i;
	}
	
	public Idioma getIdioma(){
		return idioma;
	}
	
	public String getEdicion(){
		return edicion;
	}
	
	public void setEdicion(String edic){
		this.edicion = edic;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
}
