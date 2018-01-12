package leetcode1_10;
/**
 * 容器的体积只取决于底(两点于x轴的距离)和高(较低木板的高,eg.短板理论)
 * 		故每次计算area后能从短板一侧去除更短的木板以实现剪枝的作用{while (i < j && height[i] <= h) i++;}
 * @author god
 *
 */
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
