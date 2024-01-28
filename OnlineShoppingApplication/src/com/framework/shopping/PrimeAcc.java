package com.framework.shopping;

public abstract class PrimeAcc extends ShopAcc {
	
	private boolean isPrime;
	private static final float deliveryCharges=0;
	

	public PrimeAcc(int accNo, String accNm, float charges,boolean isprime) {
		super(accNo, accNm, charges);
		this.isPrime= isprime;
		
	}
	 public void bookProduct (float charges) {
	    	System.out.println("Charges are"+ charges);
	    }
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	 
	 
	

}
