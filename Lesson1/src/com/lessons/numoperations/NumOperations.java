package com.lessons.numoperations;

public class NumOperations {

	public int sumNum(int num){
		String numToString = Integer.toString(num);
		int multiplier = 1;
		int result = 0;
		for(int i = 0; i < numToString.length();i++) {
			multiplier = multiplier *10;
			int var = (num%multiplier) / (multiplier/10);
            result = result + var;  
		}
		return result;
	}
	
	public int charSum(int num) {
		String numToString = Integer.toString(num);
		char [] chars = numToString.toCharArray();
		int result = 0;
		String charCase = null;
		for(int i = 0;i < chars.length;i++) {
			charCase = Character.toString(chars[i]);
			int charCaseNum = Integer.parseInt(charCase);
			result = result + charCaseNum;
		}
		return result;
	}
	
	 public int getPalindrom() {
		 int maxPalindrome = 0;
		    //int palindromeMultiplier1= 0;
		    //int palindromeMultiplier2 = 0;
		    for (int i = 1000; i < 10000; i++) {
				for (int j = 1000; j < 10000; j++) {
					int productResult = i*j;
					int palindromCheck = 0;
					String productResultToString = Integer.toString(productResult);
					char [] chars = productResultToString.toCharArray();
					String productResultToStringReverse = Character.toString(chars[chars.length-1]);
					for (int k = chars.length -2; k >= 0; k--) {
						String getArrayValue = Character.toString(chars[k]);
						productResultToStringReverse = productResultToStringReverse + getArrayValue;
					}
					int productResultReverse = Integer.parseInt(productResultToStringReverse);
					if(productResult == productResultReverse) {
						palindromCheck = productResult;
					}
					if(maxPalindrome< palindromCheck) {
						maxPalindrome = palindromCheck;
						//palindromeMultiplier1 = i;
						//palindromeMultiplier2 = j;
					} 
					
					}
			}
		   // System.out.println("Max palindrom is " + maxPalindrome + " " + 
		   //"with multiplier " + palindromeMultiplier1 + " and  " + palindromeMultiplier2);
		   return maxPalindrome; 
	 }
	
}
