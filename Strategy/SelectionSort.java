public class SelectionSort implements Ordenamiento{
	
	@Override
	public void ordenar(int[] arr){
		System.out.println("Estoy ordenando con Selection Sort\n");

		int n = arr.length; 

		int[] ordenado = new int[n];

		for (int i=0; i<n; ++i) 
            ordenado[i] = arr[i];

        for (int i = 0; i < n-1; i++){ 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (ordenado[j] < ordenado[min_idx]) 
                    min_idx = j; 
  
            int temp = ordenado[min_idx]; 
            ordenado[min_idx] = ordenado[i]; 
            ordenado[i] = temp; 
        } 

        for (int i=0; i<n; ++i) 
            System.out.print(ordenado[i]+" "); 
        System.out.println(); 
	}
}