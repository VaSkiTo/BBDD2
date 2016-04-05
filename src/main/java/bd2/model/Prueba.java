package bd2.model;

public class Prueba {
	
	private int puntaje;
	private Leccion leccion;
	
	
	public Prueba(Leccion l, int p){
		try{
			if(p>=0 && p<=100){
				this.setPuntaje(p);
				this.leccion = l;
			}
		}catch(Exception e1){
			System.out.println("El puntaje de una prueba debe ser un valor entre 0 y 100");
		}
		
	}
	
	public Boolean aprobada(){
		return (this.getPuntaje() >= 60);
	}
	
	public void setPuntaje(int p) {
		if(p>=0 && p<= 100){
			this.puntaje = p;
		}
	}
	
	public int getPuntaje(){
		return puntaje;
	}

	public Leccion getLeccion() {
		return leccion;
	}

	public void setLeccion(Leccion leccion) {
		this.leccion = leccion;
	}
	
	
}
