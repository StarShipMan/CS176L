package cashRegisterVersion2;
import java.text.DecimalFormat;

public class cashRegisterVersion2 {
	DecimalFormat df = new DecimalFormat("0.00");
	DecimalFormat nf = new DecimalFormat("0");
	double purchase = 0;
	double payment = 0;
	double change = 0;
	final double DISCOUNT = .10;
	final double MINIMUM_PURCHASE = 50;
	
	public cashRegisterVersion2 () {
		purchase = 0;
		payment = 0;
	}//cashRegister
	
	public void recordPurchase(double inPurchase) {
		purchase = purchase + inPurchase;
	}//recordPurchase
	
	public void recievePayment(double inPayment) {
		payment = inPayment;
	}//recievePayment
	
	public double giveChange() {
		change = payment -purchase;
		return change;
	}//giveChange
	public void calcDiscount() {
		if (purchase > MINIMUM_PURCHASE) {
			double discount = purchase * DISCOUNT;
			double discountedBalance = purchase-discount;
			System.out.println("Your total purchases were $" + df.format(purchase) + " and because you spent over $" + nf.format(MINIMUM_PURCHASE) + ", you are entitled to a " + nf.format(DISCOUNT*100) + "% discount of $" + df.format(discount) + " reducing your balance to $" +df.format(discountedBalance));
			purchase = discountedBalance;
		}//if
	}
}