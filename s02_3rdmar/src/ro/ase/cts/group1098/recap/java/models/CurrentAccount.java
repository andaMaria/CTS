package ro.ase.cts.group1098.recap.java.models;

public class CurrentAccount extends BankAccount{
	
	public static final double MAX_CREDIT = 10000;

	public CurrentAccount(String iban) {
		super(iban);
		// TODO Auto-generated constructor stub
		this.balance=CurrentAccount.MAX_CREDIT;
	}

	
	
}
