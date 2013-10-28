package sort;

import java.util.Random;

public class CombSort 
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

		//Comb sort
		int gap = arr.length;
		float shrink_factor = 1.3f;
		boolean swapped = true;
		
		while(gap>1 || swapped)
		{
			gap = (int)(gap/shrink_factor);
			if(gap<1) gap = 1;
			
			swapped = false;
			for(int y=0; y+gap<arr.length; y++)
			{
				if(arr[y]>arr[y+gap])
				{
					swap(arr, y, y+gap);
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
