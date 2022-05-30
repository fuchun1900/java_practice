package MiddleClass;

public class MiddleCheckingAccount extends MiddleExceptionAccount{
	double OverdraftProtection;
	
	public MiddleCheckingAccount(double balance) {
		super(balance);
	}
	
	public MiddleCheckingAccount(double balance,double protect) {
		super(balance);
		this.OverdraftProtection = protect;
	}
	
	@Override
	protected void withdraw (double awt) throws OverdraftException{
		if (awt > this.OverdraftProtection)
			throw new OverdraftException("超过透支限额", this.OverdraftProtection - awt);
		OverdraftProtection -= awt;
	}

}
