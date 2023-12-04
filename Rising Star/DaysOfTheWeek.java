import java.util.Scanner;

public class DaysOfTheWeek{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter year of the century");

int yearOfTheYear = scanner.nextInt();

System.out.println("Enter month of the year");

int monthOfYear = scanner.nextInt();

System.out.println("Enter the day of the month");

int dayOfTheMonth = scanner.nextInt();


int century = yearOfTheYear / 100;

int yearOfTheCenturyYear = yearOfTheYear % 100;

int cascadeMonth = 26 * monthOfYear + 1 / 10;

int cascadeYear = yearOfTheYear / 4;

int cascadeYearly = yearOfTheYear; 





}

}
