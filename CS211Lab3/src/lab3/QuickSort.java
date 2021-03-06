package lab3;

import java.util.Scanner;

public class QuickSort
{
	private static void quickSort(String[] a, int start, int end)
	{
	        int i = start;
	        int j = end;
	        
	        if (j - i >= 1)
	        {
	        	String pivot = a[i];
	            // only scan between the two indexes, until they meet.
	            while (j > i)
	            {
	                // from the left, if the current element is lexicographically less than the (original)
	                // first element in the String array, move on. Stop advancing the counter when we reach
	                // the right or an element that is lexicographically greater than the pivot String.
	                while(a[i].compareTo(pivot) <= 0 && i < end && j > i){
	                    i++;
	                }
	                // from the right, if the current element is lexicographically greater than the (original)
	                // first element in the String array, move on. Stop advancing the counter when we reach
	                // the left or an element that is lexicographically less than the pivot String.
	                while (a[j].compareTo(pivot) >= 0 && j > start && j >= i){
	                    j--;
	                }
	                // check the two elements in the center, the last comparison before the scans cross.
	                if (j < i)
	                    swap(a, i, j);
	            }
	            // At this point, the two scans have crossed each other in the center of the array and stop.
	            // The left partition and right partition contain the right groups of numbers but are not
	            // sorted themselves. The following recursive code sorts the left and right partitions.

	            // Swap the pivot point with the last element of the left partition.
	            swap(a, start, j);
	            quickSort(a, start, j - 1);
	            quickSort(a, i + 1, end);
	        }
	    }
	    private static void swap(String[] a, int i, int j)
	    {
	    String temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	    }
	    
	    public static void main(String args[]){
	    	Scanner sc = new Scanner(System.in);
	    	int num = sc.nextInt();
	    	String[] array = new String[num];
	    	for(int i=0;i<array.length;i++){
	    		array[i]=sc.nextLine();
	    	}
	    	
	    	quickSort(array,0,array.length-1);
	    	
	    	for(int i=0;i<array.length;i++)
	    	{
	    		System.out.println(array[i] + " ");
	    	}
	    }
}