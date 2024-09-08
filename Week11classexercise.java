package demo11;

public class Week11classexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		print12stars();
		for(i=1;i<=5;i++) {
			printstar10spcstar();
		}
		print12stars();
	}

	public static void print12stars() {
		int i;
		for (i=1; i<=12; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printstar10spcstar() {
		int i;
		System.out.print("*");
		for (i=1; i<=10; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
}