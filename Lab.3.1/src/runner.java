
import java.util.Arrays;

public class runner 
{
	public static void main(String[] args)
	{
		//Test
		int[] test1 = {1,4,4,5,2,4,3,17,0};
		double[] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 17.0, 0.0};
		String[] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		String[] mergeTest = {"gate","boo", "donut", "zebra", "apple","chick", "as", "tortilla", "think", "lose"};
		
		//Insertion  
		long start= System.nanoTime();
		SortingAlgorithm.insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds");
		//Selection  
		start = System.nanoTime();
		SortingAlgorithm.selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds");
		//Bubble  
		start = System.nanoTime();
		SortingAlgorithm.bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");		
		
		//Merge
		start = System.nanoTime();
		String[] mergeFinal = SortingAlgorithm.merge(mergeTest);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Merge took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(mergeFinal) + "\n");
		//Partition
		
		//
		
		System.out.println(Arrays.toString(test1));
		System.out.println(Arrays.toString(test2));
		System.out.println(Arrays.toString(test3));
		
	}

}

