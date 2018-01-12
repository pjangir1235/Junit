package com.accolite.Junit;

public class fizzBuzz {
	private String fizzbuzz()
	{
		return("FizzBuzz");
	}
	private String fizz()
	{
		return("Fizz");
	}
	private String buzz()
	{
		return("Buzz");
	}
	public String FizzBuzzMethod(int val) {
		fizzBuzz ob=new fizzBuzz();
		if (val % 3 == 0 && val % 5 == 0)
			return ob.fizzbuzz();

		else if (val % 3 == 0)
			return ob.fizz();
		else if (val % 5 == 0)
			return ob.buzz();
		return val + "";
	}
}
