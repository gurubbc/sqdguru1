package com.ofss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyCalculatorTest {

	@Test
	void testAdd() {
		MyCalculator mc = new MyCalculator();
		int actual=mc.add(10, 15);
		int expected=25;
		Assert.assertEquals(expected, actual);
	}

	@Test
	void testSub1() {
		MyCalculator mc = new MyCalculator();
		int a = 50, b = 25;
	
		int	actual=mc.sub(a,b);
	
		int expected=25;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	void testSub2() {
		MyCalculator mc = new MyCalculator();
		int a = 25, b = 50;
	
		int	actual=mc.sub(a,b);
	
		int expected=25;
		Assert.assertEquals(expected, actual);
	}

}
