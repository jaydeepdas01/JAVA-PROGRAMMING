import java.util.Scanner;

public class LeapYearChecker{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if ( (year%4 == 0 && year % 100 != 0) || (year%400==0 ) ) {
 
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " not a leap year");
        }
    }
}

/*
 * Leap Year Check Explanation:
 *
 * 1. A year is a leap year if it is divisible by 4,
 *    because Earth takes approximately 365.25 days to orbit the Sun.
 *
 * 2. However, years that are divisible by 100 are NOT leap years,
 *    because this corrects the overcounting of leap years every century.
 *
 * 3. Exception: If a year is divisible by 400, it IS a leap year,
 *    because this fine-tunes the calendar to stay in sync with Earth's orbit.
 *
 * Therefore, the condition:
 * (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
 * means:
 * - Year divisible by 4 but NOT by 100 → leap year (e.g., 2024)
 * - OR year divisible by 400 → leap year (e.g., 2000)
 * - Otherwise, NOT a leap year (e.g., 1900)
 */
