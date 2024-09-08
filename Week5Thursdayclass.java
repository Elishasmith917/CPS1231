package demo5;
import java.util.*;
public class Week5Thursdayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double amt;
int dol,twent,tens,fives,ones,qua,dimes,nic,pen;
Scanner input=new Scanner(System.in);
System.out.println("enter an amount:");
amt=input.nextDouble();
dol=(int)amt;
System.out.println("Number of dollar bills:" + dol);
amt=amt-dol;
qua=(int)(amt/0.25);
amt=amt-qua*0.25;
System.out.println("number of quarters:" + qua);
dimes=(int)(amt/0.10);
amt=amt-dimes*0.10;
System.out.println("Number of dimes:" + dimes);
nic=(int)(amt/0.05);
amt=amt-nic*0.05;
System.out.println("Number of Nickel:" + nic);
pen=(int)(amt/0.01);
amt=amt-pen*0.01;
System.out.println("Number of pennies:" + pen);
twent=(int)(amt/20);
amt=amt-twent*20;
System.out.println("Number of $20 Bills:" + twent);
tens=(int)(amt/10);
amt=amt-tens*10;
System.out.println("Number of $10 Bills" + tens);
fives=(int)(amt/5);
amt=amt-fives*5;
System.out.println("Number of $5 Bills:" + fives);
ones=(int)(amt/1);
amt=amt-ones*1;
System.out.println("Number of $1 Bills:" + ones);
//1)write a program that will ask the user to enter amount (includes dollars and cents) and find and print how many dollar bills in this amount. 
//2)Find and print also the number of quarters, dimes, nickels, and pennies as well in the most efficient manners
//3)Figure out number of 20 dollar bills, 10 dollar bills, 5 dollar bills and 1 dollar bills



	}

}
