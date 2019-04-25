
public class methodPractice {
// methods can live here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodPractice test = new MethodPractice();
boolean t = test.checkSeven();
		
	}
// methods can live here
	
	
	/*
	 * 5 steps for writing methods
	 * 
	 * 1. visibility modifier (required): public or private
	 * 2.static  or nothing
	 * 3.return type: should match what you need to return
	 * 4.method name: should be a verb to show action
	 * 5.parameter list: things we need in the method, can be blank
	 */
	
	public static void sayHello() {
		System.out.println("hello");
	}
	
	public static String sayHelloName(String name) {
		//name is just a place holder can be used again
		return " Hello, " + name; 
	}
	
	private boolean checkSeven() {
		if(num == 7);
		return true;
	}
	return false;
	
	
}
