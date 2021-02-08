import java.util.ArrayList;
import java.util.Random;

public class Driver
{
	public static void main(String[] args)
	{	
		// Constants
		final int SIZE = 5000;
		final int MIN = 10;
		final int MAX = 99;
		
		// Objects
		Random ran = new Random();
		Person[] pArray = new Person[SIZE];
		
		// Fills array with random values
		for(int i=0; i<pArray.length; i++)
		{
			int temp = ran.nextInt(MAX-MIN+1)+MIN;
			pArray[i] = new Person(temp);
		}
		
		// Prints pre-sorted array
		System.out.println("Pre Sort - Array");
		for(Person p : pArray) System.out.print(p + ",");
		
		// Sorts and prints time elapsed in milliseconds of the sort
		long time = System.currentTimeMillis();
		Sort.quickSort(pArray);
		time = System.currentTimeMillis() - time;
		System.out.println("\n\tTime Elapsed: " + time + "ms");
		
		// Prints post-sorted array
		System.out.println("Post Sort - Array");
		for(Person p : pArray) System.out.print(p + ",");
		
	}
}
