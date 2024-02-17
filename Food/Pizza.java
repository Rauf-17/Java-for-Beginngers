public class Pizza extends Food {
private int sizeInInches;

Pizza(){}
Pizza(String name, String[] ingredients, double price, float calories,int sizeInInches){
super(name,ingredients,price,calories);
this.sizeInInches = sizeInInches;
}

public void setSize(int sizeInInches){
this.sizeInInches = sizeInInches;
}

public int getSize(int sizeInInches){
return this.sizeInInches;
}

public void showDetails(){

String ingre[];
ingre = getIngredients();
System.out.println("\nName : " + getName());
System.out.println("Size in Inches : " + this.sizeInInches);
System.out.println("Calories : " + getCalories());
System.out.println("Price " + getPrice());
System.out.println("Ingredients : ");
for(int i = 0; i<getIngredients().length;i++){
System.out.println((i+1)+". "+ingre[i]);
}
}
}