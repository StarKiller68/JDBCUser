package godmask;

import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
		
		Scanner inputName = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = inputName.nextLine();
		
		Scanner inputAge = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = inputAge.nextInt();
		
		Model model = new Model(name, age);
		boolean result = model.createUser();
		
		if(!result) {
			System.out.println("User added successfully.");
		}
		else {
			return;
		}
		

	}

}
