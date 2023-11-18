import java.util.Scanner;
public class largestAndSmallestGroup{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("input five numbers");
int number1 = scanner.nextInt();
int number2 = scanner.nextInt();
int number3 = scanner.nextInt();
int number4 = scanner.nextInt();
int number5 = scanner.nextInt();

if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5 ){
System.out.printf("%d %s %n", number1, "is the Highest in the Group");
}

if(number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5 ){
System.out.printf("%d %s %n", number2, "is the Highest in the Group");
}

if(number3 > number2 && number3 > number1 && number3 > number4 && number3 > number5 ){
System.out.printf("%d %s %n", number3, "is the Highest in the Group");
}

if(number4 > number3 && number4 > number2 && number4 > number1 && number4 > number5 ){
System.out.printf("%d %s %n", number4, "is the Highest in the Group");
}

if(number5 > number4 && number5 > number3 && number5 > number2 && number1 > number1 ){
System.out.printf("%d %s %n", number5, "is the Highest in the Group");
}







}

}