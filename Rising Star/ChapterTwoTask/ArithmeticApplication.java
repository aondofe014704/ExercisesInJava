import java.util.Scanner;

public class ArithmeticApplication{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("please enter first integer");

int integer1 = scanner.nextInt();

System.out.println("please enter second integer");

int integer2 = scanner.nextInt();

int sumOfSquare1 = integer1 * integer1;
System.out.println(sumOfSquare1);

int sumOfSquare2 = integer2 * integer2;
System.out.println(sumOfSquare2);


int diffOfSquares = sumOfSquare1 - sumOfSquare2;
System.out.print(diffOfSquares);

}



}