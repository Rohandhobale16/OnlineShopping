package com.shopping.application;
import com.framework.shopping.ShopFactory;

public class GSShopFactory extends ShopFactory {
	
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges,boolean isprime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo,accNm,charges,isprime);
	    return gsprime;
	}
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges,float deliveryCharge) {
		GSNormalAcc gsnormal  = new GSNormalAcc(accNo,accNm,charges,deliveryCharge);
	    return gsnormal;
	}
}
