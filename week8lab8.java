package demo8;
import java.util.*;

public class week8lab8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer, number;

        System.out.println("Enter integer number:");
        integer = input.nextInt();

        while (integer > 0) {
            number = integer / 10;
            System.out.println(+ number);           
            integer = number;
        }
    }
}