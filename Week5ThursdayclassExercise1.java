package demo5;
import java.util.*;
public class Week5ThursdayclassExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double amt;
int dol,twent,tens,fives,ones;
Scanner input=new Scanner(System.in);
		System.out.println("enter an amount:");
		amt=input.nextDouble();
		dol=(int)amt;
		//System.out.println("Number of dollar bills:" + dol);
		//amt=amt-dol;
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
	}

}
