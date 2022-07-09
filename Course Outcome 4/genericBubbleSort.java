package OOPS;
import java.util.Arrays;
public class genericBubbleSort<T extends Comparable<? super T>>
{
	T[] array;
	genericBubbleSort(T[] array)
	{
		this.array = array;
	}
	private T[] bubbleSort()
	{
		for(int i = array.length; i > 1; i--)
		{
			for(int j = 0; j < i - 1; j++)
			{
		        if(array[j].compareTo(array[j+1]) > 0)
		        {
		        	swapElements(j, array);
		        }
			}            
	    }
	    return array;
	}
	private void swapElements(int index, T[] arr)
	{
	    T temp = arr[index];
	    arr[index] = arr[index+1];
	    arr[index+1] = temp; 
	}
	public static void main(String[] args)
	{
		Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
	    System.out.println("Array Before Sorting : " + Arrays.toString(intArr));
	    genericBubbleSort<Integer> bsg1 = new genericBubbleSort<Integer>(intArr);
	    Integer[] sa1 = bsg1.bubbleSort();
	    System.out.println("Sorted Array : " + Arrays.toString(sa1)); 
	    
	    String[] strArr = {"Earl", "Robert", "Asha", "Arthur"};
	    System.out.println("Array Before Sorting : " + Arrays.toString(strArr));
	    genericBubbleSort<String> bsg2 = new genericBubbleSort<>(strArr);
	    String[] sa2 = bsg2.bubbleSort();
	    System.out.println("Sorted array : " + Arrays.toString(sa2));
	}
}
