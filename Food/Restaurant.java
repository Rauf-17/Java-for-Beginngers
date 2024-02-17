public class Restaurant{
private String restaurantName;
private Drink drinks[] = new Drink[100];
private Burger burgers[] = new Burger[100];
private Pizza pizzas[] = new Pizza[100];

Restaurant(){}
Restaurant(String restaurantName){
this.restaurantName = restaurantName;
}

public void setRestaurantName(String restaurantName){
this.restaurantName = restaurantName;
}

public String getRestaurantName(){return this.restaurantName;}

public void addDrink(Drink d){
int add = 0;
for(int i = 0; i<drinks.length;i++){
if(drinks[i] != null){
continue;
}
else{
drinks[i] = d;
break;
}
}
}


public void removeDrink(Drink d){
int add = 0;
for(int i = 0; i<drinks.length;i++){
if(drinks[i] != d){
drinks[i] = null;
break;
}
else{
continue;
}
}
}

public void showDrink(){
for(int i = 0; i<drinks.length;i++){
if(i>4){
break;
}

else if(drinks[i] != null){
System.out.println("Drink "+(i+1)+" : ");
drinks[i].showDetails();

}
else{
System.out.println("Drink "+ (i+1) + " : " );
System.out.println("Drink not Found !");

}

}
}

public double calculateBill(int a){
double bill = 0;
for(int i = 0; i<drinks.length;i++){
if(drinks[i] != null){
bill = bill+a;
}
else{
continue;
}

}
return (double)bill;
}





public void addBurger(Burger b){
int add = 0;
for(int i = 0; i<burgers.length;i++){
if(burgers[i] != null){
continue;
}
else{
burgers[i] = b;
break;
}
}
}


public void removeBurger(Burger b){
int add = 0;
for(int i = 0; i<burgers.length;i++){
if(burgers[i] != b){
burgers[i] = null;
break;
}
else{
continue;
}
}
}

public void showBurger(){

for(int i = 0; i<burgers.length;i++){

if(i>4){
break;
}

else if(burgers[i] != null){
System.out.println("Burger "+ (i+1) + " : " );
burgers[i].showDetails();

}
else{
System.out.println("Burger "+ (i+1) + " : " );
System.out.println("Burger not found !");

}

}
}

public double calculateBill(double d){
double bill = 0;
for(int i = 0; i<burgers.length;i++){
if(burgers[i] != null){
bill = bill+d;
}
else{
continue;
}
}
return bill;
}




public void addPizza(Pizza p){
int add = 0;
for(int i = 0; i<pizzas.length;i++){
if(pizzas[i] != null){
continue;
}
else{
pizzas[i] = p;
break;
}
}
}


public void removePizza(Pizza p){
int add = 0;
for(int i = 0; i<pizzas.length;i++){
if(pizzas[i] != p){
pizzas[i] = null;
break;
}
else{
continue;
}
}
}

public void showPizza(){
for(int i = 0; i<pizzas.length;i++){
if(i>4){
break;
}

else if(pizzas[i] != null){
System.out.println("Pizza "+ (i+1) + " : " );
pizzas[i].showDetails();

}
else{
System.out.println("Pizza "+ (i+1) + " : " );
System.out.println("Pizza Not Found !");

}

}
}

public double calculateBill(float f){
float bill = 0.0f;
for(int i = 0; i<pizzas.length;i++){
if(drinks[i] != null){
bill = bill+f;
}
else{
break;
}
}
return (double)bill;
}
}