import java.util.Scanner;
public class PerimeterOfTriangle{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter first side triangle");

int adjacent =  scanner.nextInt();

System.out.println("Enter the second triangle");

int opposite = scanner.nextInt();

System.out.println("Enter the third triangle");

int hypothenus = scanner.nextInt();

int squareAdjacent = adjacent * adjacent;

int squareOpposite = opposite * opposite;

int squareHypothenus = hypothenus * hypothenus;

int edgeOfThePerimeter = squareAdjacent + squareOpposite;

int perimeter = opposite + adjacent + hypothenus;

if(edgeOfThePerimeter > squareHypothenus);

System.out.printf("P = %d", perimeter);

if(edgeOfThePerimeter <= squareHypothenus);

System.out.println("INVALID INPUT");



}



}