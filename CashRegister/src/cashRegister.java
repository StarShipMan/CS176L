
public class cashRegister {
	
	double purchase = 0;
	double payment = 0;
	double change = 0;
	
	public cashRegister () {
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

}
