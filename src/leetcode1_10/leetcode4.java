package leetcode1_10;

public class leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int len = nums1.length + nums2.length;
    	if(len % 2 == 0) 
    		return (getKthSmall(nums1, 0, nums2, 0, len / 2) + getKthSmall(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
    	else
    		return getKthSmall(nums1, 0, nums2, 0, (len + 1) / 2);
    	
    }
    
    public static int getKthSmall(int[] nums1, int n, int[] nums2, int m, int k) {
    	if(n >= nums1.length) return nums2[m + k - 1];
    	if(n >= nums2.length) return nums1[n + k - 1];
    	if(k == 1) return Math.min(nums1[n], nums2[m]);
    	
    	int pos1 = n + k / 2 - 1;
    	int pos2 = m + k / 2 - 1;
    	int mid1 = pos1 < nums1.length ? nums1[pos1] : Integer.MAX_VALUE;
    	int mid2 = pos2 < nums2.length ? nums2[pos2] : Integer.MAX_VALUE;
    	if(mid1 < mid2) 
    		return getKthSmall(nums1, n + k / 2, nums2, m, k - k / 2);
    	else 
    		return getKthSmall(nums1, n, nums2, m + k / 2, k - k / 2);

    	
    }

}
