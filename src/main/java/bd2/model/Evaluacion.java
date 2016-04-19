package bd2.model;

import java.util.Date;

public class Evaluacion extends Tarea {

	private int puntaje;
	private Traduccion traduccion;
	
	public Evaluacion(){
		
	}
	
	public Evaluacion(Date fec, String txt, Boolean ok, Traduccion t, int i){
		this.puntaje = i;
		this.traduccion = t;
		this.setCompleta(ok);
		this.setDescripcion(txt);
		this.setFecha(fec);
		
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
	
	
}
