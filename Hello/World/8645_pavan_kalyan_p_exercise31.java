package Hello.World;
import java.util.Scanner;

public class Hello_World {
	
	static void Age(int age) throws NullPointerException,ArithmeticException {
		 if (age < 18){
			 throw new ArithmeticException("Access denied must be at least 18 years old to watch movie");
		 }
		 else{
			 System.out.println("Access granted to watch movie");
		 }
	}

	
	public static void main(String[] args) {
	
		Age(20);

	}
}


/* OUTPUT 

Access granted to watch movie


*/