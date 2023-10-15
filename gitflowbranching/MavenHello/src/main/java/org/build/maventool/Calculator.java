package org.build.maventool;

/**
 *  Calculator class
 */
public class Calculator
{
   /**
    * getProduct
    * @param val1 integer
    * @param val2 integer
    * @return product of val1 and val2
    */
   public int getProduct(int val1, int val2)
    {
		   return val1*val2;
    }
   
   /**
    * main method
    * @param args arguments
    */
   public static void main(String[] args)
   {
        Calculator calc = new Calculator();
       
        int product = calc.getProduct(43,4);
       
        System.out.println("Product of " + " 43 and 4 is "+product);
   }
}
