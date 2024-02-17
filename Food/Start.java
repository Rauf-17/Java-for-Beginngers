public class Start{
public static void main(String[] args){
String in[] = new String[5];
Restaurant re = new Restaurant("raja mamar cha");


in[0] = "Salt";
in[1] = "lime";
in[2] = "Lemon ";
in[3] = "Soda";
in[4] = "coke";
Drink d1 = new Drink("Lemon mint ",in,50.0,320.0f,"coke",2);


in[0] = "cha";
in[1] = "Milk";
in[2] = "Coffee";
in[3] = "Chocolate";
in[4] = "fanta";
Drink d2 = new Drink("Cold Coffee",in,350.0,500.0f,"Coffee",3);



in[0] = "Sugar";
in[1] = "Milk";
in[2] = "Coffee";
in[3] = "pepsi";
in[4] = "Ice";
Drink d3 = new Drink("merinda",in,500.0,600.2f,"Coffee",1);


in[0] = "Sugar";
in[1] = "Milk";
in[2] = "Coffee";
in[3] = "HSyrupsdw";
in[4] = "Icee";
Drink d4 = new Drink("chaaa",in,350.0,650.5f,"Coffee",2);




in[0] = "Salt";
in[1] = "Sugar";
in[2] = "Orange";
in[3] = "Orange ";
in[4] = "Ice";
Drink d5 = new Drink();
d5.setName("Orange Juice");
d5.setIngredients(in);
d5.setPrice(200.0);
d5.setCalories(280.0f);
d5.setType("Fresh Juice");
d5.setSize(1);
d5.removeIngredient("Sugar");
d5.addIngredient("Chini");


re.addDrink(d1);
re.addDrink(d2);
re.addDrink(d3);
re.addDrink(d4);
re.addDrink(d5);
re.removeDrink(d2);
re.showDrink();
System.out.println("Total bill : "+re.calculateBill(80));




in[0] = "Salt ";
in[1] = "Beef ";
in[2] = "boehani";
in[3] = "ruti";
in[4] = "Bun";
Burger b1 = new Burger("Beef kacchi",in,320.0,700.0f,2);


in[0] = "Pepper";
in[1] = "Patty";
in[2] = "Cheese";
in[3] = "Lettuce";
in[4] = "Bun";
Burger b2 = new Burger("Chicken",in,350.0,800.0f,3);


in[0] = "fyhjkd";
in[1] = "ihervmci";
in[2] = "Cheese";
in[3] = "Beef Bacon";
in[4] = "Bun";
Burger b3 = new Burger("Beef ",in,350,720.7f,2);


in[0] = "hahaaha";
in[1] = "hihi";
in[2] = "huhuhuhuhu";
in[3] = "agfhdfd";
in[4] = "Bun";
Burger b4 = new Burger("Chicken Cheese Delight",in,320,650.0f,2);



in[0] = "Salt and Pepper";
in[1] = "Beef Patty";
in[2] = "Naga Sauce";
in[3] = "Lettuce";
in[4] = "Bun";


Burger b5 = new Burger("Beef Naga",in,280.0,600.0f,1);
b5.setName("Beef Naga");
b5.setIngredients(in);
b5.setPrice(280.0);
b5.setCalories(600.0f);
b5.setNumberOfPatty(1);
b5.removeIngredient("Sauce");
b5.addIngredient("Honey");


re.addBurger(b1);
re.addBurger(b2);
re.addBurger(b3);
re.addBurger(b4);
re.addBurger(b5);
re.removeBurger(b1);
re.removeBurger(b4);
re.showBurger();
System.out.println("Total bill : "+re.calculateBill(250.0));




in[0] = "Dough";
in[1] = "Salt ";
in[2] = "Tomato";
in[3] = " Chicken";
in[4] = " Cheese";
Pizza p1 = new Pizza("Chicken Dominator",in,650.0,880.0f,8);



in[0] = "Dough";
in[1] = "Salt ";
in[2] = "Tomato";
in[3] = "Crabs ";
in[4] = "nanaana";
Pizza p2 = new Pizza(" Pizza",in,300.0,450.0f,6);


in[0] = "hahahaa";
in[1] = "oppppp";
in[2] = "jijiji";
in[3] = "naaaa";
in[4] = "hmmmmm";
Pizza p3 = new Pizza("Beef Kala Bhuna",in,400.0,800.0f,6);


in[0] = "hahaha";
in[1] = "huhuhu";
in[2] = "chili";
in[3] = "chips";
in[4] = "cake";
Pizza p4 = new Pizza("Pepperoni",in,250.0,400.0f,6);



in[0] = "nanana";
in[1] = "hehehe";
in[2] = "jijiji";
in[3] = "hahaha";
in[4] = "Cheese";


Pizza p5 = new Pizza("cake",in,400.0,100.0f,12);
p5.setName("cake");
p5.setIngredients(in);
p5.setPrice(800.0);
p5.setCalories(1200.0f);
p5.setSize(12);
p5.removeIngredient("potato");
p5.addIngredient("potato");


re.addPizza(p1);
re.addPizza(p2);
re.addPizza(p3);
re.addPizza(p4);
re.addPizza(p5);
re.removePizza(p3);

re.showPizza();
System.out.println("Total bill : "+re.calculateBill(200.0f));


}
}