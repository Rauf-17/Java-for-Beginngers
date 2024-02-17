package lab6;

public class Pizza extends Food{
	
	private int sizeInInches;
	
	Pizza(){}
	Pizza( String name, String[] ingredients, double price, float calories, int sizeInInches){
		
		super(name,ingredients,price,calories);
		this.sizeInInches = sizeInInches;
		
	}

	void setSizeInInces(int sizeInInces) {
		
		this.sizeInInches = sizeInInces;
	}
	
	int getSizeInInces() {
		
		return this.sizeInInches;
	}
	
public void showDetails(){
		
		String ingredient[];
		ingredient = getIngredients();
		
		System.out.println("\nName : " + getName());
		System.out.println("Size in Inches : " + this.sizeInInches);
		System.out.println("Calories : " + getCalories());
		System.out.println("Price : " + getPrice());
		System.out.println("**************\n");
		System.out.println("Ingredients : ");
		System.out.println("--------------\n");
		
		for(int i = 0; i<getIngredients().length;i++){
			
			System.out.println((i+1)+". Ingredient : "+ingredient[i]);
		}
	}
}
