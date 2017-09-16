public class InsertionSort implements SortingAlgorithm{

	public void sort(int [] a){
		int tmp;
		int j;

		for (int i = 1 ; i < a.length ; i++) {
			tmp = a[i];
			j = i - 1;
			while(j >= 0 && tmp < a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = tmp;			
		}


	}
	
}