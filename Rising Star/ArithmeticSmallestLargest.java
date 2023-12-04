import java.util.Scanner;

public class ArithmeticSmallestLargest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("please enter an input");
int inputOne = scanner.nextInt();
 
System.out.println("please enter an input");
int inputtwo = scanner.nextInt();

System.out.println("please enter an input");
int inputthree = scanner.nextInt();


int sumOfAllInPuts = inputOne + inputtwo + inputthree;
System.out.printf("sum Of All InPuts is %d " ,sumOfAllInPuts);

int sumAverage = inputOne + inputtwo + inputthree / 3;
System.out.printf("sum of Average sumAverage is %d" ,sumAverage);

int product = inputOne * inputtwo * inputthree;
System.out.printf("product is  %d" ,product);

if(inputOne > inputtwo && inputOne > inputthree){
System.out.printf("numberOne is the Highest %d " ,numberOne);
}
if(inputtwo > inputOne && inputtwo >  inputthree){
System.out.printf("inputtwo is the Highest" +inputtwo);
}
if(inputthree > inputtwo && inputthree > inputOne){
System.out.printf("numberthree is the Highest %d" +numberthree);
}
if(inputOne < inputtwo && inputOne < inputthree){
System.out.printf("numberOne is the Lowest" +numberOne);
}
if(inputtwo < inputOne && inputtwo <  inputthree){
System.out.print("inputtwo is the Lowest %d" +inputtwo);
}
if(inputthree < inputtwo && inputthree < inputOne){
System.out.println("numberthree is the Lowest %d" +numberthree);
}
}
}