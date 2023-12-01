import java.util.Scanner;

public class MultiplicationTable{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter an input from 1 - 12");

int userInput = scanner.nextInt();
int count = 1;
while(userInput <=1){
	int result = userInput * count;
	System.out.printf("%d * %d = %d%n", userInput, count, result);
	count = count +1;

}

}

}