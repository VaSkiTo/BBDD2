package bd2.model;

public class Prueba {
	
	private int puntaje;
	private Leccion leccion;
	
	
	public Prueba(Leccion l, int p) throws Exception{

			if(p>=0 && p<=100){
				this.setPuntaje(p);
				this.leccion = l;
			}
			else {
				
				if (p < 0) throw new Exception("No se puede usar valores negativos como puntaje de una prueba.");
				
				else throw new Exception("No se puede usar valores mayores a 100 como puntaje de una prueba.");
			}
		
	}
	
	public Boolean aprobada(){
		return (this.getPuntaje() >= 60);
	}
	
	public void setPuntaje(int p) throws Exception {
		if(p>=0 && p<= 100){
			this.puntaje = p;
		}
		else {
			
			if (p < 0) throw new Exception("No se puede usar valores negativos como puntaje de una prueba.");
			
			else throw new Exception("No se puede usar valores mayores a 100 como puntaje de una prueba.");
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
