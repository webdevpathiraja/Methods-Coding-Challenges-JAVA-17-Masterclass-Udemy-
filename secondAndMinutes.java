public class secondAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        // Two step approach to get hours
        /*int minutes = seconds / 60;
        int hours = minutes/ 60;
        //System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
        //System.out.println("minutes = " + minutes);
        //System.out.println("remainingMinutes = " + remainingMinutes);

        int remainingSeconds = seconds % 60;
        //System.out.println("remainingSeconds = " + remainingSeconds);

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";*/

        if (seconds < 00) {

            return "Invalid data for seconds (" + seconds
                    + "), must be a positive integer value";
        }
        int minutes = seconds / 60;
        return getDurationString(seconds /60, seconds % 60);

    }
    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 00) {
            return "Invalid data for seconds (" + minutes
                    + "), must be a positive integer value";
        }

        if ( seconds < 0 || seconds > 59) {
            return "Invalid data for seconds (" + seconds +
                    "), must be between 0 and 59";
        }

        int hours = minutes/ 60;
        //System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
        //System.out.println("minutes = " + minutes);
        //System.out.println("remainingMinutes = " + remainingMinutes);

        //int remainingSeconds = seconds % 60;
        //System.out.println("remainingSeconds = " + remainingSeconds);

        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }


}
