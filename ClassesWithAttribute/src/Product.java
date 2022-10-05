
public class Product {
	
	//attribute
	private int id;
	private String isim;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	
	
	public Product(int id, String isim, String description, double price, int stockAmount, String renk, String kod) {
		super();
		this.id = id;
		this.isim = isim;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
		this.kod = kod;
		System.out.println("Yapıcı blok çalıştı.");
	}
	
	public Product() {
		
	}

	public String getKod() {
		return this.isim.substring(0, 2) + id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	

}
