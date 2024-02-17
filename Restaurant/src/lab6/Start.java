package lab6;

public class Start {
	
	public static void main(String[] args){
		
		String ingredient[] = new String[5];
		
		Restaurant r = new Restaurant("Sir er Duaa Restaurant");
		
		
		
		ingredient[0] = "Water";
		ingredient[1] = "Salt";
		ingredient[2] = "Suger";
		ingredient[3] = "Lemon";
		ingredient[4] = "Ice";
		
		Drinks dr1 = new Drinks("Lemonade",ingredient,80.37,70.3f,"Juice",1);
	
		Drinks dr2 = new Drinks("Banana Shake",ingredient,120.34,200.0f,"Shake",2);
        
		Drinks dr3 = new Drinks("Strawberry Shake",ingredient,110.65,500.2f,"Shake",1);

		Drinks dr4 = new Drinks("Cold Coffee",ingredient,80.34,650.5f,"Coffee",2);

		Drinks dr5 = new Drinks();
		
		
		dr5.setName("Kiwi Shake");
		dr5.setIngredients(ingredient);
		dr5.setPrice(160.54);
		dr5.setCalories(280.0f);
		dr5.setType("Basic Shake");
		dr5.setSizeInLitter(1);
		dr5.removeIngredient("Sugar");
		dr5.addIngredient("Tasting Salt");
		
		
		
		
		ingredient[0] = "Bun";
		ingredient[1] = "Beef Patty";
		ingredient[2] = "Cheese";
		ingredient[3] = "Tamato";
		ingredient[4] = "Sauces";
		
		Burger b1 = new Burger("Chicken Burger",ingredient,250.67,700.0f,2);
		
		Burger b2 = new Burger("Beef Burger",ingredient,300.43,800.0f,3);
	
		Burger b3 = new Burger("Mutton Burger",ingredient,350.45,920.9f,2);
		
		Burger b4 = new Burger("Veg Burger",ingredient,160.87,650.0f,2);
	
		Burger b5 = new Burger("Double Deccer Burger",ingredient,350.98,600.0f,1);

		
		b5.setName("Beef Naga");
		b5.setIngredients(ingredient);
		b5.setPrice(320.56);
		b5.setCalories(600.0f);
		b5.setNumberOfPatty(1);
		b5.removeIngredient("Letuce");
		b5.addIngredient("Chilli Souce");
		
		
	
		
		ingredient[0] = "Bread";
		ingredient[1] = "Sausages";
		ingredient[2] = "Cheese";
		ingredient[3] = "Green Chilli";
		ingredient[4] = "Sauces";
		
		Pizza p1 = new Pizza("Sausage Pizza",ingredient,600.35,130.0f,8);

		Pizza p2 = new Pizza("Pepparoni Pizza",ingredient,553.56,450.0f,6);

		Pizza p3 = new Pizza("Pineapple Pizza",ingredient,500.43,800.0f,6);
	
		Pizza p4 = new Pizza("Chicken Pizza",ingredient,450.76,400.0f,6);

		Pizza p5 = new Pizza("FireBall Pizza",ingredient,800.0,1200.0f,12);
		
		
		p5.setName("Classic Pizza");
		p5.setIngredients(ingredient);
		p5.setPrice(650.56);
		p5.setCalories(1200.0f);
		p5.setSizeInInces(12);
		p5.removeIngredient("Naga Sauce");
		p5.addIngredient("White Sauce");
		
		System.out.println("Sir er Duaa Restaurant");
		System.out.println("AIUB Campus, Kuratoli, Vatara, Dhaka");
		r.addToOrder(dr1);
		r.addToOrder(dr2);
		r.addToOrder(dr3);
		r.addToOrder(dr4);
		r.addToOrder(b1);
		r.addToOrder(b2);
		r.addToOrder(b3);
		r.addToOrder(b4);
		r.addToOrder(p1);
		r.addToOrder(p2);
		r.addToOrder(p3);
		r.addToOrder(p4);
		r.removeFromOrder(dr3);
		r.removeFromOrder(b4);
		r.showOrders();
		
		System.out.println("------------------");
		System.out.println("Total Bill = "+r.calculateBill());
		
		
		
		
	}

}
