public class Multiplication{


public static void main(String[] args){
System.out.print("number\tsquare\tcube\tquadrant\n");

for(int i =1; i<=6; i++){
int square = i*i;
int cube = i*i*i;
int quadrant = i*i*i*i;

System.out.printf(" %d	% d	% d	% d%n", i, square, cube, quadrant);

}

}
}
