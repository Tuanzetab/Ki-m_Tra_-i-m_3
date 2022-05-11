
public class NoTaxProduct extends Product {
	public NoTaxProduct(){        
    }  
    public NoTaxProduct(String name, double price){
        super(name, price);
    }
	
   public double getImportTax() {	
		  return 0;
	  }
}
