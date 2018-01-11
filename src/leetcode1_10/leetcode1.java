package leetcode1_10;

public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
    	for(int i = 0; i < nums.length; i++) {
    		int flag = target - nums[i];
    		for(int j = i + 1; j < nums.length; j++) {
    			if(flag == nums[j]) {
    				return new int[] {i,j};
    			}
    		}
    	}
    	
    	
		return null;
        
    }

}
