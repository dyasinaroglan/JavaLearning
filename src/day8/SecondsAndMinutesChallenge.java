package day8;

public class SecondsAndMinutesChallenge {

    private static int hour;

    public static void main(String[] args) {

        System.out.println(getDurationString(6550));
        System.out.println(getDurationString(-55));

    }


    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Geçersiz değer");
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60; // mod alma 60'tan kalan artık

        return getDurationString(minutes, remainingSeconds);

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Geçersiz değer");

        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return String.format("%dh %dm %ds", hours, remainingMinutes, seconds);
    }
}

