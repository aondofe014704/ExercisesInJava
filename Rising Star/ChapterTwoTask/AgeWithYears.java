import java.util.Scanner;

public class AgeWithYears{

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your years");

int age = scanner.nextInt();
int useInput = age * 365;
System.out.println(useInput);

}

}