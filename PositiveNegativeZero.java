public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);

    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero");
        }

        //System.out.println((number > 0) ? "positive" : (number < 0) ? "negative" : "zero");
    }


}
