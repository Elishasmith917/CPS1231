package demo6;
import java.util.*;

public class Week6Thursdayclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score;
char grade;
Scanner input = new Scanner(System.in);
System.out.print("enter a score:");
score=input.nextInt();
if(score>=90) grade='A';
else if (score>=80) grade='B';
else if (score>=70) grade='C';
else if (score>=60) grade='D';
else grade ='F';
System.out.println("grade is:" + grade);

	}

}
