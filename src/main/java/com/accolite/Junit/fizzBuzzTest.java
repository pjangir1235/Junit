package com.accolite.Junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class fizzBuzzTest {

	fizzBuzz fz;
	@Before
	public void setUp() throws Exception {
		fz=new fizzBuzz();
	}
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void FizzBuzzMethodTest()
	{
		String str1="Fizz";
		String str2="FizzBuzz";
		String str3="Buzz";
		assertEquals(str1, fz.FizzBuzzMethod(3));
		assertEquals(str2, fz.FizzBuzzMethod(15));
		assertEquals(str3, fz.FizzBuzzMethod(10));
		assertEquals("8", fz.FizzBuzzMethod(8));
		
	}

}
