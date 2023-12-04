public class HumanTest{

public static void main( String [] args){

Human chichi = new Human();

chichi.setName("Expert Jack ");
chichi.setHeight(170);
chichi.setAge(15);
chichi.setFair(); 

System.out.println("Your name is:  "+ chichi.getName());
System.out.println("Your Height is: "+ chichi.getHeight());
System.out.println("Your Age is: " + chichi.getAge());
System.out.println(chichi.getName() + "isFair: " + chichi.getFair());

}



}