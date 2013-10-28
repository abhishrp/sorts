package sort;

import java.util.Random;

public class RadixSort 
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

		//Radix Sort
		
		radixSort(arr);
		
		//print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
	}
	
	public static void radixSort(int arr[])
	{
		int l = arr.length;
		int b[] = new int[l];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<l; i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		
		int eq = 1;
		
		while(max/eq>0)
		{
			int bucket[] = new int[10];
			//puting the count in the buckets
			for(int i=0; i<l; i++)
				bucket[(arr[i]/eq)%10]++;
			//cumulative
			for(int i=1; i<10; i++)
				bucket[i]+=bucket[i-1];
			
			for(int i=l-1; i>=0; i--)
				b[--bucket[(arr[i]/eq)%10]] = arr[i];
			
			for(int i=0; i<l; i++)
				arr[i] = b[i];
			
			eq*=10;
		}
	}

}
