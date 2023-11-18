
import java.util.ArrayList;


class User
{
	String username;
	double totalCost;
	ProductExample prodeuctExample;
	ArrayList<ProductExample> a1=new ArrayList<ProductExample>();
	public User(String username) {
		this.username = username;
	}
	public void addToCart(ProductExample item)
	{
	   a1.add(item); 
	}
	public void viewCart()
	{
		 totalCost=0;
		for (ProductExample productExample : a1) {
			System.out.println(productExample.name+"-$"+productExample.cost);
			totalCost=totalCost+productExample.cost;
		}
		totalCost();
	}
	public void removeCart(ProductExample item)
	{
		a1.remove(item);
	}
	public void totalCost()
	{
		 System.out.println("Total Amount-$"+totalCost);
	}
	public void checkOut()
	{
		System.out.println("\"Order placed! Total amount: $"+totalCost);
	}
}
class ProductExample
{
	String name;
	double cost;
	
	public ProductExample(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ProductExample [name=" + name + ", cost=" + cost + "]";
	}

	public static void main(String[] args) {
		
		ProductExample laptop=new ProductExample("Laptop", 999.99);
		ProductExample headphone= new ProductExample("HeadPhones", 499.99);
		ProductExample smartphones=new ProductExample("SmartPhones", 79.99);
		
		User user=new User("johnDoe");
		
		user.addToCart(laptop);
		user.addToCart(smartphones);
		user.addToCart(headphone);

		user.viewCart();
		
		user.removeCart(smartphones);
		System.out.println("After Removing item The TotalAmount will be:");
		
		user.viewCart();
		user.checkOut();
	}
}