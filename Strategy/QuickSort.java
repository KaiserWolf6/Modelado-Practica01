public class QuickSort implements Ordenamiento{
	
	@Override
	public void ordenar(int[] arr){
		System.out.println("Estoy ordenando con Quick Sort\n");

		int n = arr.length; 

		int[] ordenado = new int[n];

		for (int i=0; i<n; ++i) 
            ordenado[i] = arr[i];

        sort(ordenado, 0, n-1);

        for (int i=0; i<n; ++i) 
            System.out.print(ordenado[i]+" "); 
        System.out.println(); 
	}

	private int partition(int arr[], int low, int high) { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 

            if (arr[j] <= pivot) 
            { 
                i++; 

                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 

        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 

    private void sort(int arr[], int low, int high) { 
        if (low < high) 
        { 

            int pi = partition(arr, low, high); 

            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
}