package leetcode1_10;

public class leetcode9 {
    public boolean isPalindrome(int x) {
        if(x < 0)
        	return false;
        
        int i = x,j = 0;
        while(i != 0) {
        	j = 10 * j + i % 10;
        	i /= 10;
        }
        
        return x == j;
    }

}
