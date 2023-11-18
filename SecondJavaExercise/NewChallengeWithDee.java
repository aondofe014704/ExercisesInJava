import java.util.Scanner;

public class NewChallengeWithDee{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("please enter your first name");

String firstName = scanner.nextLine();

System.out.println("please enter your second name");

String secondName = scanner.nextLine();

System.out.println("please enter your age");

int age = scanner.nextInt();

System.out.println("please enter your state");

String yourState = scanner.nextLine();

System.out.println("please enter your number of kids");

int numberOfKids = scanner.nextInt();

System.out.printf("My first name is %s%n", firstName);

System.out.printf("My second name is %s%n", secondName);

System.out.printf("I am %d%n", age);

System.out.printf("I am from %s%n", yourState);

System.out.printf("I have %s%n", numberOfKids);


}



}