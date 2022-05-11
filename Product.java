
public class Product {
  private String name;
  private double price;
  
  public String getname() {
	  return name;
  }
  public void setname(String name) {
	  this.name = name;
  }
  
  public double getpice() {
	  return price;
  }
  public void setprice(Double price) {
	  this.price = price;
  }
  public double getImportTax() {
	  return this.price *10/100;	  
  }
}

