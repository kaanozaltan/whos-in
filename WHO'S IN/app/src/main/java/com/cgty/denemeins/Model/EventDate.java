package com.cgty.denemeins.Model;

import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Custom date class with a method to use in database calculate time between two dates
 * @author Kutay Demiray
 * @version 1.0
 */
public class EventDate {

    /**
     * Creates and returns EventDate with current time
     * @return Current time EventDate
     */
    public static EventDate getInstance() {
        int year, month, day, hour, minute;

        // get current time using java's Calendar class
        Calendar calendar = Calendar.getInstance();
        year = calendar.get( Calendar.YEAR );
        month = calendar.get( Calendar.MONTH );
        day = calendar.get( Calendar.DAY_OF_MONTH );
        hour = calendar.get( Calendar.HOUR_OF_DAY );
        minute = calendar.get( Calendar.MINUTE );

        // create EventDate instance with current time and compare it with this date
        EventDate current = new EventDate( year, month, day, hour, minute );

        return current;
    }

    // properties
    int year, month, day, hour, minute;

    // constructor
    /**
     * Empty constructor for database use
     */
    public EventDate() {}

    /**
     * Regular constructor
     */
    public EventDate(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * Constructor using strings in DD/MM/YYYY and HH:MM formats (will probably crash otherwise!)
     */
    public EventDate( String dateString, String timeString ) {
        year = Integer.parseInt( dateString.substring( 6, 10 ) );
        month = Integer.parseInt( dateString.substring( 3, 5 ) );
        day = Integer.parseInt( dateString.substring( 0, 2 ) );
        hour= Integer.parseInt( timeString.substring( 0, 2) );
        minute = Integer.parseInt( timeString.substring( 3, 5) );
    }

    // methods

    /**
     * Checks if this date is in the past
     * @return Date is past
     */
    public boolean isPast() {

        return ( compareTo( EventDate.getInstance() ) == -1 );
    }

    /**
     * Compares this date instance and another date
     * @param other Another event date to compare this event to
     * @return -1 if this date is earlier than other, 0 if they are at the same time, 1 if this event is later than other
     */
    public int compareTo( EventDate other ) {

        if ( getYear() != other.getYear() ) {

            if ( getYear() < other.getYear() ) {
                return -1;
            }
            else {
                return 1;
            }
        }
        else if ( getMonth() != other.getMonth() ) {
            if ( getMonth() < other.getMonth() ) {
                return -1;
            }
            else {
                return 1;
            }
        }
        else if ( getDay() != other.getDay() ) {
            if ( getDay() < other.getDay() ) {
                return -1;
            }
            else {
                return 1;
            }
        }
        else if ( getHour() != other.getHour() ) {
            if ( getHour() < other.getHour() ) {
                return -1;
            }
            else {
                return 1;
            }
        }
        else if ( getMinute() != other.getMinute() ) {
            if ( getMinute() < other.getMinute() ) {
                return -1;
            }
            else {
                return 1;
            }
        }
        else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return getCalendarDate() + " " + getTimeOfDay();
    }

    /**
     * Returns current date (as in calendar) in DD/MM/YYYY format as String
     * @return current date
     */
    public String getCalendarDate() {
        return String.format( "%02d/%02d/%04d", day, month, year );
    }

    /**
     * Returns hour in HH:MM format as String
     * @return current hour and minute
     */
    public String getTimeOfDay() {
        return String.format( "%02d:%02d", hour, minute );
    }

    // getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

}