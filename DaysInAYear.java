import java.util.Scanner;

public class DaysInAYear{
public static void main(String[] arg){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter month");

int month = scanner.nextInt();

System.out.println("Enter Year");

int year = scanner.nextInt();

if(month == 2){
	if(year %4 == 0){
	System.out.println("February" + year + " is 29 days because it is a leap year");
	}else{
	System.out.println("February " + year + " is 28 days");
	}
}if(month == 1){
System.out.println("January" + year + "has 31 days");
}
if(month == 3){
System.out.println("March" + year + "has 31 days");
}
if(month == 4){
System.out.println("April" + year + "has 31 days");
}
if(month == 5){
System.out.println("May" + year + "has 31 days");
}
if(month == 6){
System.out.println("June" + year + "has 31 days");
}
if(month == 7){
System.out.println("July" + year + "has 31 days");
}
if(month == 8){
System.out.println("August" + year + "has 31 days");
}
if(month == 9){
System.out.println("September" + year + "has 31 days");
}
if(month == 10){
System.out.println("October" + year + "has 31 days");
}
if(month == 11){
System.out.println("November" + year + "has 31 days");
}
if(month == 12){
System.out.println("December" + year + "has 31 days");
}









}
}