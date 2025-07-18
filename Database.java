package flm.db;

import flm.cart.Cart;
import flm.test.Test;

public class Database {
	
	static int age=10;
	String name ="John";
	
	public static void main(String[] args) {
		System.out.println(age);
		Database d = new Database();
		System.out.println(d.name);
		Cart.item();
		Test t = new Test();
		t.hello();
		
	}

}
