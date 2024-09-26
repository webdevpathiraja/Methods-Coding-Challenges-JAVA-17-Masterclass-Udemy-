public class LeapYearCalculator {
    public static void main(String[] args) {
        isLeapYear(2400);
    }

    public static void isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            System.out.println("Invalid Year");
        }

        if (year % 4 == 0) {

            if (year % 100 != 0) { // not divisible by 100
                System.out.println(year + " is divisible by 4, yet not divisible by 100");
                System.out.println(year + " is a leap year.");
            } else { // divisible by 100

                if (year % 400 == 0) {
                    System.out.println(year + " is divisible by both 100 & 400.");
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is divisible by 100. Not divisible by 400.");
                    System.out.println(year + " is not a leap year");
                }
            }
        } else {
            System.out.println(year + " is not divisible by 4");
            System.out.println(year + " is not a leap year.");
        }
    }
}

