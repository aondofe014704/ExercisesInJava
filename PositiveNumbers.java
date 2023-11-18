import java.util.Scanner;

public class PositiveNumbers{
public static void main(String[] args){

int positiveNumCount = 0;
int negativeNumCount = 0;
int zeroCount= 0;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number or ctrl z to stop");

while(scanner.hasNext()){
System.out.println("Enter number or ctrl z to stop");
int userInput = scanner.nextInt();
if(userInput < 0){
negativeNumCount++;
}else if(userInput > 0){
positiveNumCount++;
}else{
zeroCount++;
}
}
 
System.out.println("The total number of negative numbers is: " + negativeNumCount);
System.out.println("The total number of positive numbers is: " + positiveNumCount);
System.out.println("The total number of Zeros entered is: " + zeroCount);

}






}