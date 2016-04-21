package bd2.model;
import java.util.Collection;
import java.util.LinkedList;

public class Documento {

	private int ID;
	private String nombre;
	private int complejidad;
	private Collection<Parrafo> parrafos;
	private Idioma idioma;
	
	public Documento(){
		
	}
	
	public Documento(String nombre, Idioma i){
		this.nombre = nombre;
		this.idioma = i;
		this.parrafos = new LinkedList<Parrafo>();
	}
	
	public Idioma getIdioma(){
		return idioma;
	}
	
	public void setIdioma(Idioma i){
		this.idioma = i;
	}
	
	public Parrafo agregarParrafo(String p){
		Parrafo parr = new Parrafo(p, this);
		this.parrafos.add(parr);
		return parr;
	}
	
	public Collection<Parrafo> getParrafos(){
		return parrafos;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nom){
		this.nombre = nom;
	}

	public int getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
}
