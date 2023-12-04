public class Account{

private String name;
private int withdraw;

public Account(String name, int withdraw){

this.name = name;

if (withdraw < 0.0 ){
this.name = name;
}

}

public void withdraw(int withdraw){
if(withdraw < 0.0){
balance = balance - withdraw;

}

public int setWithdraw(int withdraw){
this.withdraw = withdraw;
}
public String setName(String name){
}
}