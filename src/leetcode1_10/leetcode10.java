package leetcode1_10;

public class leetcode10 {

	public int maxArea(int[] height) {
		if (height == null || height.length < 2)
			return 0;
		int maxArea = 0, h, i = 0, j = height.length - 1;
		while (i < j) {
			h = Math.min(height[i], height[j]);
			maxArea = Math.max(maxArea, h * (j - i));
			while (i < j && height[i] <= h)
				i++;
			while (i < j && height[j] <= h)
				j--;
		}
		return maxArea;
	}

}
