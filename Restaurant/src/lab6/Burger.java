package lab6;

public class Burger extends Food {
    
	private int numberOfPatty;
	
	Burger(){}
	Burger(String name, String[] ingredients, double price, float calories, int numberOfPatty){
		
		super(name,ingredients,price,calories);
		this.numberOfPatty = numberOfPatty;
		
	}

    void setNumberOfPatty(int numberOfPatty) {
    	
    	this.numberOfPatty = numberOfPatty;
    }

    int getNumberOfPatty() {
    	
    	return this.numberOfPatty;
    }

public void showDetails(){
		
		String ingredient[];
		ingredient = getIngredients();
		
		System.out.println("\nName : " + getName());
		System.out.println("Number of Patty : " + this.numberOfPatty);
		System.out.println("Calories : " + getCalories());
		System.out.println("Price " + getPrice());
		System.out.println("**************\n");
		System.out.println("Ingredients : ");
		System.out.println("--------------\n");
		
		
		for(int i = 0; i<getIngredients().length;i++){
			
			System.out.println((i+1)+". Ingredient : "+ingredient[i]);
		}
	}

}
