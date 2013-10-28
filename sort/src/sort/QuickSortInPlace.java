package sort;

import java.util.Random;

public class QuickSortInPlace {

	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		
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
		quickSort(arr, 0, arr.length-1);
		
		//print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
			}
			System.out.println();

		}
		
		public static void quickSort(int arr[], int start, int end)
		{
			if(end-start<1)
				return;
			Random r = new Random();
			int pivot = 0;
			if(end-start>=1)
				pivot = Math.abs(r.nextInt()%(end-start))+start;
			int pivotval = arr[pivot];
			
			swap(arr, pivot, end);
			
			int x=start;
			for(int i=start; i<end; i++)
			{
				if(arr[i]<pivotval)
				{
					swap(arr, x, i);
					x++;
				}
				
			}
			
			swap(arr, x, end);
			pivot = x;
			
			if(pivot>=0)
				quickSort(arr, start, pivot-1);
			if(pivot+1<arr.length)
				quickSort(arr, pivot+1, end);
			
		}
		
		public static void swap(int array[], int a, int b)
		{
			int temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}
	
}
