package com.vivek.skiena.ch1;

import org.junit.Test;
import org.vivek.skiena.ch1.Answer28;

import static junit.framework.Assert.assertEquals;

public class Answer28Test {

	@Test
	public void testDivideOne()
	{
		assertEquals(0,Answer28.divideOne(0,1));
		assertEquals(0,Answer28.divideOne(0,0));
		assertEquals(16,Answer28.divideOne(32,2));
		assertEquals(349649,Answer28.divideOne(4545443,13));
	}

}
