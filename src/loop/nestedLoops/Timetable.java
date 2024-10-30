package loop.nestedLoops;

public class Timetable {
    /*
    Task 2: Create a timetable

    Create a timetable for a subway that runs every 15 minutes between 6 and 8 o'clock
    Use a nested for loop to display all the times at which a subway departs.
    Print the schedule to the console

    Output:
    6:00
    6:15
    6:30
    6:45
    7:00
    7:15
    …
    8:00
     */
    public static void main(String[] args) {

        for (int hour = 6; hour <= 8; hour++) {
            for (int minute = 0; minute < 60; minute += 15) {
                if (hour == 8 && minute > 0){
                    break;
                }
                System.out.printf( "Departure time: %02d:%02d o'clock%n",hour, minute);
            }
        }
    }
}
