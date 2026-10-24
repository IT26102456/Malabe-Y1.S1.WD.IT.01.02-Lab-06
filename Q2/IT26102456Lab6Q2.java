import java.util.Scanner;
public class IT26102456Lab6Q2{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Part A - numbers 1 to 10:");
		int n = 1;
		while (n <= 10){
			System.out.print(n + " ");
			n++;
		}
		System.out.println("\n");
		
		int[] Number = new int[10];
		int i = 0;
		int sum = 0;
		
		System.out.println("Plese enter 10  numbers:");
		
		while(i < 10){
		System.out.print("Enter number" +(i+1) + " :");
		
        Number[i] = input.nextInt();
        sum = sum + Number[i];
        i ++;		
		}
		System.out.println("\nThe numbers you entered are:");
		i = 0;
		while(i <10){
			System.out.print(Number[i] + " ");
			i++;
		}
		System.out.println("\n");
		System.out.print("Sum of thr numbers:" + sum);
		System.out.print("Avarege of the numbers: " + (double)sum/10);
		
		input.close();
	}
}