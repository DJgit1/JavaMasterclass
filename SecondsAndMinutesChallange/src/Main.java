public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {

        if (seconds > 0) {
            int remainingSeconds = seconds;
            int hours = seconds / 3600;
            remainingSeconds = seconds % 3600;
            int minutes = remainingSeconds / 60;
            remainingSeconds %= 60;
            return hours + "h " + minutes + "m " + remainingSeconds + "s";
        } else {
            return "Incorrect number of seconds";
        }
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            return getDurationString((minutes) * 60 + seconds);
        } else {
            return "Incorrect number of minutes and seconds";
        }
    }
}
