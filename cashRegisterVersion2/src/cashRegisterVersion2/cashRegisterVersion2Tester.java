package cashRegisterVersion2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class cashRegisterVersion2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cashRegisterVersion2 customer = new cashRegisterVersion2();
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
		
		customer.calcDiscount();
		
		System.out.print("Enter payment: ");
		input = in.nextDouble();
		customer.recievePayment(input);
		input = customer.giveChange();
		System.out.println("Your change is:     " + df.format(input));
		
	}//main

}//class
