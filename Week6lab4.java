package demo6;
import java.util.*;
public class Week6lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hours,pay, gross,federal,fica,state,total, net;
		Scanner input= new Scanner(System.in);
		
		//prompt for all values you need using scanner 
		System.out.print("Enter the hours worked: ");
        hours = input.nextDouble();
        System.out.print("Enter the pay rate: ");
        pay = input.nextDouble();
		
        //calc pay for the first 40 hrs (total - 40) and // calc pay for overtime using the remainder * 1.5(pay)
        if (hours <= 40) {
            gross = hours * pay;
        } else {
            double regularPay = 40 * pay;
            double overtimePay = (hours - 40) * (pay * 1.5);
            gross = regularPay + overtimePay;
        }	
		System.out.println("GROSS PAY:$"+ gross);
		//calculate gross * percentage!!! tax rates for all taxes
		federal= .20*gross;
		fica= .10*gross;
		state= .05*gross;
		System.out.println("FEDERAL TAXES:$"+ federal);
		System.out.println("FICA TAXES:$"+ fica);
		System.out.println("STATE TAXES:$"+ state);
		// sum taxes 
		total= federal+fica+state;
		System.out.println("Total Taxes paid:$"+ total);

		//subtract from total
		net=gross-total;
		System.out.println("NET PAY:$"+ net);
		
		//display each variable as asked 

		
		// test it with decimals and whole numbers

	}

}
