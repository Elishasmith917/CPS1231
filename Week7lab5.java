package demo7;
import java.util.*;
public class Week7lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner (System.in);
int i,n,sum,score,a,b,c,d,f;
double average;
sum= 0;
i=1;
score=0;
a=0;
b=0;
c=0;
d=0;
f=0;
System.out.println(" Enter number of students:");
n= input.nextInt(); 
	while (i<=n) {
		System.out.println("enter a score:");
		score=input.nextInt();
		sum=sum+score;
		i=i+1;
		if(score>=90) {
			a=a+1;
		} else
		if (score>=80&&score<=89) {
			b=b+1;
		} else
		if (score>=70&&score<=79) {
			c=c+1;
	}else 
		if (score>=60&&score<=69) {
			d=d+1;
		} else 
		if (score<60) {
			f=f+1;
		}
	}
	average= (double)sum/n;
	System.out.println("Average is: " +average);
	
	System.out.println("number of scores greater than or equal to 90: " + a);
	System.out.println("number of scores between 80 and 89: " + b);
	System.out.println("number of scores between 70 and 79: " + c);
	System.out.println("number of scores between c0 and 69: " + d);
	System.out.println("number of scores less than 60: " + f);

	

}
	}


