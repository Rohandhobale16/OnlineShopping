package com.framework.shopping;

public abstract class NormalAcc extends ShopAcc {
	
   private final float deliveryCharge;
   

public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
	super(accNo, accNm, charges);
	this.deliveryCharge = deliveryCharge;
}


public float getDeliveryCharge() {
	return deliveryCharge;
}

public void bookProduct(float deliverCharge) {
	System.out.println("Delivery charges"+deliverCharge );
}


@Override
public String toString() {
	return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getDeliveryCharge()=" + getDeliveryCharge()
			+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}


}
