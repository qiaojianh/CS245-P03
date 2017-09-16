public class BubbleSort implements SortingAlgorithm{

	public static void swap(int[] arr, int index1, int index2) {  
            int temp = arr[index1];  
            arr[index1] = arr[index2];  
            arr[index2] = temp;  
    }  

	public void sort(int [] a){

		for (int i = a.length - 1; i > 0 ; i-- ) {
			for (int j = 0; j < i ;j++ ) {
				if (a[j] > a[j+1]) {
					swap(a,j,j+1);					
				}				
			}			
		}
	}	


}