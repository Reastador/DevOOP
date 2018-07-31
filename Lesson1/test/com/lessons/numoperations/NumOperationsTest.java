package com.lessons.numoperations;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumOperationsTest {

	@Test
	public void test() {
		NumOperations test = new NumOperations();
		int result = test.sumNum(12345);
		assertEquals(15,result);
	}
	@Test
	public void test2() {
		NumOperations test = new NumOperations();
		int result = test.charSum(12345);
		assertEquals(15,result);
	}	
	@Test
	public void test3() {
		NumOperations test = new NumOperations();
		int result = test.getPalindrom();
		assertEquals(99000099,result);
		}
}