import java.util.ArrayList;
import java.util.List;

public class Suscriptor implements Observador {
	
	//Nombre del usuario
	private String usuario;
	//Estado que nos indica si el suscriptor va a cancelar o no la plataforma
	private boolean estadoDeSuscriptor;
	//Saldo del suscriptor
	private int saldo;
	//Numero de dispositivos que pidio para los servicios
	private int num_Dispositivos;
	//Lista de servicios que tiene contrato el suscriptor
	private List<Servicio> servicios = new ArrayList<Servicio>();

	//Constructor de la clase Suscriptor
	public Suscriptor(String usuario, boolean estadoDeSuscriptor, int saldo, int num_Dispositivos) {
		this.usuario = usuario;
		this.estadoDeSuscriptor = false;
		this.saldo = saldo;
		this.num_Dispositivos = num_Dispositivos;
	}

	@Override
	public void update() {

	}

	/*
 	 * Regresa el nombre del usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNum_Dispositivos() {
		return num_Dispositivos;
	}

	public void setNum_Dispositivos(int num_Dispositivos) {
		this.num_Dispositivos = num_Dispositivos;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void registrar(Servicio servicio) {
		servicios.add(servicio);
	}

	public void eliminarSuscripcion(Servicio servicio) {
		servicios.remove(servicio);
	}



	public void cancelarServicio() {
		
	}

}