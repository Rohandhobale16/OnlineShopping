package com.shopping.application;

import com.framework.shopping.*;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		
	}

	
	public void bookProduct(float deliverCharge) {
		
		System.out.println("dear Normal user and delivery Charges" + deliverCharge);
	}


	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharge()=" + getDeliveryCharge() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
    
}
