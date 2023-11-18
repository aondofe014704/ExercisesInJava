import java.util.Scanner;

public class percentageGrade{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your scores");

int scoresAndGrade = scanner.nextInt();

int percentage = 0;

if(percentage >= 90){
System.out.println("Grade A");
}
if(percentage >= 80){
System.out.println("Grade B");
}
if(percentage >= 70){
System.out.println("Grade C");
}
if(percentage >= 60){
System.out.println("Grade D");
}
if(percentage >= 40){
System.out.println("Grade E");
}
if(percentage < 40 ){
System.out.println("Grade F");
}
}
}