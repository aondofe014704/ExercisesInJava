
import java.util.Scanner;

public class Arithmetic101{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a First Integer");

int firstInteger = scanner.nextInt();

System.out.println("Enter a Second Integer");

int secondInteger = scanner.nextInt();

int squareSumOne = firstInteger * firstInteger;

System.out.println(squareSumOne);

int squareSumTwo = secondInteger * secondInteger;

System.out.println(squareSumTwo);

int totalSumOfSquares = squareSumOne + squareSumTwo;

System.out.println(totalSumOfSquares);

int diffOfSquares = squareSumOne - squareSumTwo;

System.out.println(diffOfSquares);







}


}