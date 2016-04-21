package bd2.model;
import java.util.ArrayList;
import java.util.Collection;

public class Sitio {

	private int ID;
	private Collection<Usuario> usuarios = new ArrayList<Usuario>();
	private Collection<Curso> cursos = new ArrayList<Curso>();
	private Collection<Documento> documentos = new ArrayList<Documento>();
	
	public Sitio(){
		
	}
	
	public void registrarUsuario(Usuario user){
		this.usuarios.add(user);
	}
	
	public void agregarCurso(Curso cur){
		this.cursos.add(cur);
	}
	
	public void agregarDocumento(Documento doc){
		this.documentos.add(doc);
	}
	
	public Collection<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public Collection<Curso> getCursos(){
		return this.cursos;
	}
	
	public Collection<Documento> getDocumentos(){
		return this.documentos;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
