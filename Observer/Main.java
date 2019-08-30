public class Main{
	public static void main(String[] args){
		Influencer millennial = new Influencer("Millenial");

		millennial.setEstado("#yolo");
		millennial.notificar();

		System.out.print("\n");
		Seguidor s1 = new Seguidor("fulanito1", millennial);
		Seguidor s2 = new Seguidor("mengana2", millennial);
		Seguidor s3 = new Seguidor("polifacia3", millennial);
		Seguidor s4 = new Seguidor("papadopolus4", millennial);
/*
		millennial.registrar(s1);
		millennial.registrar(s2);
		millennial.registrar(s3);
		millennial.registrar(s4);
*/

		for(Seguidor s : millennial.getSeguidores()){
			System.out.println("Te sigue el usuario: " + s.getUsuario());
		}

		millennial.setEstado("#AMLO");
		System.out.print("\n");
		millennial.notificar();

		s3.dejarDeSeguir();
		//millennial.remover(s3);

		millennial.setEstado("#hashtag");
		System.out.print("\n");
		millennial.notificar();

	}
}