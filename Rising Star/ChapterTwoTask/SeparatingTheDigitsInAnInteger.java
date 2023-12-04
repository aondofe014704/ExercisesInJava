import java.util.Scanner;
public class SeparatingTheDigitsInAnInteger{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a five digits number");

int firstNumber = scanner.nextInt();

int firstDigit = firstNumber % 10;
int firstRemainder = firstNumber / 10;

int secondDigit = firstRemainder % 10;
int secondRemainder = firstRemainder / 10;

int thirdDigit = secondRemainder % 10;
int thirdRemainder = secondRemainder / 10;

int fourthDigit = thirdRemainder % 10;
int fourthRemainder = thirdRemainder / 10;

System.out.printf("%d %d %d %d %d", fourthRemainder, fourthDigit, thirdDigit, secondDigit, firstDigit);

}



}