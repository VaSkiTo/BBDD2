package bd2.model;
import java.lang.reflect.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cursada {	
	
	private int ID;
	private java.util.Date inicio;
	private Collection<Prueba> pruebas = new ArrayList<Prueba>();
	private Curso curso;
	private Usuario usuario;
	
	public Cursada(){
		
	}
	
	public Cursada(Curso c, java.util.Date fec, Usuario u){
		this.curso = c;
		this.inicio = fec;
		this.usuario = u;
		this.usuario.agregarCursada(this);
	}
	
	public boolean finalizada(){
		/*
		 * 	Retorna un booleano indicando si la cursada esta finalizada. Esto significa que	 existe	 al	
			menos una prueba (aprobada) para cada lección del curso correspondiente.	
		 */
		
		boolean ok = false;
		int aprobadas = 0;int cantLecc = this.curso.getLecciones().size();
		int i=0;//uso la variable i para contabilizar cuantas lecciones checkie
		Iterator<Prueba> iter = this.pruebas.iterator();
		while ( i <= cantLecc){ //mientras me falten lecciones por recorrer, recorro.
			if(iter.hasNext()){
				if(iter.next().aprobada()){ //si la leccion esta aprobada, 
					aprobadas +=1;			//sumo 1 a las aprobadas
				}
			}
			i++;
		}
		if(aprobadas == cantLecc){ ok = true;} //si tengo igual de lecciones del curso
		return ok;							   //como pruebas aprobadas, finalizo la cursada
		
		/*
		 *Otra solucion podria ser llamar al metodo leccionesAprobadas y comparar el size
		 *que devuelve con el size de la cantidad de lecciones que tiene el curso; si son
		 *iguales esta finalizada, por el contrario no lo esta. A continuacion escribo la
		 *solucion planteada
		 *
		 *
		 *	boolean ok = false;
		 *	if(this.leccionesAprobadas().size() == this.curso.getLecciones().size()){
		 *			ok = true;
		 *	}
		 *	return ok;
		 *
		 * */
		
	}
	
	public void agregarPrueba(Prueba p){
		this.pruebas.add(p);
	}
	
	public Collection<Prueba> getPruebas(){
		return this.pruebas;
	}
	
	public Collection<Leccion> leccionesAprobadas(){
		/* Retorna una colección con todas las lecciones del	
			curso correspondiente para las que existe una prueba aprobada.
		 */
		
		Collection<Leccion> res = new ArrayList<Leccion>();
		Iterator<Prueba> iter = this.pruebas.iterator();
		while(iter.hasNext()){
			Prueba element = iter.next();
			if(element.aprobada()){
				res.add(element.getLeccion());
			}
		}
		return res;		
	}
	
	public int getNivel(){
		return this.curso.getNivel();
	}

	public java.util.Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Idioma getIdioma() {
		return this.curso.getIdioma();
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario user) {
		this.usuario = user;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
