package pwUppgift;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String password = "elefantöra";
		String pass;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Password:");
		pass = scanner.nextLine();

		if (pass.equals(password)) {
			System.out.println("Access granted!");
		} else {
			for (int i = 0; i < 2; i++) {
				System.out.println("Enter Your Password:");
				pass = scanner.nextLine();
				if (pass.equals(password)) {
					System.out.println("Access granted!");
				}
			}
			System.out.println("Access Denied!");
			scanner.close();
		}
	}

}
