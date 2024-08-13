package inheritence;

public class Customer {
	int p=10;
	int t=20;
	int r=30;

}
class SIcalculator extends Customer{
	public void SI(){
		System.out.println((p*r*t)/100);
		}
}
