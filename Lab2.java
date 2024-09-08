package demo4;
import java.util.*;
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,sum,difference,product,quotient,remainder;
Scanner input=new Scanner(System.in);
System.out.println("enter a:");
a=input.nextInt();
System.out.println("enter b:");
b=input.nextInt();
sum= a+b;
System.out.println("sum is:" +sum);
difference=a-b;
System.out.println("difference is:" +difference);
product= a*b;
System.out.println("product is:" +product);
quotient=a/b;
System.out.println("quotient is:" +quotient);
remainder=a%b;
System.out.println("remainder is:" +remainder);




	}

}
