import java.util.Arrays;
public class sortingAlgorithm {
	
	public static void insertionSort(int[] list1)
	{
		for (int x=1; x<list1.length; x++)
		{
			for(int y=x; y>0; y-- )
			{
				if (list1[y] < list1[y-1])
				{
					methodSwaping.swap(list1, y, y-1);
				}
				else 
				{
					break;
				}
			}
		}
	}
	

	public static void selectionSort(double[] list1)
	{
		for (int x = 0; x<list1.length-1; x++)
		{
			int indexOfMin=x;
			for (int y = x +1; y<list1.length; y++)
			{
				if(list1[indexOfMin]>list1[y])
				{
					 indexOfMin=y;
				}
			}
			methodSwaping.swap(list1, indexOfMin, x);
		}
		
	}
	
	
	public static void bubbleSort(String[] list1)
	{
		
		int swapCount = 1;
		while (swapCount !=0)
		{
			swapCount = 0;
			
			for (int i = 0; i<list1.length-1; i++)
			{
				if (list1[i].compareTo(list1[i+1]) > 0)
				{
					methodSwaping.swap(list1, i, i+1);
					swapCount++;
				}
			}
		}
	}
	
	
	public static String[] mergeSort(String[] list)
	{
		if (list.length==1)
		{
			return list;
		}
		
		String left[] = Arrays.copyOfRange(list,0,list.length/2); 
		String right[] = Arrays.copyOfRange(list,list.length/2,list.length);
				
		return helphelp.merge(mergeSort(left), mergeSort(right));
	}

	public static void quickSort(int[] list1, int front, int back)
	{
		if (back > front)
		{
			
			int pivotIndex = helphelp.partition(list1, front, back);
			quickSort(list1, front, pivotIndex-1);
			quickSort(list1, pivotIndex+1, back);
		}	
	}
	
}