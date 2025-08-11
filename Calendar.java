import java.util.Scanner;

class Calendar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        System.out.print("Enter Month: ");
        int month = scanner.nextInt();

        System.out.println(" " + year + "Y " + month + "M");

        System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");

        // Set the cal object to the first date of the given month
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month - 1, 1);

        // Get the day of the week of the first day as a number
        int startDayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);

        // Print spaces corresponding to the first day’s weekday to align the calendar
        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("     "); // Print 5 spaces
        }

        // The last date of the given month
        int lastDayOfMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);

        // Print the dates
        for (int day = 1; day <= lastDayOfMonth; day++) {
            // Print the date right-aligned in a 4-character width
            System.out.printf("%4d ", day); 

            // Line break if it is Saturday
            if ((startDayOfWeek + day - 1) % 7 == 0) {
                System.out.println();
            }
        }

    }
}