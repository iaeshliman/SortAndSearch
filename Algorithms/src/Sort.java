import java.util.List;

public class Sort
{
	private Sort() { }
	
	public static <E extends Comparable<E>> void selectionSort(E[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			int minIndex = i;
			for(int j=i; j<array.length; j++)
			{
				if(array[j].compareTo(array[minIndex])<0) minIndex = j;
			}
			E temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
	
	public static <E extends Comparable<E>> void selectionSort(List<E> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			int minIndex = i;
			for(int j=i; j<list.size(); j++)
			{
				if(list.get(j).compareTo(list.get(minIndex))<0) minIndex = j;
			}
			E temp = list.get(i);
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);
		}
	}
	
	public static <E extends Comparable<E>> void insertionSort(E[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			E key = array[i];
			int index = i-1;
			while(index>=0&&key.compareTo(array[index])<0)
			{
				array[index+1] = array[index];
				index--;
			}
			array[index+1] = key;
		}
	}
	
	public static <E extends Comparable<E>> void insertionSort(List<E> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			E key = list.get(i);
			int index = i-1;
			while(index>=0&&key.compareTo(list.get(index))<0)
			{
				list.set(index+1, list.get(index));
				index--;
			}
			list.set(index+1, key);
		}
	}
	
	public static <E extends Comparable<E>> void bubbleSort(E[] array)
	{
		while(true)
		{
			boolean sorted = true;
			for(int i=0; i<array.length-1; i++)
			{
				if(array[i+1].compareTo(array[i])<0)
				{
					E temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
	}
	
	public static <E extends Comparable<E>> void bubbleSort(List<E> list)
	{
		while(true)
		{
			boolean sorted = true;
			for(int i=0; i<list.size()-1; i++)
			{
				if(list.get(i+1).compareTo(list.get(i))<0)
				{
					E temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
					sorted = false;
				}
			}
			if(sorted) break;
		}
	}
	
	public static <E extends Comparable<E>> void quickSort(E[] array)
	{
		quickSortAlgorithm(array,0,array.length-1);
	}
	
	public static <E extends Comparable<E>> void quickSortAlgorithm(E[] array, int low, int high)
	{
		if(low<high)
		{
			int partition = quickSortPartition(array,low,high);
			
			quickSortAlgorithm(array, low, partition-1);
			quickSortAlgorithm(array, partition+1, high);
		}
	}
	
	public static <E extends Comparable<E>> int quickSortPartition(E[] array, int low, int high)
	{
		E pivot = array[high];
		
		int j = low-1;
		for(int i=low; i<high; i++)
		{
			if(array[i].compareTo(pivot)<0)
			{
				j++;
				E temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		E temp = array[j+1];
		array[j+1] = array[high];
		array[high] = temp;
		
		return j+1;
	}
	
	public static <E extends Comparable<E>> void quickSort(List<E> list)
	{
		quickSortAlgorithm(list,0,list.size()-1);
	}
	
	public static <E extends Comparable<E>> void quickSortAlgorithm(List<E> list, int low, int high)
	{
		if(low<high)
		{
			int partition = quickSortPartition(list,low,high);
			
			quickSortAlgorithm(list, low, partition-1);
			quickSortAlgorithm(list, partition+1, high);
		}
	}
	
	public static <E extends Comparable<E>> int quickSortPartition(List<E> list, int low, int high)
	{
		E pivot = list.get(high);
		
		int j = low-1;
		for(int i=low; i<high; i++)
		{
			if(list.get(i).compareTo(pivot)<0)
			{
				j++;
				E temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}
		
		E temp = list.get(j+1);
		list.set(j+1, list.get(high));
		list.set(high, temp);
		
		return j+1;
	}
}
