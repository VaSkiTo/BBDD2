package bd2.model;
import java.util.Date;

public class Traduccion {

	private String texto;
	private Parrafo parrafo;
	private Idioma idioma;
	private Tarea tarea;
	
	public Traduccion(Date fecha, String desc, Boolean completa, String text, Parrafo parr){
			
		Tarea t = new Tarea(fecha, desc, completa);
		this.tarea = t;
		this.setTexto(text);
		this.parrafo = parr;
	}
	
	public Traduccion(Date fecha, String desc, Boolean completa, String text, Parrafo parr, Idioma i){
		
		Tarea t = new Tarea(fecha, desc, completa);
		this.tarea = t;
		this.setTexto(text);
		this.parrafo = parr;
		this.idioma = i;
		
	}
	
	public Idioma getIdiomaOriginal(){
		return this.parrafo.getDocumento().getIdioma();
	}
	
	public Idioma getIdioma(){
		return this.idioma;
	}
	
	public void setIdioma(Idioma i){
		this.idioma = i;
	}
	
	public Parrafo getParrafo(){
		return this.parrafo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
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
