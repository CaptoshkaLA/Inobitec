package XML_auxiliary_functionality;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;
import java.time.Period;
import java.util.Date;

import java.time.LocalDate;

public class Auxiliary_class {

    public static String getName(String firstName, String lastName, String middleName) {
        return lastName + " " + firstName + " " + middleName;
    }

    public static LocalDate convertToLocalDateViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static int ageCalculator(Date date) {
        Calendar calendar = Calendar.getInstance(); // Returns instance with current date and time set
        LocalDate lcDate = convertToLocalDateViaMilisecond(date);
        LocalDate lcToday = convertToLocalDateViaMilisecond(calendar.getTime());
        return Period.between(lcDate, lcToday).getYears();
    }
}