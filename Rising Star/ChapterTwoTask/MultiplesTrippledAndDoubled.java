import java.util.Scanner;

public class MultiplesTrippledAndDoubled{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Please enter firstInput");

int firstInteger = scanner.nextInt();

System.out.println("Please enter secondInput");

int secondInteger = scanner.nextInt();

int sumOfFirstIntegerTripled = firstInteger * firstInteger * firstInteger;

int sumOfSecondIntegerDoubled =  secondInteger * secondInteger;

if(sumOfFirstIntegerTripled % sumOfSecondIntegerDoubled == 0){
System.out.printf("%d is a multiple of %d", sumOfFirstIntegerTripled, sumOfSecondIntegerDoubled);
}

if(sumOfFirstIntegerTripled % sumOfSecondIntegerDoubled != 0){
System.out.printf("%d is not a  multiple of %d", sumOfFirstIntegerTripled, sumOfSecondIntegerDoubled);
}
}



}