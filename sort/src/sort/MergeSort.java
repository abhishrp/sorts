package sort;

import java.util.Random;

public class MergeSort 
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
		
		//Merge sort
		merge_sort(arr);
		
		//print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();

	}

	public static void merge_sort(int array[])
	{
		int l = array.length;
		if(l <= 1)
			return;
		if(l == 2)
		{
			if(array[0]>array[1])
				swap(array, 0, 1);
			return;
		}
		int mid = l/2;
		int left[] = new int[mid];
		int right[] = new int[l-mid];
		
		for(int i=0; i<left.length; i++)
			left[i] = array[i];
		
		for(int i=0; i<right.length; i++)
			right[i] = array[i+mid];
		
		merge_sort(left);
		merge_sort(right);
		merge(array, left, right);
		
	}
	
	public static void merge(int array[], int left[], int right[])
	{
		int lpt = 0, rpt = 0;
		int apt = 0;
		while(lpt<left.length && rpt<right.length)
		{
			if(left[lpt]<right[rpt])
			{
				array[apt] = left[lpt];
				apt++;
				lpt++;
				continue;
			}
			if(left[lpt]>right[rpt])
			{
				array[apt] = right[rpt];
				apt++;
				rpt++;
				continue;
			}
			if(left[lpt]==right[rpt])
			{
				array[apt] = left[lpt];
				apt++;
				lpt++;
				array[apt] = right[rpt];
				apt++;
				rpt++;
				continue;
			}
		}
		
		for(int i=lpt; i<left.length; i++, apt++)
		{
			array[apt] = left[i];
		}
		for(int i=rpt; i<right.length; i++, apt++)
		{
			array[apt] = right[i];
		}
	}
	
	public static void swap(int array[], int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
