import java.util.Scanner;
public class IT26102456Lab6Q3{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		double sumSquare = 0;
		int count = 0;
		
		System.out.println("Enter positive integers (terminate input with -99)");
		
		while(true){
			System.out.print("Enter a number:");
			int num = input.nextInt();
			
			if(num == -99){
				break;
			}
			if(num < 0){
				System.out.println("Invalid input. please enter a positive integers or -99 to terminate");
				continue;
			}
			sumSquare = sumSquare + (num * num);
			count++;
		}
		
		if(count > 0){
			double rms = Math.sqrt(sumSquare/ count);
			System.out.println("\nThe Root mean square (RMS) is:" + rms);
		}else {
			System.out.println("\nNo numbers enterd.");
		}
		input.close();
	}
}