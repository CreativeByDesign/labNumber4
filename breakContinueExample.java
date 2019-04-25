
public class breakContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true) {
			int randomNum = (int) (Math.random() * 10);
			System.out.println(randomNum);
			
			if (randomNum == 7) {
				System.out.println("You found 7!");
				break;
			}
		}

		
		for (int i = 0; i < 5; i++){
			int randomNum = (int) (Math.random() * 10);
			
			if (randomNum > 7) {
				System.out.println("This number is too big -- going back to the top of loop");
				continue;
			}
			System.out.println(randomNum);
			
		}
		
		
		
	}

}
