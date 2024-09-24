// DecimalComparator
//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

/*The method should return boolean and it needs to return true if two double numbers
are the same up to three decimal places. Otherwise, return false.*/

// Answer =>
public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(8.514,6.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        long intOne = (long) (numberOne * 1000);
        long intTwo = (long) (numberTwo * 1000);

        return intOne == intTwo;
    }

    // Optional Explanation
    /*public static void areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        long intOne = (long) (numberOne * 1000);
        long intTwo = (long) (numberTwo * 1000);

        if (intOne == intTwo) {
            System.out.println(intOne + " & " + intTwo + " are equal up to 3 decimal points.");
        }

        System.out.println(intOne + " & " + intTwo + " are not equal up to 3 decimal points.");
    }*/
}
