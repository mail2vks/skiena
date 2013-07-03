package org.vivek.skiena.ch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Answer28Test {

	@Test
	public void testDivideOne()
	{
		assertEquals(0,Answer28.divideOne(0,1));
		assertEquals(0,Answer28.divideOne(0,0));
		assertEquals(0,Answer28.divideOne(1,0));
		assertEquals(16,Answer28.divideOne(32,2));
		assertEquals(0,Answer28.divideOne(2,32));
		assertEquals(349649,Answer28.divideOne(4545443,13));
		assertEquals(0,Answer28.divideOne(-100,20));
		assertEquals(0,Answer28.divideOne(100,-20));
		assertEquals(33,Answer28.divideTwo(99,3));
	}

	@Test
	public void testDivideTwo()
	{
		assertEquals(0,Answer28.divideTwo(0,1));
		assertEquals(0,Answer28.divideTwo(0,0));
		assertEquals(0,Answer28.divideTwo(1,0));
		assertEquals(16,Answer28.divideTwo(32,2));
		assertEquals(0,Answer28.divideTwo(2, 32));
		assertEquals(349649,Answer28.divideTwo(4545443,13));
		assertEquals(0,Answer28.divideTwo(-100,20));
		assertEquals(0,Answer28.divideTwo(100,-20));
		assertEquals(33,Answer28.divideTwo(99,3));
	}
}
