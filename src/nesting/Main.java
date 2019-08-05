package nesting;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {5,4,0,3,1,6,2};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		DfsFindLongestSetLengthFunction solution = new DfsFindLongestSetLengthFunction();
		
		System.out.println("Solution: " + solution.arrayNesting(nums));
	}
}
