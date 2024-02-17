package lab6;

interface RestaurantOperation {
	
	public void addToOrder(Food f);
	
	public void removeFromOrder(Food f);
	
	public void showOrders();
	
	public double calculateBill();
	
}