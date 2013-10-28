package sort;

import java.util.ArrayList;
import java.util.Random;

public class QuickSortSimple 
{

	public static void main(String[] args) 
	{
		int[] arr = new int[20];
		
		Random rand = new Random();
		//populate the array
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Math.abs(rand.nextInt()%100);
		}
		
		//print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
		//Quick Sort Simple version
		quickSort(arr);
		
		//print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();

	}
	
	public static void quickSort(int arr[])
	{
		if(arr.length<=1)
			return;
		Random r = new Random();
		int pivot = Math.abs(r.nextInt()%arr.length);
		ArrayList<Integer> left = new ArrayList();
		ArrayList<Integer> right = new ArrayList();
		int pivotval = arr[pivot];
		
		swap(arr, pivot, arr.length-1);
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]<pivotval)
				left.add(arr[i]);
			else
				right.add(arr[i]);
		}
		int leftarr[] = new int[left.size()];
		int rightarr[] = new int[right.size()];
		for(int i=0; i<leftarr.length; i++)
		{
			leftarr[i] = left.get(i);
		}
		for(int i=0; i<rightarr.length; i++)
		{
			rightarr[i] = right.get(i);
		}
		quickSort(leftarr);
		quickSort(rightarr);
		
		int x=0;
		for(int i=0; i<leftarr.length; i++,x++)
		{
			arr[x] = leftarr[i];
		}
		arr[x] = pivotval;
		x++;
		for(int i=0; i<rightarr.length; i++,x++)
		{
			arr[x] = rightarr[i];
		}
		
	}
	
	public static void swap(int array[], int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
