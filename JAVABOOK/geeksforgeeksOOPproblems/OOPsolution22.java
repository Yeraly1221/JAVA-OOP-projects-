import java.util.Scanner;
import java.util.ArrayList;


class Product  {
	private String productName;
	private double  productPrice;

	public Product(String productName, double  productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public double getProductPrice() {
		return productPrice;
	}

	public String getProductDetails() {
		return "Product Name: " + productName + "Product Price: " + productPrice;
	}
}

class Store {
	private int storeID;
	private String storeName;
	private ArrayList<Product> productList;
	private double revenue;

	public Store (int storeID, String storeName) {
		this.storeID = storeID;
		this.storeName = storeName;
		this.productList = new ArrayList<>();
		this.revenue = 0.0;
	}

	public void addProduct(Product product) {
		productList.add(product);
		
		revenue +=  product.getProductPrice();
	}
	
	public double calculateTotalRevenue() {
		return revenue;
	}

	public void displayStoreInfo() {
		System.out.println("------------------------------");
		System.out.println("Store ID: " + storeID);
		System.out.println("Store Name: " + storeName);
		System.out.println("Product List: ");
		for(Product product : productList) {
			System.out.println(product.getProductDetails());
		}
		System.out.println("Total Revenue: $" + calculateTotalRevenue());
	}
}

public class OOPsolution22 {
	public static void main(String[] args) {
		Product product1 = new Product("Iphone", 2599);
		Product product2 = new Product("Dison", 2099);
		Product product3 = new Product("Charging", 359);
	
		Store store =  new Store(100, "TechNaDom");

		store.addProduct(product1);
		store.addProduct(product2);
		store.addProduct(product3);

		store.displayStoreInfo();
	}
}
