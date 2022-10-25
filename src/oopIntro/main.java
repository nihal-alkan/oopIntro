package oopIntro;

public class main {

	public static void main(String[] args) {
		
		
		Product product1 = new Product (); // Referans Oluştuma
		product1.id = 1;
		product1.name ="Lenovo 14";
		product1.unitprice =15000;
		product1.detail = "16 GB RAM";
		
		Product product2 = new Product (); // Referans Oluştuma
		product2.id = 2;
		product2.name ="Lenovo 15";
		product2.unitprice =16000;
		product2.detail = "32 GB RAM";
		
		Product product3 = new Product (); // Referans Oluştuma
		product3.id = 3;
		product3.name ="Lenovo 16";
		product3.unitprice =17000;
		product3.detail = "64 GB RAM";
		
		
		Product [] products = {product1,product2,product3};
		
		
		
		
		
		for (Product product : products) {
			System.out.println(product.name);
			
		}
				
		System.out.println(products.length);
		
		Category category1 = new Category ();
		category1.id = 1;
		category1.name = "bilgisayar";
		
		Category category2 = new Category ();
		category2.id = 2;
		category2.name="EV/BAHÇE";
	
		Productmanager productmanager=new Productmanager();
		productmanager.addtocart(product1);
		
		productmanager.addtocart(product2);
		
		productmanager.addtocart(product3);
	
		
		
		
		
		
		
		
		
		
	}

}
