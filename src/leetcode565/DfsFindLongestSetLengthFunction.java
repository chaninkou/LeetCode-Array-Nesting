package leetcode565;

public class DfsFindLongestSetLengthFunction {
	// We stop adding right before a duplicate element occurs in array.
	/*
	 * Input: A = [5,4,0,3,1,6,2] Output: 4 Explanation: A[0] = 5, A[1] = 4,
	 * A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.
	 * 
	 * One of the longest S[K]: S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
	 */ 
	public int arrayNesting(int[] nums) {
		int max = Integer.MIN_VALUE;

		boolean[] visited = new boolean[nums.length];

		for (int i = 0; i < nums.length; i++) {
			// To prevent duplicates
			if (visited[i]) {
				continue;
			}

			// Getting the max;
			max = Math.max(max, getLength(nums, i, visited));
		}

		return max;
	}

	// For each element, get the total count before duplicate element
	private int getLength(int[] nums, int start, boolean[] visited) {
		int i = start;
		int count = 0;

		while (count == 0 || i != start) {
			visited[i] = true;

			i = nums[i];

			count++;
		}

		return count;
	}
}
