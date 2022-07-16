package lab6;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities
{
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getMultiplesOf3(int[] numbers)
    {
        int[] listofmultiplesofthree = new int[0];
        int [] lengthofarray = numbers;
        for (int i = 0; i < lengthofarray.length; i=i+1)
        {
            if (lengthofarray[i] % 3 ==0)
            {
                int[] updatedlistofnumbers = new int[listofmultiplesofthree.length+1];
                for (int j = 0; j < listofmultiplesofthree.length; j=j+1)
                {
                    updatedlistofnumbers[j] = listofmultiplesofthree[j];
                }
                updatedlistofnumbers[listofmultiplesofthree.length] = numbers[i];
                listofmultiplesofthree = updatedlistofnumbers;
            }
        }

        return listofmultiplesofthree;
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Assumptions:
     * 	- numbers.length >= 1
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static String[] getAllPrefixes(int[] numbers)
    {
        int [] lengthofarray = numbers;
        String[] listsofprefixes = new String[lengthofarray.length];
        String pattern = "" + lengthofarray[0];
        listsofprefixes[0] = "[" + pattern + "]";

        for (int i = 1; i <lengthofarray.length; i=i+1)
        {
            pattern = pattern + ", " + lengthofarray[i];
            listsofprefixes[i] = "[" + pattern + "]";
        }
        return listsofprefixes ;
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getGroupedNumbers(int[] numbers)
    {
        int positioninarray = 0;
        int [] lengthofarray = numbers;
        int [] groupednumbers = new int [lengthofarray.length];
        for (int i=0; i<lengthofarray.length; i=i+1)
        {
            if (lengthofarray[i]%3==0)
            {
                groupednumbers[positioninarray] = lengthofarray[i];
                positioninarray =positioninarray + 1;
            }

        }
        for (int j=0; j<lengthofarray.length; j=j+1)
        {
            if (lengthofarray[j] % 3 == 1) {
                groupednumbers[positioninarray] = lengthofarray[j];
                positioninarray = positioninarray + 1;
            }
        }
        for (int k=0; k<lengthofarray.length; k=k+1)
        {
            if (lengthofarray[k] % 3 == 2) {
                groupednumbers[positioninarray] = lengthofarray[k];
                positioninarray = positioninarray + 1;
            }
        }
        return groupednumbers;
    }

    /*
     * Input parameters:
     * 	- `twoDimArray` : a 2D array of integers
     *
     * Note: the sub-arrays may have different sizes.
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] zigZagFlatten(int[][] twoDimArray)
    {

        int[] zigzagflattenarray = new int[0];
        int [][]twodarraylength = twoDimArray;
        int positionofarray = 0;
        for(int i = 0; i < twodarraylength.length; i= i+1)
        {
            int[] updatedzigzagflattenarray = new int[zigzagflattenarray.length + twodarraylength[i].length];
            for(int j = 0; j < zigzagflattenarray.length;j=j+1)
            {
                updatedzigzagflattenarray[j] = zigzagflattenarray[j];
            }
            if(i % 2 == 0)
            {
                for(int k = 0; k < twodarraylength[i].length; k=k+1)
                {
                    updatedzigzagflattenarray[positionofarray] = twodarraylength[i][k];
                    positionofarray = positionofarray+1;
                }
            }else
            {
                for(int l = twodarraylength[i].length-1; l >= 0; l=l-1)
                {
                    updatedzigzagflattenarray[positionofarray] = twoDimArray[i][l];
                    positionofarray = positionofarray + 1;
                }
            }
            zigzagflattenarray = updatedzigzagflattenarray;
        }

        return zigzagflattenarray;
    }
}
