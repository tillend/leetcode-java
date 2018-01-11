package leetcode1_10;

import java.util.HashSet;
import java.util.Set;

public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            Set<Character> set = new HashSet<>();
            int length = 0;
            
        	for(int j = i; j < chars.length; j++) {
            	char c = chars[j];
            	
            	if(set.contains(c)) {
            		break;
            	}else {
            		length += 1;
            		maxLength = (length > maxLength)? length : maxLength;
            		set.add(c);
            	}	
        	}
        }
        
        return maxLength;
    }

}
