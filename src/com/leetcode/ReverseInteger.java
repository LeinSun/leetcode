package com.leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(1534236469));

	}
	

    public int reverse(int x) {
    	
    	StringBuffer resultBuf = new StringBuffer();
    	String xString = String.valueOf(x);
    	int len = xString.length();
    	for (int i = len-1; i > 0; i--) {
    		resultBuf.append(xString.charAt(i));
    		if (resultBuf.indexOf("0")==0) {
    			resultBuf.deleteCharAt(0);
			}
		}
    	if (xString.charAt(0) == '-') {
    		resultBuf.insert(0, '-');
		}else {
			resultBuf.append(xString.charAt(0));
		}
    	int result = 0;
		try {
			result = Integer.parseInt(resultBuf.toString());
		} catch (NumberFormatException e) {
			
		}
		return result;
        
    }
    
    //best solution
    public int reverse2(int x){
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
	
    public int reverse3(int x){
	    int output = 0;
	    
	    while (true) {
	        if (x == 0) {
	            return x;
	        }
	        
	        output = output * 10 + x % 10;
	        
	        if ((x /= 10) == 0) {
	            return output;
	        }
	        
	        if (output > 214748364 || output < -214748364) {
	            return 0;
	        }
	    }
    }
}
