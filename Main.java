import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your dollar ammount: ");
		double dollars = input.nextDouble();
		
		System.out.println("\nYou have:");
		System.out.println("- hundred(s):" + (int)dollars/100);
		dollars%=100;
		System.out.println("- fifty(s):" + (int)dollars/50);
		dollars%=50;
		System.out.println("- twenty(s):" + (int) dollars/20);
		dollars%=20;
		System.out.println("- ten(s): " + (int)dollars/10);
		dollars%=10;
		System.out.println("- five(s): "  + (int)dollars/5);
		dollars%=5;
		System.out.println("- one(s): " + (int)dollars/1);
		dollars%=1;
		System.out.println("- quarter(s): " + (int) (dollars/0.25));
		dollars%=0.25;
		System.out.println("- dime(s): " + (int)(dollars/0.1));
		dollars%=0.1;
		System.out.println("- nickels(s): " + (int)(dollars/0.05));
		dollars%=0.05;
		System.out.println("- cent(s): " + (int)(dollars/0.01));
		System.out.println("\nGoodbye!");
	}

}