package com.lessons.numoperations;

public class NumOperations {

	public int sumNum(int num){
		String str = Integer.toString(num);
		int sum = 1;
		int result = 0;
		for(int i = 0; i < str.length();i++) {
			sum = sum *10;
			int var = (num%sum) / (sum/10);
            result = result + var;  
		}
		return result;
	}
	
	public int charSum(int num) {
		String str = Integer.toString(num);
		char [] chars = str.toCharArray();
		int result = 0;
		String ch = null;
		for(int i = 0;i < chars.length;i++) {
			ch = Character.toString(chars[i]);
			int num1 = Integer.parseInt(ch);
			result = result + num1;
		}
		return result;
	}
	
	 public int getPalindrom() {
		 int maxPar = 0;
		    //int showNum1= 0;
		    //int showNum2 = 0;
		    for (int i = 1000; i < 10000; i++) {
				for (int j = 1000; j < 10000; j++) {
					int result = i*j;
					int check = 0;
					String str = Integer.toString(result);
					char [] chars = str.toCharArray();
					String str2 = Character.toString(chars[chars.length-1]);
					for (int k = chars.length -2; k >= 0; k--) {
						String ch = Character.toString(chars[k]);
						str2 = str2 + ch;
					}
					int result2 = Integer.parseInt(str2);
					if(result == result2) {
						check = result;
					}
					if(maxPar< check) {
						maxPar = check;
						//showNum1 = i;
						//showNum2 = j;
					}
					
					}
			}
		   // System.out.println("Max palindrom is " + maxPar + " " + 
		   //"with multiplier " + showNum1 + " and  " + showNum2);
		    return maxPar;
	 }
	
}
