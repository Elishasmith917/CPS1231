package demo6;
import java.util.*;
public class Week6ThursdayclassExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A,B,C,smallest,middle,largest;
Scanner input = new Scanner (System.in);
System.out.println(" enter a value for A");
A=input.nextInt();
System.out.println(" enter a value for B");
B=input.nextInt();
System.out.println(" enter a value for C");
C=input.nextInt();

//initialize with default values
smallest = middle = largest=0;

if (A>B && A>C) largest = A;
else if (A<B&& A<C)smallest= A;
else middle=A; 
if (B>A && B>C) largest = B;
else if (B<A&& B<C)smallest= B;
else middle=B; 
if (C>A && C>B) largest = C;
else if (C<A&& C<B)smallest= C;
else middle=C; 

System.out.println("smallest is:"+ smallest );
System.out.println("middle is:"+ middle );
System.out.println("largest is:"+ largest );
	}

}

// write a program that will ask the user to enter 3 unique integer values and will find and print the smallest,the middle, and the largest
