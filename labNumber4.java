import java.util.Scanner;

public class labNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String go = "y";

		// add for loop
//		while (go.equalsIgnoreCase("Y")) {
//			System.out.println("Please enter a number");
		int	num = scan.nextInt();
			
			for (num = 1; 1 <= num; num++) {
				int square = (int) Math.pow(num, 2);
				int cube = (int) Math.pow(num, 3);
				System.out.print(square + " ");
				System.out.println();
				System.out.println(cube + " ");}
//				
//				if ( == "Y") {
					System.out.println("Would you like to enter another number? Type Y for yes or N for No");
					go = scan.nextLine();
//				}
				
				scan.close();
			}

		}
	
	 


//		while (go.equalsIgnoreCase("Y")) {
//			System.out.println("Would you like to enter another number? Type Y for yes or N for No");
//	go = scan.nextLine();
//	System.out.println("Thank you for your participation!");
//		}
//			
//			scan.close();
//	}
