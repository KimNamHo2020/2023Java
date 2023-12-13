package ExceptionTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideZero d = new DivideZero();
		
//		try {
//			d.method();
//		}
//		catch(NullPointerException e) { 
//			System.out.println(e);
//		}
//		
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		
//		finally { 
//			System.out.println("this block always run");
//		}
//		
//		System.out.println("I'm alive.");
//		//이 try-catch .
		
		try {
			Class c = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
