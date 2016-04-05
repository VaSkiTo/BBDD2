package bd2.model;

import java.util.Date;

public class Evaluacion {

	
	private int puntaje;
	private Tarea tarea;
	private Traduccion traduccion;
	
	
	public Evaluacion(Date fec, String txt, Boolean ok, Traduccion t, int i){
		this.puntaje = i;
		this.traduccion = t;
		this.tarea = new Tarea(fec, txt, ok);
		
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
	
	public Traduccion getTraduccion(){
		return traduccion;
	}
	
	public void setTraduccion(Traduccion t){
		this.traduccion = t;
	}
	
	public Date getFecha(){
		return this.tarea.getFecha();
	}
	
	public String getDescripcion(){
		return this.tarea.getDescripcion();
	}
	
	public Boolean getCompleta(){
		return this.tarea.getEstado();
	}
	
}
