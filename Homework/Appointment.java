package Homework;

import java.util.Scanner;

public class Appointment {
    private String name;
    private String month;
    private int day;
    private int year;
    private int hour;
    private int minute;

    public Appointment(){
        this.setMonth("Unknown");
        this.setYear(-1);
        this.setDay(-1, month, year);
        this.hour = 0;
        this.minute = 0;

    }

    public int getDay() {
        return day;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public String getName() {
        return name;
    }

    public Appointment(String monthPassed, int dayPassed, int yearPassed, int hourPassed, int minutePassed){
        this.setMonth(monthPassed);
        this.setYear(yearPassed);
        this.setDay(dayPassed, month, year);
        this.setHour(hourPassed);
        this.setMinute(minutePassed);
    }
    public void setMonth(String monthPassed){
        Scanner input = new Scanner(System.in);
        while(  !monthPassed.equalsIgnoreCase("January") &&
                !monthPassed.equalsIgnoreCase("February") &&
                !monthPassed.equalsIgnoreCase("March") &&
                !monthPassed.equalsIgnoreCase("April") &&
                !monthPassed.equalsIgnoreCase("May") &&
                !monthPassed.equalsIgnoreCase("June") &&
                !monthPassed.equalsIgnoreCase("July") &&
                !monthPassed.equalsIgnoreCase("August") &&
                !monthPassed.equalsIgnoreCase("September") &&
                !monthPassed.equalsIgnoreCase("October") &&
                !monthPassed.equalsIgnoreCase("November") &&
                !monthPassed.equalsIgnoreCase("December")){
            System.out.println("Please enter a valid month (January - December): ");
            monthPassed = input.nextLine();
        } this.month = monthPassed;
    }
    public void setHour(int hourPassed){
        Scanner input = new Scanner(System.in);
        while (hourPassed < 0 || hourPassed > 23){
            System.out.println("Please enter a valid hour (0-23):");
            hourPassed = Integer.parseInt(input.nextLine());
        }
        this.hour = hourPassed;

    }
    public void setMinute(int minutePassed){
        while (minutePassed < 0 || minutePassed > 59){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a valid minute (0-59):");
            minutePassed = Integer.parseInt(input.nextLine());
        }
        this.minute = minutePassed;
    }
    public void setDay(int dayPassed, String monthPassed, int yearPassed){
    Scanner input = new Scanner(System.in);
    switch (monthPassed){
        case "January":
        case "March":
        case "May":
        case "July":
        case "August":
        case "October":
        case "December":
            while(dayPassed < 1 || dayPassed > 31){
                System.out.println("To enter a day, please enter 1-31.");
                dayPassed = Integer.parseInt(input.nextLine());
            }
            this.day = dayPassed;
            break;
        case "September":
        case "April":
        case "June":
        case "November":
            while(dayPassed < 1 || dayPassed > 30){
                System.out.println("Please enter 1-30.");
                dayPassed = Integer.parseInt(input.nextLine());
            }
            this.day = dayPassed;
            break;
        case "February":
            boolean leap = ((yearPassed % 4 == 0 && yearPassed % 100 != 0) || (yearPassed % 400 == 0));
            int max;
            if(leap)
                max = 29;
            else
                max = 28;
            while (dayPassed < 1 || dayPassed > max){
                System.out.println("Please enter 1 - "+ max+ ".");
                dayPassed = Integer.parseInt(input.nextLine());
            }
            this.day = dayPassed;
            break;
    }
}

    public void setYear(int yearPassed){
    Scanner input = new Scanner(System.in);
    while (yearPassed < 0 || yearPassed > 2023){
        System.out.println("Please enter a valid year: ");
        try {
            int tempYearPassed = Integer.parseInt(input.nextLine());
            if (tempYearPassed >= 0 && tempYearPassed <= 2023){
                yearPassed = tempYearPassed;
            } else {
                System.out.println("Enter an integer larger than 0 and less than or equal to 2023");
            }
        } catch (Exception e){
            System.out.println("Please enter a valid year");
        }
    }
    this.year = yearPassed;
}
    @Override
    public String toString() {
        String displayName = (this.name == null || this.name.trim().isEmpty()) ? "Unknown" : this.name;
        String formattedTime = String.format("%02d:%02d", this.hour, this.minute);
        return "Appointment Details:\n\n" +
                "Name: " + displayName + "\n" +
                "Date: " + this.month + " " + this.day + ", " + this.year + "\n" +
                "Time: " + formattedTime + "\n\n";
    }
    public boolean equals(Appointment appointmentPassed) {
        if (appointmentPassed == null) {
            return false;
        }
        boolean isDayEqual = this.day == appointmentPassed.day;
        boolean isYearEqual = this.year == appointmentPassed.year;
        boolean isHourEqual = this.hour == appointmentPassed.hour;
        boolean isMinuteEqual = this.minute == appointmentPassed.minute;
        boolean isMonthEqual = this.month.equalsIgnoreCase(appointmentPassed.month);
        return isDayEqual && isYearEqual && isHourEqual && isMinuteEqual && isMonthEqual;
    }
}
