import java.util.Scanner;
import java.SecureRandom;

public class NumberGenerator{

public static void main(String[] args){
SecureRandom random = new SecureRandom();

int pickNumber = random.nextInt(1, 11);

System.out.println("Enter your guess");
int theNumber = input.nextInt();
if(pickNumber < theNumber){
System.out.println("picknumber is = 4");
System.out.print("you guess is = 1");
}else if(picknumber == theNumber ){
System.out.println("correct:picknumber = 4, your guess = 4");
}
else if(picknumber > theNumber){
System.out.print("Too High: picknumber:4 your guess is :10");
}
}


}