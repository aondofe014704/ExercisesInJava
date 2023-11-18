import java.util.Scanner;
public class DayOfTheWeek{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your Year: example 2010");
int year = scanner.nextInt();

System.out.println("Enter the day of the month: 2 - 12 ");
int day = scanner.nextInt();

int century = year / 100;
int YearOfTheCentury = year % 100;
int solutionOfTheMonth = 26 * (month + 1) / 10;
int solutionOfYearOfCentury = yearOfTheCentury + yearOfTheCentury / 4;
int SolutionOfTheCentury = (century / 4 ) + (5 * century);
int dayOfTheWeek = (dayOfTheMonth + resultOfTheMonth + solutionOfYearOfCentury + solutionOftheCentury) % 7;
if(dayOfTheWeek == 0)
System.out.println("Day of the week is saturday");
if(dayOfTheWeek == 1)
System.out.println("Day of the week is sunday");
if(dayOfTheWeek == 2)
System.out.println("Day of the week is monday");
if(dayOfTheWeek == 3)
System.out.println("Day of the week is tuesday");
if(dayOfTheWeek == 4)
System.out.println("Day of the week is wednesday");
if(dayOfTheWeek == 5)
System.out.println("Day of the week is thursday");
if(dayOfTheWeek == 6)
System.out.println("Day of the week is friday");
System.out.println(dayOfTheWeek);


}



}