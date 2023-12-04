import java.util.Scanner;

public class LargestAndSmallestIntegers{

  public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("enter first integer");
int firstInteger = scanner.nextInt();

System.out.println("enter second integer");
int secondInteger = scanner.nextInt();

System.out.println("enter third integer");
int thirdInteger = scanner.nextInt();

System.out.println("enter fourth integer");
int fourthInteger = scanner.nextInt();

System.out.println("enter fifth integer");
int fifthInteger = scanner.nextInt();

if(firstInteger > secondInteger && firstInteger > thirdInteger && firstInteger > fourthInteger && firstInteger > fifthInteger){
System.out.println("firstInteger is the Highest");
}

if(secondInteger > firstInteger && secondInteger > thirdInteger && secondInteger > fourthInteger && secondInteger > fifthInteger)
System.out.println("secondInteger is the Highest");


if(thirdInteger > firstInteger && thirdInteger > secondInteger && thirdInteger > fourthInteger && thirdInteger > fifthInteger)
System.out.println("fourthInteger is the Highest");


if(fourthInteger > firstInteger && fourthInteger > secondInteger && fourthInteger > thirdInteger  && fourthInteger > fifthInteger)
System.out.println("fourthInteger is the Highest");

if(fifthInteger > firstInteger && fifthInteger  > secondInteger && fifthInteger > thirdInteger  && fifthInteger > firstInteger)
System.out.println("fifthInteger is the Highest");

if(firstInteger < secondInteger && firstInteger < thirdInteger && firstInteger < fourthInteger && firstInteger < fifthInteger)
System.out.println("firstInteger is the Lowest");


if(secondInteger < firstInteger && secondInteger < thirdInteger && secondInteger < fourthInteger && secondInteger < fifthInteger)
System.out.println("secondInteger is the Lowest");


if(thirdInteger > firstInteger && thirdInteger < secondInteger && thirdInteger < fourthInteger && thirdInteger < fifthInteger)
System.out.println("fourthInteger is the Lowest");


if(fourthInteger > firstInteger && fourthInteger < secondInteger && fourthInteger < thirdInteger  && fourthInteger < fifthInteger){
System.out.println("fourthInteger is the Lowest");


if(fifthInteger > firstInteger && fifthInteger   < secondInteger && fifthInteger < thirdInteger  && fifthInteger < firstInteger)
System.out.println("fifthInteger is the Lowest");

}
}
}