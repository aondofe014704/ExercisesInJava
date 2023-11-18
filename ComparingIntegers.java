import java.util.Scanner;

public class ComparingIntegers{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter userInput");

int integerOne = scanner.nextInt();

int squareOfIntOne = integerOne * integerOne;

System.out.println(squareOfIntOne);

if(squareOfIntOne > 100){
System.out.println("The integer is Greater than 100");
}

if(squareOfIntOne == 100){
System.out.println("The integer is equal to Hundred");
}

if(squareOfIntOne != 100){
System.out.println("The integer is not equal to Hundred");
}

if(squareOfIntOne < 100){
System.out.println("The integer is less than Hundred");
}





}

}