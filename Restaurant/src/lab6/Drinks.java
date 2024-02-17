package lab6;

public class Drinks extends Food {

	private String Type;
	private int sizeInLitter;
	
	Drinks(){}
	Drinks (String name, String[] ingredients, double price, float calories, String Type, int 
	sizeInLitter){
		
		super(name,ingredients,price,calories);
		
		this.Type = Type;
		this.sizeInLitter = sizeInLitter;
		
	}
	
	void setType (String Type) {
		
		this.Type = Type;
	}
	
	void setSizeInLitter (int sizeInLitter) {
		
		this.sizeInLitter = sizeInLitter;
	}
	
	String getType() {
		
		return this.Type;
		
	}
	
	int getSizeInLitter() {
		
		return this.sizeInLitter;
	}
	
	public void showDetails(){
		
		String ingredient[];
		
		ingredient = getIngredients();
		
		System.out.println("\nName : " + getName());
		System.out.println("Type : " + this.Type);
		System.out.println("Size : " + this.sizeInLitter);
		System.out.println("Price " + getPrice());
		System.out.println("Calories : " + getCalories());
		System.out.println("**************\n");
		System.out.println("Ingredients : ");
		System.out.println("---------------\n");
		
		for(int i = 0; i<getIngredients().length ;i++){
			
			System.out.println((i+1)+". Ingredients :" +ingredient[i]);
			
		}
	}

}
