package leetcode1_10;
/**
 * 以i为终点,max为最长回文串长度时
 * 		若区间[i-max-1, i]为回文串,则[i-max, i-1]必为回文串,故此时max = max + 2
 * 		若区间[i-max, i]为回文串,则max = i - (i-max) + 1 = max + 1
 * @author god
 *
 */
public class leetcode5 {
	public String longestPalindrome(String s) {
	    char[] ca = s.toCharArray();
	    int start = 0, end = 0;
	    int max = 0;
	    for(int i = 0; i < ca.length; i++) {
	        if(isPalindrome(ca, i - max - 1, i)) {
	            start = i - max - 1; 
	            end = i;
	            max += 2;
	        } else if(isPalindrome(ca, i - max, i)) {
	            start = i - max; 
	            end = i;
	            max += 1;
	        }
	    }
	    return s.substring(start, end + 1);
	}

	private boolean isPalindrome(char[] ca, int s, int e) {
	    if(s < 0) return false;
	    
	    while(s < e) {
	        if(ca[s++] != ca[e--]) return false;
	    }
	    return true;
	}

}
