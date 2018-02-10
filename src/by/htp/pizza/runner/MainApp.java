package by.htp.pizza.runner;

import by.htp.pizza.input.Input;
import by.htp.pizza.pizzaservice.Courier;
import by.htp.pizza.pizzaservice.Pizza;
import by.htp.pizza.pizzaservice.PizzaHouse;

public class MainApp {

	public static void main(String[] args) {

		Input in = new Input();
		String pizzaName = in.enterPizzaName();
		int pizzaSize = in.enterPizzaSize();

		PizzaHouse pizzaHouse = new PizzaHouse();
		Pizza pizzaForOrder = pizzaHouse.orderPizza(pizzaName, pizzaSize);

		if (pizzaForOrder != null) {

			Courier courier = new Courier();
			courier.deliver(pizzaForOrder);
		}

	}
	
}
