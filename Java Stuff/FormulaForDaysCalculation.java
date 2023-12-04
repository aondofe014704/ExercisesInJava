import java.util.Scanner;

public class FormulaForDaysCalculation{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the year ");
int year = scanner.nextInt();

System.out.println("Enter the month 1 to 12 ");
int month = scanner.nextInt();

System.out.print("Enter the day ");
int daysOfTheWeek = scanner.nextInt();


int century = year/ 100;

int yearOfTheCentury = year %100;


 26*(month + 1)/10 + yearOfTheCentury + 

(yearOfTheCentury/4) + (century / 4) + (5 * century) ) % 7;

if(daysOfTheWeek == 0 ) System.out.print("The day of the week is Saturday");
if(daysOfTheWeek == 1 ) System.out.print("The day of the week is Sunday");
if(daysOfTheWeek == 2 ) System.out.print("The day of the week is monday");
if(daysOfTheWeek == 3 ) System.out.print("The day of the week is tuesday");
if(daysOfTheWeek == 4 ) System.out.print("The day of the week is wednesday");
if(daysOfTheWeek == 5 ) System.out.print("The day of the week is thursday");
if(daysOfTheWeek == 6) System.out.print("The day of the week is friday");
 
}
}