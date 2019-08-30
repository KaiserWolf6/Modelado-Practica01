public class InsertionSort implements Ordenamiento{
	
	@Override
	public void ordenar(int[] arr){
		System.out.println("Estoy ordenando con Insertion Sort\n");

		int n = arr.length; 

		int[] ordenado = new int[n];

		for (int i=0; i<n; ++i) 
            ordenado[i] = arr[i];

        for (int i = 1; i < n; ++i) { 
            int key = ordenado[i]; 
            int j = i - 1; 
  
            while (j >= 0 && ordenado[j] > key) { 
                ordenado[j + 1] = ordenado[j]; 
                j = j - 1; 
            } 
            ordenado[j + 1] = key; 
        }

        for (int i=0; i<n; ++i) 
            System.out.print(ordenado[i]+" "); 
        System.out.println();  
	}
}