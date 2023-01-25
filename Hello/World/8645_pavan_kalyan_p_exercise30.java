package Hello.World;
import java.util.Scanner;

public class Hello_World {
	
	
	public static void main(String[] args) {
	
		try{
			String[] a = {"volvo","bmw","tata","htc"};
			System.out.println(a[5]);
			int b = 10/0 ;
			System.out.println("value of b: "+b);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("array index out of bounds: "+e);
		}
		catch (ArithmeticException e1) {
			System.out.println("infinite value: "+e1);
		}
		catch (Exception e2){
			System.out.println("Some Error in code.");
		}
		finally{
			System.out.println("The finally statement lets you execute code, after try...catch, regardless of the result");
		}

	

	}
}


/* OUTPUT 

array index out of bounds: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
The finally statement lets you execute code, after try...catch, regardless of the result

*/