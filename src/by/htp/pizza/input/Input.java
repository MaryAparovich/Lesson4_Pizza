package by.htp.pizza.input;

import java.util.Scanner;

public class Input {

	Scanner MyScanner = new Scanner(System.in);

	public String enterPizzaName() {

		System.out.println("Select pizza:");
		String name = MyScanner.next();

		return name;
	}

	public int enterPizzaSize() {

		System.out.println("Select size:");
		int size = MyScanner.nextInt();

		return size;
	}
}
