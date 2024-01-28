package com.shopping.client;
import com.framework.shopping.NormalAcc;
import com.framework.shopping.PrimeAcc;

import com.framework.shopping.ShopFactory;
import com.shopping.application.GSPrimeAcc;
import com.shopping.application.GSShopFactory;
import com.shopping.application.GSNormalAcc;
public class client {
     public static void main(String args[]) {
    	 ShopFactory sf = new GSShopFactory();
    	 PrimeAcc pa = new GSPrimeAcc(123,"Rahul",500,true);
    	 pa.bookProduct(pa.getCharges());
    	 pa.toString();
    	 
    	 NormalAcc na = new GSNormalAcc(455,"Rohan",1000,70);
    	 na.bookProduct(na.getDeliveryCharge());
    	 na.toString();
     }
}
