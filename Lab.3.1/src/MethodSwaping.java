

public class MethodSwaping 
{
	public static void swap(int[] elements, int index1, int index2)
	{
		 int temp=elements[index1];
		 elements[index1]= elements[index2];
		 elements[index2]=temp;
	}
	
	public static void swap(double[] elements, int index1, int index2)
	{
		 double temp=elements[index1];
		 elements[index1]= elements[index2];
		 elements[index2]=temp;
	}
	
	public static void swap(String[] elements, int index1, int index2)
	{
		 String temp=elements[index1];
		 elements[index1]=elements[index2];
		 elements[index2]=temp;
	}
}

