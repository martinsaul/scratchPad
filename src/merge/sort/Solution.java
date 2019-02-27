package merge.sort;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
	private void merge(int[] arr, int leftStart, int middle, int rightEnd)
	{
		LinkedList<Integer> left = new LinkedList<>();
		LinkedList<Integer> right = new LinkedList<>();

		for(int index = leftStart; index <= rightEnd; index++){
			if(index <= middle)
				left.add(arr[index]);
			else
				right.add(arr[index]);
		}

		int mergeIndex = leftStart;
		while (!left.isEmpty() || !right.isEmpty())
		{
			if (left.peek() != null && (right.peek() == null || left.peek() <= right.peek()))
			{
				arr[mergeIndex] = left.pop();
			}
			else
			{
				arr[mergeIndex] = right.pop();
			}
			mergeIndex++;
		}
	}

	private void sort(int[] arr, int left, int right)
	{
		if (left < right)
		{
			int middle = (left+right)/2;

			sort(arr, left, middle);
			sort(arr , middle+1, right);

			merge(arr, left, middle, right);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Given Array");
		int[] arr = {12, 11, 13, 5, 6, 7};
		System.out.println(Arrays.toString(arr));

		Solution ob = new Solution();
		ob.sort(arr, 0, arr.length-1);

		System.out.println("\nSorted array");
		System.out.println(Arrays.toString(arr));
	}
}

