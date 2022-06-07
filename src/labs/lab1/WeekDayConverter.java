package labs.lab1;

public class WeekDayConverter {
    public static void main(String[] args) {
        int weekDay = Integer.parseInt(args[0]);
        String weekDayName = switch (weekDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        String weekDayOrinal = switch (weekDay) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
        System.out.println("The " + weekDay + weekDayOrinal + " day of the week is " + weekDayName);
    }
}
