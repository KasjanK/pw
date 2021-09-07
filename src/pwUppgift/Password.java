package pwUppgift;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String password = "elefantöra";
		int PASS_TEST = 4;
		
		Scanner scanner = new Scanner(System.in);
		
		boolean passCheck = false;
		int tryCount = 1;
		
		System.out.println("Please enter password. You have 3 tries.");
		
		while(!passCheck) {
			if (tryCount >= PASS_TEST) {
				passCheck = true;
				System.out.println("Locked");
			}
			
			String pass = scanner.nextLine();
			
			if(pass.equalsIgnoreCase(password)) {
				System.out.println("Right");
				passCheck = false;
			} else {
				System.out.println("Wrong. (" + tryCount + "/3)");
				tryCount++;
			}
		}
		
	}

}
