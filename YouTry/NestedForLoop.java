import java.util.Scanner;
public class NestedForLoop{
public static void main(String[] args){

//nested for loop = a loop inside a loop
Scanner scanner = new Scanner(System.in);
int rows;
int columns;
String symbol = " ";

System.out.println("Enter number of rows:");
rows = scanner.nextInt();
System.out.println("Enter number of columns:");
columns = scanner.nextInt();
symbol = scanner.next();

for(int i = 1; i<=rows; i++){
	System.out.println();
	for(int j=1; j<=columns; j++){
	System.out.println(symbol);

}
}




}

}