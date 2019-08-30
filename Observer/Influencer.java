import java.util.ArrayList;
import java.util.List;

public class Influencer implements Sujeto{

	String nombre;
	List<Seguidor> seguidores = new ArrayList<Seguidor>();
	String estado;

	public Influencer(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public List<Seguidor> getSeguidores(){
		return seguidores;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String nuevoEstado){
		estado = nuevoEstado;
		System.out.println("\n" + nombre + ". Nuevo estado: " + estado);
	}

	public void registrar(Seguidor s){
		seguidores.add(s);
	}

	public void remover(Seguidor s){
		System.out.println("\nHas perdido al seguidor: " + s.getUsuario());
		seguidores.remove(s);
	}
	
	public void notificar(){
		for(Seguidor s : seguidores){
			s.update();
		}
	}
}