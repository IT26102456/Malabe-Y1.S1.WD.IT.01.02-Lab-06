import java.util.Scanner;
public class IT26102456Lab6Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number = input.nextDouble();
		
		double square = number + number;
		
		if(number < 0){
			System.out.println("\nThe square of " + number + " is:" + square);
			System.out.println("square root of a negative number is not defined");
		} else {
			double squareRoot = Math.sqrt(number);
			System.out.println("\nThe square of " + number + " is:" + square);
			System.out.println("The square root of " + number + " is:" + squareRoot);
		}
		input.close();
	}
}