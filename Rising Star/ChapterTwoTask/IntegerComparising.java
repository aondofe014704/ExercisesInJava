import java.util.Scanner;

public class IntegerComparising{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("please input an integer");

int integerOne = scanner.nextInt();

int squareOfIntegerOne = integerOne * integerOne;

System.out.println(squareOfIntegerOne);

if(integerOne ==100 && squareOfIntegerOne == 100){
System.out.println("number and its square are equal to 100");
}

if(integerOne != 100 && squareOfIntegerOne != 100){
System.out.println("number and its square are not equal to 100");
}

if(integerOne > 100 && squareOfIntegerOne > 100){
System.out.println("number and its square are greater than 100");
}

if(integerOne <100 && squareOfIntegerOne < 100){
System.out.println("number and its square are less than 100");
}

}

}