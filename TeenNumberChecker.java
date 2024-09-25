// Teen Number Checker
//We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

//Write a method named hasTeen with 3 parameters of type int.

//The method should return boolean and it needs to return true
//if one of the parameters is in range 13(inclusive) - 19 (inclusive).
// Otherwise return false.


public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(9, 99, 19);

    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);

    }

    public static boolean isTeen(int testNumber) {
        return testNumber >= 13 && testNumber <= 19;
    }



}
