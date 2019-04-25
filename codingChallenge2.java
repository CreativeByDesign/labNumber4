import java.util.Scanner;

public class codingChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age in years: ");
		int age = scan.nextInt();
		
		System.out.println("Days old : " + ageInDays(age));
		System.out.println("Days until 75 " + daysUntil75(age));
		
		scan.close();
		

	}
	
	public static int ageInDays(int age) {
		return age * 365;
	}
	
	public static int daysUntil75(int userAge) {
		
		return ( 27375 - ageInDays(userAge));
	}

}
