import java.util.Scanner;

public class whileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String cont = "yes";
		while(cont.equalsIgnoreCase("yes"));{
			// logic
			System.out.println("play!");
			
			System.out.println("Do you want to continue?  (yes/no ");
			cont = scan.nextLine();
			
		}
		
		
		
	}

}
