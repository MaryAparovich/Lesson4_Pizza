package by.htp.pizza.pizzaservice;

public class PizzaHouse {

	public Pizza orderPizza(String pizzaName, int pizzaSize) {

		boolean isPizzaNameExists = checkIfPizzaExists(pizzaName);

		if (isPizzaNameExists == true) {

			Pizza pizza = new Pizza();

			pizza.title = pizzaName;
			pizza.size = pizzaSize;
			System.out.println("Your order has been accepted!");
			return pizza;
		} else {
			System.out.println("Pizza does not exist!");
			return null;
		}
	}

	/**
	 * ������ ����� �������� �� ���� ������������ ����� � ��������� ���� �� ��� �
	 * ������ ���������
	 * 
	 * @param title
	 *            - �������� �����
	 * @return ���� ���� - ������ true, ���� ��� ������ false
	 */
	private boolean checkIfPizzaExists(String pizzaNameForCheck) {

		if (pizzaNameForCheck.equals("Mexican")) {
			return true;
		} else if (pizzaNameForCheck.equals("Mushroom")) {
			return true;
		}
		return false;
	}
}
