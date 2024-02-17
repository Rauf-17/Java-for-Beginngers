package lab6;

public abstract class Food implements FoodOperation{
   
	private String name;
    private	String ingredients [];
    private	double price;
    private	float calories;
    
    Food(){}
    Food(String name, String ingredients[], double price, float calories){
    	
    	this.name = name;
    	this.ingredients = ingredients;
    	this.price = price;
    	this.calories = calories;
    	
    }
    
    void setName (String name) {
    	
    	this.name = name;
    }
    
    void setIngredients (String ingredients []) {
    	
    	this.ingredients = ingredients;
    	
    }
    
    void setPrice(double price) {
    	
    	this.price = price;
    }
    
    void setCalories(float calories) {
    	
    	this.calories = calories;
    }
    
    String getName() {
    	
    	return this.name;
    }
    
    String [] getIngredients() {
    	
    	return this.ingredients;
    }
    
    double getPrice() {
    	
    	return this.price;
    }
    
    float getCalories() {
    	
    	return this.calories;
    }
    
    
    public void removeIngredient(String ingredient){
    	
		for(int i=0;i<5;i++){
			
			if(ingredients[i].equals(ingredient)){
				
				ingredients[i] = null;
				
				break;
			}
			
			else{
				
				continue;
			}
		}
	}
	
	public void addIngredient(String ingredient){
		
		for(int i = 0; i < ingredients.length;i++){
			
			if(ingredients[i] == null){
				
				continue;
			}
		
			else{
				
				ingredients[i] = ingredient;
				
				break;

			}
		}
	}
	
	public abstract void showDetails();

    
    
}

