package ro.ase.cts.group1098.recap.java.models;

import ro.ase.cts.group1098.recap.java.exceptions.IllegalTransferException;
import ro.ase.cts.group1098.recap.java.exceptions.InsufficientFundsException;

public abstract class BankAccount extends Account{
	
	protected double balance =0; //by default 0
	protected final String iban;
	
	
	//constructor
	public BankAccount(String iban) {
		this.iban=iban;
		
	}
	
	
	
	@Override
	public double getBalance() {
		return this.balance;
		
		
	}



	@Override
	public void deposit(double amount) throws IllegalTransferException{
		// TODO Auto-generated method stub
		if(amount<=0) {
			throw new IllegalTransferException();
		}
		this.balance+=amount;
		
		
	}



	@Override
	public void withdraw(double amount) throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		if(amount <=0)
		{
			throw new IllegalTransferException();
		}
		if(amount>this.balance) {
			throw new InsufficientFundsException();
		}
		this.balance -= amount;
	}



	@Override
	public void transfer(Account destination, double amount) throws IllegalTransferException, InsufficientFundsException {
		
		this.withdraw(amount);
		try {
		// TODO Auto-generated method stub
		destination.deposit(amount);
		}
		catch(Exception e) {
			this.deposit(amount);
		}
		
	}
	
	

}
