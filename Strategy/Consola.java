import java.util.Scanner;

public class Consola{
	private Ordenamiento ord;

	private void asignarSelection(){
		ord = new SelectionSort();
	}

	private void asignarInsertion(){
		ord = new InsertionSort();
	}

	private void asignarMerge(){
		ord = new MergeSort();
	}

	private void asignarQuick(){
		ord = new QuickSort();
	}

	private void ejecutarOrdenamiento(int[] arr){
		ord.ordenar(arr);
	}

	public static void main(String[] args){

		int[] arreglo = {1,6,3,7,5,8,2};
		Consola consola = new Consola();
		Scanner sc = new Scanner(System.in);
		int opcion;

		do{
			System.out.println("Ingrese una de las siguientes " + 
				"opciones para aplicar un ordenamiento:\n\n" + 
				"1.- Selection Sort\n" +
				"2.- Insertion Sort\n" + 
				"3.- Merge Sort\n" + 
				"4.- Quick Sort\n" +
				"0.- Salir\n");
				
				String opcionUsuario = sc.nextLine();

				opcion = Integer.parseInt(opcionUsuario);

				switch(opcion){
					case 1:
						consola.asignarSelection();
						System.out.println("Arreglo a ordenar: \n");
						for (int i=0; i<arreglo.length; ++i) 
				            System.out.print(arreglo[i]+" "); 
				        System.out.println("\n"); 

						consola.ejecutarOrdenamiento(arreglo);
						break;

					case 2:
						consola.asignarInsertion();
						System.out.println("Arreglo a ordenar: \n");
						for (int i=0; i<arreglo.length; ++i) 
				            System.out.print(arreglo[i]+" "); 
				        System.out.println("\n"); 

						consola.ejecutarOrdenamiento(arreglo);
						break;

					case 3:
						consola.asignarMerge();
						System.out.println("Arreglo a ordenar: \n");
						for (int i=0; i<arreglo.length; ++i) 
				            System.out.print(arreglo[i]+" "); 
				        System.out.println("\n"); 

						consola.ejecutarOrdenamiento(arreglo);
						break;

					case 4:
						consola.asignarQuick();
						System.out.println("Arreglo a ordenar: \n");
						for (int i=0; i<arreglo.length; ++i) 
				            System.out.print(arreglo[i]+" "); 
				        System.out.println("\n");
				         
						consola.ejecutarOrdenamiento(arreglo);
						break;

					case 0:
						break;

					default:
						System.out.println("Elige una opcion valida.\n");
						break;

				}

		}while(opcion != 0);
	}
}