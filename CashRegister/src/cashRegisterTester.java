import java.text.DecimalFormat;
import java.util.Scanner;

public class cashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cashRegister customer = new cashRegister();
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		final int SENTINEL = -1;
		boolean isPurchasing = true;
		double input = 1;
		
		while (isPurchasing == true) {
			System.out.print("Enter a purchase amount, or -1 to stop: ");
			input = in.nextDouble();
			if (input == SENTINEL)
				isPurchasing = false;
			else
				customer.recordPurchase(input);
		}//while
		System.out.print("Enter payment: ");
		input = in.nextDouble();
		customer.recievePayment(input);
		input = customer.giveChange();
		System.out.println("Your change is:     " + df.format(input));
		
	}//main

}//class
