public abstract class Food {
private String name;
private String ingredients[];
private double price;
private float calories;

Food(){}
Food(String name, String[] ingredients, double price, float calories){
this.name = name;
this.ingredients = ingredients;
this.price = price;
this.calories = calories;
}

public void setName(String name){this.name = name;}
public void setIngredients(String[] ingredients){this.ingredients = ingredients;}
public void setPrice(double price){this.price = price;}
public void setCalories(float calories){this.calories = calories;}
public String getName(){return this.name;}
public String[] getIngredients(){return this.ingredients;}
public double getPrice(){return this.price;}
public float getCalories(){return this.calories;}

public void removeIngredient(String ingredient){
for(int i=0;i<ingredients.length;i++){
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
if(ingredients[i] != null){
continue;
}

else{
ingredients[i] = ingredient;
System.out.print("INVALID");
}
}
}

public abstract void showDetails();

}