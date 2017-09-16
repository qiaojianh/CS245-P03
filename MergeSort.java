public class MergeSort implements SortingAlgorithm{

	

	public void merge(int[] unsorted, int first, int mid, int last, int[] sorted){
            int i = first, j = mid;
            int k = 0;
            while (i < mid && j < last){
                if (unsorted[i] < unsorted[j]){
                    sorted[k++] = unsorted[i++];
                }
                else{
                    sorted[k++] = unsorted[j++];
                }
            }

            while (i < mid){
                sorted[k++] = unsorted[i++];
            }
            while (j < last){
                sorted[k++] = unsorted[j++];
            }

            for (int v = 0; v < k; v++){
                unsorted[first + v] = sorted[v];
            }
    }


	public void merge_sort(int[] unsorted, int first, int last, int[] sorted){
            if (first + 1 < last)
            {
                int mid = (first + last) / 2;
                merge_sort(unsorted, first, mid, sorted);
                merge_sort(unsorted, mid, last, sorted);
                merge(unsorted, first, mid, last, sorted);
            }
    }

    public void sort(int [] a){
    	int[] sorted = new int[a.length];
    	merge_sort(a, 0, a.length, sorted);
	}

}