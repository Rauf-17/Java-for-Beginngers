public class Burger extends Food{
private int numberOfPatty;

Burger(){}
Burger(String name, String[] ingredients, double price, float calories,int numberOfPatty){
super(name,ingredients,price,calories);
this.numberOfPatty = numberOfPatty;
}

public void setNumberOfPatty(int numberOfPatty){this.numberOfPatty = numberOfPatty;}

public int getNumberOfPatty(int numberOfPatty){return this.numberOfPatty;}


public void showDetails(){

String ingre[];
ingre = getIngredients();
System.out.println("\nName : " + getName());
System.out.println("Number of Patty : " + this.numberOfPatty);
System.out.println("Calories : " + getCalories());
System.out.println("Price " + getPrice());
System.out.println("Ingredients : ");
for(int i = 0; i<getIngredients().length;i++){
System.out.println((i+1)+". "+ingre[i]);
}
}

}