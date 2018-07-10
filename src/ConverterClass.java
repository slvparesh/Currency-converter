
public class ConverterClass extends USDClass {

	float u=usdQty;
	String destCurrency;
	
	
	 ConverterClass(float usdQty,String destCurrency) {
		
		super(usdQty);
		this.destCurrency=destCurrency;
	}

	
	
	float convertCurrency() {
		
		if(destCurrency.equalsIgnoreCase("EUR"))
				usdQty= 0.81f*usdQty;
		if(destCurrency.equalsIgnoreCase("INR"))
			usdQty= 64.31f*usdQty;
		if(destCurrency.equalsIgnoreCase("MYR"))
			usdQty= 3.95f*usdQty;
		if(destCurrency.equalsIgnoreCase("SGD"))
			usdQty= 1.32f*usdQty;
		if(destCurrency.equalsIgnoreCase("GBP"))
			usdQty= 0.72f*usdQty;
		if(destCurrency.equalsIgnoreCase("CAD"))
			usdQty= 1.26f*usdQty;
		return usdQty;
	}



    void display() {
    	
    	
    	System.out.println("The "+destCurrency +" amount equivalent to "+u+" USD is :"+usdQty); 
    	}


}
