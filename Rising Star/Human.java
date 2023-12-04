public class Human{

private String name;

private int age;

private int height;

private boolean isFair;

public void setName(String name){

this.name = name;
}
public String getName(){
return name;
}

public void setAge( int age){
this.age = age;
}

public void setHeight(int height){
this.height = height;
}

public void setFair(){
isFair = false;
}

public boolean getFair(){
return isFair;
}

public int getHeight(){
return height;
}
public int getAge(){
return age;
}

}