import java.util.*;
public class MainClass {

	
	
	boolean validate(float usdQty , String destCurrency){
		
		if(usdQty>0.0f) {
					
		      if(destCurrency.equalsIgnoreCase("INR")|| destCurrency.equalsIgnoreCase("EUR")||destCurrency.equalsIgnoreCase("MYR")||destCurrency.equalsIgnoreCase("SGD")||destCurrency.equalsIgnoreCase("GBP")||destCurrency.equalsIgnoreCase("CAD"))
		      {						
		          	return true;
		      }
		             	else
		          		return false;
					}
		      else
		    	  return false;
		}
public static void main(String[] args) {

		
        MainClass M=new MainClass();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value ");
		 float usdQty=sc.nextFloat();
		
		System.out.println("Enter the currency you want ");	
		String destCurrency=sc.next();
		
		if(M.validate(usdQty,destCurrency)) {
			ConverterClass c=new ConverterClass(usdQty, destCurrency);
			c.convertCurrency();
			c.display();
			
			
		}
		else
			System.out.println("Unable to convert the given input");
		
		
		
		
	}}
	
	

