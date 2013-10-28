package sort;

import java.util.Random;

public class BubbleSort {
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
		
		//bubble sort
		boolean swapped = true;
		//for(int x=0; x<arr.length-1; x++)
		while(swapped)
		{
			swapped = false;
			for(int y=0; y<arr.length-1; y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr, y, y+1);
					swapped = true;
				}
			}
			//print
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+", ");
			}
			System.out.println();
		}

		//print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();

	}
	public static void swap(int array[], int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
