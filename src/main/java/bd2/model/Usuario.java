package bd2.model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Usuario {

	private String email;
	private String nombre;
	private java.util.Date fechaDeCreacion;
	private Collection<Traduccion> traducciones;
	private Collection<Cursada> cursadasRealizadas;
	
	public Usuario(String email, String nombre, java.util.Date hace1Anho){
		this.setEmail(email);
		this.setNombre(nombre);
		this.setFechaDeCreacion(hace1Anho);
		this.cursadasRealizadas = new ArrayList<Cursada>();
		this.traducciones = new ArrayList<Traduccion>();
	}
	
	public int nivel(Idioma i){
		/**
		 * returns the maximum language level of the language sended
		 * on the parameter between the approved subjects of the user
		 */
		int max = 0;
		Collection<Cursada> res = this.cursadasAprobadas(i);
		Iterator<Cursada> iter = res.iterator();
		
		while(iter.hasNext()) {
			Cursada element = iter.next();
			if(element.getNivel() >= max){
				max = element.getNivel();
			}
		}
		return max;
		
	}
	
	public ArrayList<Cursada> cursadasAprobadas(Idioma i){
		/*
		 * Retorna	todas	las	 cursadas	aprobadas cuyos	cursos
		 * son del idioma recibido por parámetro.
		 */
		ArrayList<Cursada> res = new ArrayList<Cursada>();
		/*
		Iterator<Cursada> iter = this.cursadasRealizadas.iterator();
		while(iter.hasNext()){
			Cursada element = iter.next();
			if(element.getIdioma().getNombre() == i.getNombre()){
				//me quedo con las cursadas realizadas iguales al idioma buscado
				res.add(element);
			}
		}
		*/
		
		for(Cursada c : this.cursadasRealizadas){
			
			if ((c.getIdioma().getNombre() == i.getNombre())&& (c.finalizada())){
				
				res.add(c);
				
			}
			
		}
		
		
		/*
		for(int x=1; x == this.cursadasRealizadas.size(); x++){
			if(((ArrayList<Cursada>) this.cursadasRealizadas).get(x).getIdioma() == i ){
				//me quedo con las cursadas realizadas iguales al idioma buscado
				res.add(((ArrayList<Cursada>) this.cursadasRealizadas).get(x));
				
			}
		}
		*/
		return res;
	}
	
	public void agregarCursada (Cursada cur){
		this.cursadasRealizadas.add(cur);
	}
	
	public void agregarTraduccion(Traduccion t){
		this.traducciones.add(t);
	}
	
	public Collection<Cursada> getCursadasRealizadas(){
		return this.cursadasRealizadas;
	}
	
	public Collection<Traduccion> getTraducciones (){
		return this.traducciones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(java.util.Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}