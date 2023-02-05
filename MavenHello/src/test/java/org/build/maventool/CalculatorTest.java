package org.build.maventool;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *  Calculator Unit Test class
 */
public class CalculatorTest
{

		/**
		 * Test method for {@link org.build.anttool.Calculator#getProduct(int, int)}.
		 */
		@Test
		public void testGetProduct()
		{
				Calculator calc = new Calculator();
				assertEquals(6, calc.getProduct(3, 2));
		}

}
