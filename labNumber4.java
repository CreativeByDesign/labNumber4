import java.util.Scanner;

public class labNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String go = "y";

		
		while (go.equalsIgnoreCase("Y")) {

			System.out.println("Please enter a number");
			int userNum = scan.nextInt();
			

			for (int num = 1; num <= userNum; num++) {
				int square = (int) Math.pow(num, 2);
				int cube = (int) Math.pow(num, 3);
				System.out.print(num + " " + square + " ");

				System.out.println(cube + " ");
			}

			System.out.println("Would you like to enter another number? Type Y for yes or N for No");
			go = scan.next();
		}

		scan.close();
	}

}

