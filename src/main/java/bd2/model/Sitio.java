package bd2.model;
import java.util.Collection;

public class Sitio {

	private Collection<Usuario> usuarios;
	private Collection<Curso> cursos;
	private Collection<Documento> documentos;
	
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
}
