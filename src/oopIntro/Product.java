package oopIntro;

public class Product {
	
	public Product () {
		System.out.println("Ben Çalıştım");
		
	}//eşitleme yapılırken this kullanılır tek tek açıklamanın daha kolay yöntemi bu kod 
	 public Product(int id,String name,double unitprice,String detail) {
	 this();
	 this.id=id;
	 this.name=name;
	 this.unitprice=unitprice;
	 this.detail=detail;
	 
	 }
	 
	int id;
	String name;
	double unitprice;
	String detail;
	

}
