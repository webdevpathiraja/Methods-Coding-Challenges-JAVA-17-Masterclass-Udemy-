public class minutesToYearAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        }

        long years = minutes / (365 * 24 * 60);
        //System.out.println("years = " + years);

        long remainingMinutes =minutes % (365 * 24 * 60);
        //System.out.println("remainingMinutes = " + remainingMinutes);

        long days = remainingMinutes / (60 * 24);
        //System.out.println("days = " + days);

        System.out.println(minutes + " min = " + years + " y and " + days + " d " );

    }
}
