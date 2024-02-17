package lab6;

public class Restaurant implements RestaurantOperation{
	
	private String restaurantName;
	private Food[] order = new Food[100];
	
	Restaurant(){}
	Restaurant(String restaurantName){
		
		this.restaurantName = restaurantName;
		
	} 
	
	void setRestaurantName(String restaurantName) {
		
		this.restaurantName = restaurantName;
	}
	
	String getRestaurantName() {
		
		return this.restaurantName;
	}
	
	public void addToOrder(Food f){
		for(int i = 0; i<order.length;i++){
			if(order[i] == null){
				order[i] = f;
				break;
			}
			else{
				continue;
			}
		}
	}
	
	public void removeFromOrder(Food f){
		for(int i = 0; i<order.length;i++){
			if(order[i] == null){
				continue;
			}
			else if(order[i] == f){
				order[i] = null;
				break;
			}
			else{
				continue;
			}
		}
	}
	
	public void showOrders(){
		for(int i = 0; i<order.length;i++){
			if(order[i] == null){
				continue;
			}
			else {
				order[i].showDetails();
			}
		}
	}
	
	
	public double calculateBill(){
		double p =0;
		for(int i = 0; i<order.length;i++){
			if(order[i] == null){
				continue;
			}
			else {
				p = p+order[i].getPrice();
			}
		}
		
		return p;
	}
	
}
