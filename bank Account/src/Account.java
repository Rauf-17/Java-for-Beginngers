import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	
	public void setaccountNumber(int an){
		   accountNumber = an;
	}
	public int getaccountNumber(){
		return accountNumber;
	}
	public void setaccountHolderName(String ahn){
		   accountHolderName = ahn;
	}
	public String getaccountHolderName(){
		return accountHolderName;
	}
	public void setbalance(double b){
		   balance = b;
	}
	public double getbalance(){
		return balance;
	}

	void showDetails() {
        System.out.println("Account Number : "+getaccountNumber());
        System.out.println("Account Holder Name : "+getaccountHolderName());
        System.out.println("Balance : "+getbalance());
    }


    public static void main(String [] args) {
        Account ac = new Account();

        ac.setaccountNumber(4536457);
        ac.setaccountHolderName("Raufull Islam Rauf");
        ac.setbalance(0.00);

        ac.showDetails();
    }

} 
