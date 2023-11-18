import java.util.Scanner;

public class smallestAndLargest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter 1st int");

int firstInt = scanner.nextInt();

System.out.println("Enter 2nd int");

int secondInt = scanner.nextInt();

System.out.println("Enter 3rd int");

int thirdInt = scanner.nextInt();

int sumInt = firstInt + secondInt + thirdInt;

if(firstInt > secondInt && firstInt > thirdInt){
System.out.printf("%d %s %n", firstInt, "is the highest");
}
if(secondInt > firstInt && secondInt > thirdInt){
System.out.printf("%d %s %n", secondInt, "is the highest");
}
if(thirdInt > secondInt && thirdInt > firstInt ){
System.out.printf("%d %s %n",thirdInt, "is the highest");
}

if(firstInt < secondInt && firstInt < thirdInt){
System.out.printf("%d %s %n", firstInt, "is the lowest");
}
if(secondInt < firstInt && secondInt < thirdInt){
System.out.printf("%d %s %n", secondInt, "is the lowest");
}
if(thirdInt < secondInt && thirdInt < firstInt ){
System.out.printf("%d %s %n",thirdInt, "is the lowest");
}

System.out.println(sumInt);


int Average = firstInt + secondInt + thirdInt / 3;

System.out.println(Average);

int Product = firstInt * secondInt * thirdInt;

System.out.println(Product);

 











}

}