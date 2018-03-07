
import java.util.Arrays;

public class runner 
{
	public static void main(String[] args)
	{
		//Testing
		int[] insertTest = {1,4,4,5,2,4,3,17,0};
		double[] selectionTest = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 17.0, 0.0};
		String[] bubbleTest = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		String[] mergeTest = {"gate","boo", "donut", "zebra", "apple","chick", "as", "tortilla", "think", "lose"};
		int[] quickTest = {1, 7, 9, 11, 19, 2, 5, 6, 11, 17, 8, 13, 14, 15, 20, 1, 3, 7, 14, 18};
				
	
		//Insertion Sort 
		long start= System.nanoTime();
		sortingAlgorithm.insertionSort(insertTest);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("InsertionSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(insertTest) + "\n");
		
		
		//Selection Sort 
		start = System.nanoTime();
		sortingAlgorithm.selectionSort(selectionTest);
		end = System.nanoTime();
		time = end - start;
		System.out.println("SelectionSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(selectionTest) + "\n");
		
		
		//Bubble Sort 
		start = System.nanoTime();
		sortingAlgorithm.bubbleSort(bubbleTest);
		end = System.nanoTime();
		time = end - start;
		System.out.println("BubbleSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(bubbleTest) + "\n");
		
		
		//Merge
		start = System.nanoTime();
		String[] mergeFinal = sortingAlgorithm.mergeSort(mergeTest);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Merge took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(mergeFinal) + "\n");
		
		
		//QuickSort
		start = System.nanoTime();
		sortingAlgorithm.quickSort(quickTest, 0, quickTest.length-1);
		end = System.nanoTime();
		time = end - start;
		System.out.println("QuickSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(quickTest) + "\n");
		
	}

}

