package org.Bank;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit()
	{
		System.out.println("300");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank a = new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();

	}

}
