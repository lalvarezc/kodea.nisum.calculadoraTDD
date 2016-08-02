package com.kodea.proyectoCalculadoraTDD;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CalcTest {

	@Test
	
	public void checkInstance(){
		
		//arrange 
		Calc calc;
		
		//act 
		calc = new Calc();
		
		//assert 
		assertNotNull(calc);
	}
	
	@Test
	public void checkTwoIntegers(){
		Calc calc;
		calc = new Calc();
		int val1=1;
		int val2=20;
		
		double result = calc.add(val1, val2);
		
		assertEquals(21, result, 0.1);
	}
	
	
	@Test
	public void substractTwoIntegers(){
		Calc calc;
		calc = new Calc();
		int val1 =20;
		int val2=1;
		double result = calc.substract(val1, val2);
		assertEquals(19, result, 0.1);
	}
	
	@Test
	public void multiplyTwoIntegers(){
		Calc calc;
		calc = new Calc();
		int val1 =20;
		int val2=1;
		double result = calc.multiply(val1, val2);
		assertEquals(20, result, 0.1);
	}
	
	@Test 
	public void divideTwoIntegers(){
		Calc calc;
		calc = new Calc();
		int val1 =20;
		int val2=1;
		double result = calc.divide(val1, val2);
		assertEquals(20, result, 0.1);
	}
	
	@Test (expected = ArithmeticException.class)
		public void checkDivideByZero()
		{
			Calc calc;
			calc = new Calc();
			int val1=20;
			int val2=0;
			calc.divide(val1, val2);
		}
	
	
}
