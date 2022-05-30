package MiddleClass;

public class OverdraftException extends Exception{
	double deficit;
	
	public OverdraftException(String msg, double deficit) {
		super(msg);
		this.deficit = deficit;
	}
	
	double getDeficit() {
		return this.deficit;
	}

}
