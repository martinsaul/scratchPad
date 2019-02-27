package backtracking.permutation;

public class Solution {

	public static void main(String[] args){
		permute("abc".toCharArray(), 0);
	}

	private static void swap(char[] a, int l, int r) {
		char temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}

	private static void permute(char[] word, int step) {
		if (step == word.length)
			System.out.println(word);
		else {
			for (int i = step; i < word.length; i++) {
				swap(word, step, i);
				permute(word, step + 1);
				swap(word, step, i); // backtrack
			}
		}
	}
}
