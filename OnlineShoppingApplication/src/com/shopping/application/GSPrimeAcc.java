package com.shopping.application;

import com.framework.shopping.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	private static final float charges=10;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges, isprime);
		
	}
	
	public void bookProduct (float charges) {
    	System.out.println("Dear Primes Uses your charges"+ charges);
    }

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
