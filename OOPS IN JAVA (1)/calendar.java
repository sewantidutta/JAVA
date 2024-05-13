import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        // Set the calendar to the first day of the current month
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        // Get the day of the week for the first day of the month (0=Sunday, 1=Monday,
        // ...,6=Saturday)
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1; // Adjust to 0=Sunday
        // Print the header row
        String[] daysOfWeek = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        for (String dayOfWeek : daysOfWeek) {
            System.out.printf("%-20s", dayOfWeek);
        }
        System.out.println();
        // Print leading spaces for the first week
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.printf("%-20s", " ");
        }
        int currentDayOfWeek = firstDayOfWeek;
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDayOfMonth; i++) {
            if (i == day) {
                System.out.printf("%-20s", i + "*");
            } else {
                System.out.printf("%-20s", i);
            }
            currentDayOfWeek++;
            if (currentDayOfWeek == 7) {
                System.out.println();
                currentDayOfWeek = 0;
            }
        }
    }
}
