public class Suscriptor implements Observador {
	
	private String usuario;
	private boolean estadoDeSuscriptor;
	private int saldo;
	private int num_Dispositivos;
	private boolean cancelar_servicio;

	public Suscriptor(String usuario, boolean estadoDeSuscriptor, int saldo, int num_Dispositivos, boolean cancelar_servicio) {
		this.usuario = usuario;
		this.estadoDeSuscriptor = false;
		this.saldo = saldo;
		this.num_Dispositivos = num_Dispositivos;
		this.cancelar_servicio = false;
	}

	@Override
	public void update() {

	}

	public String getUsuario() {
		return usuario;
	}

	public int getSaldo() {
		return saldo;
	}

	public int getNum_Dispositivos() {
		return num_Dispositivos;
	}

	public void cancelarServicio() {
		
	}

}