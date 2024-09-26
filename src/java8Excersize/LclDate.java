package java8Excersize;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class LclDate {
	
	// Example 5: Using Date and Calendar for Date Handling
    public static void handleDatesJava7() {
        // Java 7: Using Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.SEPTEMBER, 23);
        Date dateJava7 = cal.getTime();
        System.out.println("Date using Java 7: " + dateJava7);
    }


	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2014, 9, 23);
	      System.out.println(date1);

	}

}
