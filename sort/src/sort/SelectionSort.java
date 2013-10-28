package sort;

import java.util.Random;

public class SelectionSort 
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
		
		//Selection sort
		for(int x=0; x<arr.length-1; x++)
		{
			int min = Integer.MAX_VALUE;
			int minloc = -1;
			for(int y=x; y<arr.length; y++)
			{
				if(arr[y]<min)
				{
					min = arr[y];
					minloc = y;
				}
			}
			swap(arr, x, minloc);
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
