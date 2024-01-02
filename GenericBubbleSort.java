package sortingRace;
import java.util.*;

public class GenericBubbleSort<T extends Comparable<T>> {
	/*

  //Usage within the sort method : 
  )

	 */
	
	private T[] arr;
	private Comparator<? super T> customComparator;
	
	public GenericBubbleSort(T[] a, Comparator<? super T> c) {
		this.arr = a;
		this.customComparator = c;
	}
	
	public void bubbleSortWithComparable() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Use compareTo for comparison
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap if needed
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
	
	public void bubbleSortWithComparator() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Use compareTo for comparison
                if (customComparator.compare(arr[i - 1], arr[i]) > 0 ) {
                    // Swap if needed
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
