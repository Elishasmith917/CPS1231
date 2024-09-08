package demo8;
import java.util.*;
public class week8tuesdayclassexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int sum, num;
sum=0;
do {
	System.out.println("enter a value(0 to quit):");
	num=input.nextInt();
	sum=sum+num;
} while (num!=0);
System.out.println("sum is: " + sum);
	}

}
