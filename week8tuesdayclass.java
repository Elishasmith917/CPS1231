package demo8;
import java.util.*;
public class week8tuesdayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int sum,num;
sum=0;
System.out.println("enter a value (-999 to quit): ");
num= input.nextInt();
while (num != -999) {
	sum= sum+num;
	System.out.println("enter another value(-999 to quit): ");
	num=input.nextInt();
}
System.out.println("sum is: " + sum);
	}

}
