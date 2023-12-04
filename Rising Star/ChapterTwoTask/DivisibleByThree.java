import java.util.Scanner;

public class DivisibleByThree{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("please input an integer");

int integerInput = scanner.nextInt();

if(integerInput % 3 == 0){
System.out.println("The integer is Divisible by 3");
}
if(integerInput % 3 != 0){
System.out.println("The integer is not Divisible by 3");

}

}
}


