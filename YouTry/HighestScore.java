import java.util.Scanner;
public class HighestScore{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int count = 1;
int highestNumber = 0;
String highestScorer = " ";

System.out.println("please Enter number of students");
int numberOfStudents = scanner.nextInt();

while (count <= numberOfStudents){
System.out.print("Enter Students name and Score");
String name = scanner.next();
int score = scanner.nextInt(); 
if(score > highestNumber){
highestNumber = score;
highestScorer = name;
count++;
}

}
System.out.printf("The student with the highest score is %s with score %d", highestScorer, highestNumber);
}
}