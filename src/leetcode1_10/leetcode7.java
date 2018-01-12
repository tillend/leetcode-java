package leetcode1_10;

public class leetcode7 {
    public int reverse(int x) {
    	int positive = (x > 0)? 1 : -1;
    	long ans = 0;
        
        x = Math.abs(x);
        while(x != 0) {
        	ans = 10 * ans + x % 10;
        	x /= 10;
        }
      
        ans = ans * positive;
        if(Overflow(ans))
        	return 0;
        else
        	return (int) ans;
    }

    private boolean Overflow(long ans) {
    	return (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE);
    }
    
}
