import java.util.Scanner;

public class Game{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name ");
String name1 = scanner.nextLine();

System.out.println("Enter your name ");

String name2 = scanner.nextLine();

System.out.printf("%s pick a number from 0 - 2", name1);
int player0 = scanner.nextInt();

System.out.printf("%s pick a number from 0 - 2", name2);
int player1 = scanner.nextInt();

if(player0 == 0 && player1 == 0){
System.out.printf("Draw");
}
if(player0 == 1 && player1 == 1){
System.out.println("Draw");
}
if(player0 == 2 && player1 == 2){
System.out.println("Draw");
}
if(player0 == 0 && player1 == 1){
System.out.printf("%s won %s", name2, name1 );
}
if(player0 == 0 && player1 == 2){
System.out.printf("%s won %s", name2, name1 );
}
if(player0 == 1 && player1 == 0){
System.out.printf("%s won %s", name1, name2 );
}
if(player0 == 1 && player1 == 2){
System.out.printf("%s won %s", name2, name1 );
}
if(player0 == 2 && player1 == 0){
System.out.printf("%s won %s", name2, name1 );
}
if(player0 == 0 && player1 == 1){
System.out.printf("%s won %s", name1, name2 );
}








}

}