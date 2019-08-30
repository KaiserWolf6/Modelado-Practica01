public class Seguidor implements Observador{
	private String usuario;
	private Influencer influencer;
	private String estadoDeInfluencer;

	public Seguidor(String usuario, Influencer influencer){
		this.usuario = usuario;
		this.influencer = influencer;
		estadoDeInfluencer = influencer.getEstado();
		influencer.registrar(this);
		//mostrarEstado();
	}
	
	@Override
	public void update(){
		estadoDeInfluencer = influencer.getEstado();
		mostrarEstado();
	}

	public String getUsuario(){
		return usuario;
	}

	public void dejarDeSeguir(){
		influencer.remover(this);
	}

	public void mostrarEstado(){
		System.out.println(usuario + ", el usuario " + influencer.getNombre() +
		" ha actualizado su estado: " + estadoDeInfluencer);
	}
}