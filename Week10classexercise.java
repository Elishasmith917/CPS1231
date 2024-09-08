package demo10;
import java.util.*;
public class Week10classexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int avg;	
	int Exam1[]= new int[2];
	int Exam2[]= new int [2];
	int Exam3[]= new int[2];
	int average[]= new int[2];
	
	int i,j;
	
	
	Scanner input= new Scanner (System.in);

	for (i=0; i <=1;i++) {
	// after each iteration add 1 	
		System.out.println("Enter test 1 grade: ");
		Exam1[i] = input.nextInt();
		System.out.println("Enter test 2 grade: ");
		Exam2[i] = input.nextInt();
		System.out.println("Enter test 3 grade:");
		Exam3[i] = input.nextInt();
		average[i]= (Exam1[i]+Exam2[i]+Exam3[i])/3;
	}
		
//	for (i=0; i<=1; i++) {
//		System.out.println("average for student");
//		average[i]= (int) avg;
//	}
//	//PRINT GRADE TABLE NOW
System.out.println("Student  Exam 1  Exam 2  Exam 3  average" );
//	//System.out.printf ("%-30s %1.7f %s%n", word, etc, etc2);
//
//could be i still, but changed to j to get it on the same line add the +
	for (j = 0; j <=1; j++) {
	System.out.println("" + (j+1) + "         " + Exam1[j] + "      " + Exam2[j] + "      "+ Exam3[j] + "      "+ average[j]);
//		//System.out.printf("%-16d%-8d%-10d%n", j+1, Exam1[j], Exam2[j]);
	}
	input.close();

}
}
