public class SelectionSort implements SortingAlgorithm{
	
	public static void swap(int[] arr, int index1, int index2) {  
            int temp = arr[index1];  
            arr[index1] = arr[index2];  
            arr[index2] = temp;  
    } 


	public void sort(int [] a){

		for (int i = 0; i < a.length ; i++ ) {
			for (int j = i + 1; j < a.length ; j++ ) {
				if (a[j] < a[i]) { 
					swap(a,j,i);
				}
			}			
		}

	}

}