package bd2.model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Curso {

	private String nombre;
	private int nivel;
	private Collection<Leccion> lecciones;
	private Idioma idioma;
	
	public Curso (String name, Idioma idiom, int i){
		this.setIdioma(idiom);
		this.setNivel(i);
		this.setNombre(name);
		this.lecciones = new ArrayList<Leccion>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	public Collection<Leccion> getLecciones() {
		return lecciones;
	}
	public void agregarLeccion(Leccion lecciones) {
		this.lecciones.add(lecciones);
	}
	
}
