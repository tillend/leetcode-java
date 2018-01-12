package leetcode1_10;

public class leetcode8 {
    public int myAtoi(String str) {
    	int index = 0, sign = 1, sum = 0;
        //1.空串
    	if(str.length() == 0) return 0;
    	
    	//2.去除空格
    	while(str.charAt(index) == ' ' && index < str.length())
    		index++;
    	
    	//3.处理符号
    	if(str.charAt(index) == '+' || str.charAt(index) == '-') {
    		sign = (str.charAt(index) == '+')? 1 : -1;
    		index++;
    	}
    	
        //4. 字符串转换数字并防止溢出
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //防止与最大int位数相同且个位溢出
            if(sum > Integer.MAX_VALUE / 10 || sum == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE % 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            sum = 10 * sum + digit;
            index ++;
        }
        return sum * sign;
    }
    
}
