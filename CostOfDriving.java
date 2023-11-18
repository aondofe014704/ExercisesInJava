import java.util.Scanner;

public class CostOfDriving{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("input distance");

double distanceToTravel = scanner.nextDouble();

System.out.println("miles gallon");

double  milesPerGallon = scanner.nextDouble();

System.out.println("enter price");

double pricePerGallon = scanner.nextDouble();

double CostOffDriving = distanceToTravel /  milesPerGallon * pricePerGallon;

System.out.println("CostOffDriving: " + CostOffDriving);








}

}