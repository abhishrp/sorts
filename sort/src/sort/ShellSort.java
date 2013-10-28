package sort;

import java.util.Random;

public class ShellSort 
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
		
		//Shell sort
		for(int gap = 5; gap>0; gap-=2)
		{
			for(int x=0; x<arr.length-1; x++)
			{
				int min = Integer.MAX_VALUE;
				int minpos = -1;
				for(int y=x; y<arr.length; y+=gap)
				{
					if(arr[y]<min)
					{
						min = arr[y];
						minpos = y;
					}
				}
				insert(arr, x, minpos, gap);
				//print
				for(int i=0; i<arr.length; i++)
				{
					System.out.print(arr[i]+", ");
				}
				System.out.println("done"+gap);
				
			}
		}
		
		//print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();

	}
	
	public static void insert(int array[], int insert_at, int insert_from, int g)
	{
		int temp = array[insert_from];
		
		for(int i=insert_from; i>insert_at; i-=g)
		{
			array[i] = array[i-g];
		}
		array[insert_at] = temp;
	}

}
