package ro.csie.cts.group1098.clean.code.stage2;

//stage2-remove statics 
//-remove "magic" numbers 

public class DiscountStrategy {
	
	
	public final static int PREMIUM_ACCOUNT_MIN_AGE=10;
	public final static float PREMIUM_DISCOUNT=0.15f;
	
	
	public float GetFinalPrice(ProductType productType, float productPrice, int accountAgeInYears)
		  {
			
			
		    //final float newProductDiscount = 0.1f;
		
		
			
		    float finalPrice = 0;
		    float accountDiscount = (accountAgeInYears > PREMIUM_ACCOUNT_MIN_AGE) ? PREMIUM_DISCOUNT : (float)accountAgeInYears/100; 
		    if (productType == ProductType.NEW)
		    {
		    	finalPrice = productPrice;
		    }
		    else if (productType == ProductType.NORMAL)
		    {
		    	finalPrice = (productPrice - (NORMAL_PRODUCT_TYPE * productPrice)) - accountDiscount * (productPrice - (NORMAL_PRODUCT_TYPE * productPrice));
		    }
		    else if (productType == ProductType.ON_SALE)
		    {
		    	finalPrice = (productPrice - (ON_SALE_PRODUCT_TYPE * productPrice)) - accountDiscount * (productPrice - (ON_SALE_DISCOUNT * productPrice));
		    }
		    else if (productType == ProductType.FINAL_SALE)
		    {
		    	finalPrice = (productPrice - (ON_FINAL_SALE_PRODUCT_TYPE * productPrice)) - accountDiscount * (productPrice - (ON_FINAL_SALE_DISCOUNT * productPrice));
		    }
		    return finalPrice;
		    
		    
		    
		    
		    
		    
		  }

	}	



