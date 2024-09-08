package demo7;
import java.util.*;
public class week7lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double income, totsales,commission;
Scanner input= new Scanner(System.in);

System.out.println("Total Sales                          Commission Rate %");
System.out.println("Less than 200 sold                   8%");
System.out.println("Greater than or equal to 200 sold    10%");
System.out.println("Greater than or equal to 400 sold    12%");
System.out.println();
System.out.print("Enter total sales: ");
totsales=input.nextDouble();

double commissionrate=0;
if (totsales<200) {
	commissionrate=0.08;
}
else if (totsales>=200 && totsales<400) {
	commissionrate=0.1;
}
else if (totsales>=400) {
	commissionrate=.12;
}
commission=totsales*commissionrate;
income = totsales + commission;

System.out.print("Salesman's total sales is "+ totsales); System.out.println(" and commission is " + commission);
System.out.println("Saleman's income is $"+income);
	}
}



