package lab2;

/**
 * A random assortment of methods reviewing topics that should improve your
 * programming skills in using Java Control Structures (selection structures,
 * repetition structures, and nested Loops)
 * <p>
 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
 * strictly forbidden. Violation of this will result in a 70% penalty on your
 * marks. Try to solve this problem using Java Control Structures (selection
 * structures, repetition structures, and nested Loops) only </strong>
 * </p>
 */

public class Utilities {


    /**
     * ALREADY IMPLEMENTED; DO NOT MODIFY
     */
    private Utilities() {
        // ALREADY IMPLEMENTED; DO NOT MODIFY
    }

    /**
     *
     * Write a static method that counts the number of integers between a
     * lower-limit integer and an upper-limit integer. Also, the method computes the
     * sum of all even and odd integers between the lower-limit and upper-limit
     * input values.
     *
     * <p>
     * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
     * strictly forbidden. Violation of this will result in a 70% penalty on your
     * marks. Try to solve this problem using Java Control Structures (selection
     * structures, repetition structures, and nested Loops) only </strong>
     * </p>
     * <p>Make sure the method compiles without errors and returns the correct result
     *  when invoked.
     * </p>
     * <p>
     * Examples:
     * </p>
     *
     * <pre>
     * if lowerLimit=0 and  upperLimit= 5 then return "6 numbers between 0 and 5: sum of odds (9) and sum of evens (6)"
     * if lowerLimit=10 and  upperLimit= 10 then return "1 number between 10 and 10: sum of odds (0) and sum of evens (10)"
     * if lowerLimit=0 and  upperLimit= 6 then return "7 numbers between 0 and 6: sum of odds (9) and sum of evens (12)"
     * if lowerLimit=7 and  upperLimit= 10 then return "4 numbers between 7 and 10: sum of odds (16) and sum of evens (18)"
     * </pre>
     *<p>
     * Remember that double quotations are shown above to indicate the beginning and
     * end of the string value, and these double quotations are not part of the
     * return value.
     * </p>
     * @param lowerLimit lower limit integer value
     * @param upperLimit upper limit integer value
     * @return String value as shown in the examples above
     *
     * <p>
     *     <strong> Precondition: </strong> lowerLimit and upperLimit are non-negative values
     * </p>
     *
     *
     */

    public static String sumofEvensandOdds(int lowerLimit, int upperLimit)
    {

        /* Your implementation of this method starts here.
         * Recall that :
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        int totalnumbers = upperLimit-lowerLimit+1;
        int evensum = 0;
        int oddsum = 0;
        for(int i=lowerLimit;i<=upperLimit;i++)
        {
            if ((i%2==0))
            {
                evensum=evensum+i;
            }
            else
            {
                oddsum=oddsum+i;
            }
        }
        String Result = String.format("%d numbers between %d and %d: sum of odds (%d) and sum of evens (%d)",totalnumbers,lowerLimit,upperLimit,oddsum,evensum);
        if (lowerLimit==upperLimit)
        {
            Result = String.format("%d number between %d and %d: sum of odds (%d) and sum of evens (%d)",totalnumbers,lowerLimit,upperLimit,oddsum,evensum);
        }
        return Result;
        /* Your implementation here. */
    }


    /**
     * Write a static method  receives a certain amount of time in seconds and then
     * return a string indicated how many minutes and remaining seconds in the given
     * input
     * <p>
     * Examples:
     * </p>
     *
     * <pre>
     * if seconds=500 then return "500 seconds is (8) minutes and (20) seconds"
     * if seconds=150 then return "150 seconds is (2) minutes and (30) seconds"
     * if seconds=50 then return "50 seconds is (0) minutes and (50) seconds"
     * </pre>
     *
     * <p>
     *  <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
     *  strictly forbidden. Violation of this will result in a 70% penalty on your
     *  marks. Try to solve this problem using Java Control Structures (selection
     *  structures, repetition structures, and nested Loops) only </strong>
     * </p>
     *
     * Make sure the method compiles without errors and returns the correct result
     * when invoked.
     *
     *
     *
     * <p>
     * Remember that double quotations are shown above to indicate the beginning and
     * end of the string value, and these double quotations are not part of the
     * return value.
     * </p>
     *
     *
     * @param seconds : int input value
     * @return return the String value as shown in the examples above
     *<p> <strong> Precondition: </strong>  seconds input value is greater than or equals to zero  </p>
     */

    public static String minutesSeconds(int seconds)
    {

        /* Your implementation of this method starts here.
         * Recall that :
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        int timeinmin = seconds/60;
        int timeinsec = seconds % 60;
        String totaltime = String.format("%d seconds is (%d) minutes and (%d) seconds",seconds,timeinmin,timeinsec);
        return totaltime;
        /* Your implementation here. */
    }

    /**
     * Write a static method to compute the exponent of a fraction number.
     * The method receives numerator, denominator and exponents
     * and then returns a double value representing the value of the given fraction raised to the given exponent.
     * The returned value should be rounded to the nearest millionth
     * <p>
     * Examples:
     * </p>
     *
     * <pre>
     * if numerator=1, denominator = 2  and  exponents= 2 then return 0.25
     * if numerator=2, denominator = 1  and  exponents= -2 then return 0.25
     * if numerator=25, denominator = 35  and  exponents= 3 then return 0.364431
     * </pre>
     *
     * Make sure the method compiles without errors and returns the correct result
     * when invoked.
     *
     * @param numerator integer value
     * @param denominator integer value
     * @param exponent integer value
     * @return a double value representing the value of the given fraction raised to the given exponent.
     *         The returned value should be rounded to the nearest millionth
     */
    public static double fractionExponents(int numerator, int denominator, int exponent )
    {
        /* Your implementation of this method starts here.
         * Recall that :
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        double top = numerator;
        double bottom = denominator;
        double power = exponent;
        double answer = Math.pow(top/bottom,power);
        double roundedanswer = (answer*1000000.0)/1000000.0;
        return roundedanswer;

        /* Your implementation here. */
    }



    /**
     * Write a static method takes in two numbers as input arguments: an account
     * balance (rounded to two decimal points) and an annual interest rate expressed
     * as a percentage. The method return double value indicated the balance after five
     * years have elapsed. The return balance after five years should be rounded to
     * two decimal points See examples below. Note that the interest from the first
     * year is added back to the bank balance, therefore, itself subject to
     * interest in the second year, and so on.
     *
     * <p>
     * Examples:
     * </p>
     *
     * <pre>
     * if balance=6000.00 and interest=4.25 then return  7388.08
     * if balance=3000.00 and interest=3.50 then return 3563.06
     * if balance=4000.00 and interest=2.25 then return 4470.71
     * </pre>
     *
     *
     * Make sure the method compiles without errors and returns the correct result
     * when invoked.
     *
     * @param balance   input balance
     * @param interest  an annual interest rate expressed as a percentage. rounded
     *                 to two decimal points
     * @return double value as shown in the examples above
     */

    public static double fiveyearbalance(double balance, double interest)
    {
        /* Your implementation of this method starts here.
         * Recall that :
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        double total = balance;
        double intrestrate = interest/100;
        for (int years = 0; years<5; years++ )
        {
            total = total +(intrestrate*total);
        }
        return total;
        /* Your implementation here. */
    }

}
