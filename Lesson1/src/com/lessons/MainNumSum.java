package com.lessons;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.lessons.numoperations.NumOperations;

public class MainNumSum {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		
		NumOperations operation = new NumOperations();
		int num = 12345;
		int num2 = 123456;
		
		logger.log(Level.INFO," Chek numbers sum with dividing method " + operation.sumNum(num));
		logger.log(Level.INFO," Chek numbers sum with dividing method2 " + operation.sumNum(num2));
		
		logger.log(Level.INFO," Chek numbers sum with brek the numbers into char method " + operation.charSum(num));
		logger.log(Level.INFO," Chek numbers sum with brek the numbers into char method2 " + operation.charSum(num2));
        
		logger.log(Level.INFO," Max palindrom is  " + operation.getPalindrom());
    
	}

}
