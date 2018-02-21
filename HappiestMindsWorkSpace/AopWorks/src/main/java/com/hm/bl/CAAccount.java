package com.hm.bl;

import com.hm.model.Account;

public class CAAccount {
	private Account acc;
	
	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public double showBalance(){
		return acc.getBalance();
	}
}