package sortingRace;
import java.util.*;

public class GenericInsertionSort<T extends Comparable<T>> {
	
	private T[] arr;
	private Comparator<? super T> customComparator;
	
	public GenericInsertionSort(T[] a, Comparator<? super T> c) {
		this.arr = a;
		this.customComparator = c;
	}
	
	public void insertionSortWithComparable() {
        int n = arr.length;

        for (int lastUnsortedIndex = 1; lastUnsortedIndex < n; lastUnsortedIndex++) {
            int unsortedIndex = lastUnsortedIndex;

            // Iterate through the unsorted portion from UnsortedIndex to 0
            while (unsortedIndex > 0 && arr[unsortedIndex].compareTo(arr[unsortedIndex - 1]) < 0) {
                // Compare and swap if necessary
                swap(arr, unsortedIndex, unsortedIndex - 1);

                // Move to the previous position in the unsorted portion
                unsortedIndex--;
            }
        }
    }

	
	public void insertionSortWithComparator() {
        int n = arr.length;

        for (int lastUnsortedIndex = 1; lastUnsortedIndex < n; lastUnsortedIndex++) {
            int unsortedIndex = lastUnsortedIndex;

            // Iterate through the unsorted portion from UnsortedIndex to 0
            while (unsortedIndex > 0 &&  customComparator.compare(arr[unsortedIndex - 1], arr[unsortedIndex]) > 0) {
                // Compare and swap if necessary
                swap(arr, unsortedIndex, unsortedIndex - 1);

                // Move to the previous position in the unsorted portion
                unsortedIndex--;
            }
        }
	}
	
    private void swap(T[] arr, int i, int j) {
        // Swap elements in the array
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
