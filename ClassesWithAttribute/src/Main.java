
public class Main {
	
	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop", "Toshiba Laptop", 10000, 3, "Beyaz", "La1");	
		/*product.setIsim("Laptop");
		product.setId(1); 
		product.setDescription("Toshiba Laptop");
		product.setPrice(10000);
		product.setStockAmount(3);*/
		
		
		
		ProductManager productmanager = new ProductManager();
		productmanager.add(product);
		
		System.out.println(product.getIsim() + " ürününün kodu: " +product.getKod());
		
	}

}
