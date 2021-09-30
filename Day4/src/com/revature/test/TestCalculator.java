package com.revature.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.Calculator;

public class TestCalculator {
	@Test
	public void testFindMax1() {
		assertEquals(4, Calculator.findMax(new int[] { 1, 3, 4, 2 }));
//		assertEquals(-1, Calculator.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}
	
	@Test
	public void testFindMax2() {
//		assertEquals(4, Calculator.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Calculator.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}
}
