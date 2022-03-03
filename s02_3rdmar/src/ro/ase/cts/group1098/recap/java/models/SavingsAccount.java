package ro.ase.cts.group1098.recap.java.models;

import ro.ase.cts.group1098.recap.java.exceptions.IllegalTransferException;
import ro.ase.cts.group1098.recap.java.exceptions.InsufficientFundsException;

public class SavingsAccount extends BankAccount implements Profitable{
	public static final double MIN_BALANCE = 100;

	public SavingsAccount(String iban) throws IllegalTransferException {
		super(iban);
		// TODO Auto-generated constructor stub
		this.deposit(SavingsAccount.MIN_BALANCE);
	}

	@Override
	public void withdraw(double amount) throws IllegalTransferException, InsufficientFundsException {
		if(amount>this.balance-SavingsAccount.MIN_BALANCE)
			throw new InsufficientFundsException();
		// TODO Auto-generated method stub
		super.withdraw(amount);
	}

	@Override
	public void addInterest(double interestPercentage) {
		// TODO Auto-generated method stub
		
	}
	
	

} 
