public interface Plataforma {
	
	//Metodo que permite registrar a los suscriptores
	public void registrar(Suscriptor sub);
	//Mensaje de bienvenida y que mide el tiempo
	public void notificar();
	//Metodo que permite eliminar a los suscriptores que cancelaron o deben al servicio
	public void eliminar(Suscriptor sub);
	//Metodo para el sistema de cobro
	public void cobrar();
	//Metodo que da sugerencias al suscriptor
	public void recomendar();

}