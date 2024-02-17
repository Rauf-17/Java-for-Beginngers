public class Drink extends Food {
private String type;
private int sizeInLitter;

Drink(){}
Drink(String name, String[] ingredients, double price, float calories,String type, int sizeInLitter){
super(name,ingredients,price,calories);
this.type = type;
this.sizeInLitter = sizeInLitter;
}
public void setType(String type){this.type = type;}
public void setSize(int sizeInLitter){this.sizeInLitter = sizeInLitter;}

public String getType(){return this.type;}
public int sizeInLitter(){return this.sizeInLitter;}

public void showDetails(){
String ingre[];
ingre = getIngredients();
System.out.println("\nName - " + getName());
System.out.println("Type - " + this.type);
System.out.println("Size -" + this.sizeInLitter);
System.out.println("Price -" + getPrice());
System.out.println("Calories -" + getCalories());
System.out.println("Ingredients - ");
for(int i = 0; i<getIngredients().length;i++){
System.out.println((i+1)+". "+ingre[i]);
}
}
}