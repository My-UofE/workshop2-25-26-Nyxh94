// MyBirthday application
public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = Integer.parseInt(args[0]); 
        int currentDate = 7; 
        int myBirthdayDate = 23; 

        // value below is a constant
        final int DAYS_A_WEEK = 7; 

        //days away from birthday:
        int daysAway = myBirthdayDate - currentDate;

        int bdayWeekday = (currentDay + daysAway) % 7;
        
        System.out.println("Birthday falls on: " + bdayWeekday);
    }
}