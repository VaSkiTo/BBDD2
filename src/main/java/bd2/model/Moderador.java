package bd2.model;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Calendar;
import java.util.Collection;

public class Moderador {

	private int reputacion;
	private Collection<Idioma> idiomas = new LinkedList<Idioma>();
	private Collection<Evaluacion> evaluaciones = new LinkedList<Evaluacion>();
	private Usuario user;
	
	public Moderador(String email, String nombre, Date fec){
		this.user = new Usuario(email, nombre, fec);
		this.setReputacion(0);
	}
	
	public int reputacion(){
		
		int rep=0;
		Iterator<Evaluacion> iter = this.evaluaciones.iterator();
		while(iter.hasNext()){
			
			Evaluacion element = iter.next();
			if(element != null){
				rep++;
			}
			
		}
		return rep;
	}
	
	public void evaluar(Traduccion t, String descripcion, Integer cali){
		/*Registra	una	nueva evaluación (terminada) para la	Traduccion	recibida por parámetro en la colecciones de	evaluaciones.	El	puntaje	y	la	descripción	
		de la evaluación son recibidos por parámetro. En este caso, se toma el día actual como fecha de la evaluación.	
		
		
		boolean ok = false;
		Iterator<Idioma> iter = this.idiomas.iterator();
		
		while(!ok && iter.hasNext()){
			
			Idioma idio = iter.next();
			if(idio.getNombre() == t.getIdioma().getNombre()){
				ok=true;
			}
			
		}
		[
		*/
		try{
			if(this.idiomas.contains(t.getIdioma())){
				Calendar cal = Calendar.getInstance();
				Date fec = cal.getTime();
				String txt = t.getTexto();
				Evaluacion ev = new Evaluacion(fec, txt, t.getCompleta(), t, cali);
				this.evaluaciones.add(ev);
			}
		}catch(Exception e){
			e.getMessage();
		}
		
	}
	
	public void agregarIdioma(Idioma i){
		this.idiomas.add(i);
	}
	
	public Collection<Idioma> getIdiomas(){
		return idiomas;
	}
	
	public Collection<Evaluacion> getEvaluaciones(){
		return evaluaciones;
	}
	
	public boolean manejaIdioma(Idioma i){
		return this.idiomas.contains(i);
	}
	

	public String getEmail() {
		return this.user.getEmail();
	}

	public void setEmail(String email) {
		this.user.setEmail(email);
	}

	public String getNombre() {
		return this.user.getNombre();
	}

	public void setNombre(String nombre) {
		this.user.setNombre(nombre);
	}

	public Date getFechaDeCreacion() {
		return this.user.getFechaDeCreacion();
	}

	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.user.setFechaDeCreacion(fechaDeCreacion);
	}
	
	public int nivel(Idioma i){
		return this.user.nivel(i);
	}

	public int getReputacion() {
		return reputacion;
	}

	public void setReputacion(int reputacion) {
		this.reputacion = reputacion;
	}
	
}
