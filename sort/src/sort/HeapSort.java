package sort;

import java.util.Random;

//min heap implementation (largest number at the root)
//for max heap (smallest no at the root) change the less than signs in shiftdown and make it shiftup.
public class HeapSort 
{

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

		//Heap Sort
		heapSort(arr);
		
		
		//print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}

	public static void heapSort(int arr[])
	{
		heapify(arr);
		
		int end = arr.length-1;
		while(end>0)
		{
			swap(arr, end, 0);
			end--;
			shiftDown(arr, 0 , end);
			//print
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+", ");
			}
			System.out.println();
		}
		
	}
	
	public static void heapify(int arr[])
	{
		int l = arr.length;
		int start = (l/2)-1;
		System.out.println(start);
		while (start>=0)
		{
			shiftDown(arr, start, l-1);
			start--;
		}
	}
	
	public static void shiftDown(int arr[], int start,  int end)
	{
		
		int root = start;
		while(root*2+1<=end)
		{
			int temp = root;
			int left = root*2+1;
			int right = left + 1;
			
			if(arr[temp]<arr[left])
				temp = left;
			if(right<=end && arr[temp]<arr[right])
				temp = right;
			if(temp!=root)
			{
				swap(arr, root, temp);
				root = temp;
			}
			else
				return;
		}
	}
	
	public static void swap(int array[], int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
}
