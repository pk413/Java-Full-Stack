package Hello.World;

public class Hello_World {

	public static void main(String[] args) {
		
		// Assignment Operator
		int n1, n2;
		n1 = 015;
		System.out.println(n1);
		n2 = n1;
		System.out.println(n2);

		// Arithmetic Operator
		double ao;

		// Addition operator
		ao = n1 + n2;
		System.out.println("number1 + number2 = " + ao);

		// Subtraction operator
		ao = n1 - n2;
		System.out.println("number1 - number2 = " + ao);

		// Multiplication operator
		ao = n1* n2;
		System.out.println("number1 * number2 = " + ao);
		// Division operator
		ao = n1 / n2;
		System.out.println("number1 / number2 = " + ao);

		// Remainder operator
		ao = n1 % n2;
		System.out.println("number1 % number2 = " + ao);

		// Unary Operators
		double n = 150, resultNumber;
		boolean flag = false;

		System.out.println("+number = " + +n);
		

		System.out.println("-number = " + -n);
		

		// ++number is equivalent to number = number + 1
		System.out.println("number = " + ++n);
		
		 // -- number is equivalent to number = number - 1
		 System.out.println("number = " + --n);
		 
		 System.out.println("!flag = " + !flag);
		 // flag is still false.
		 System.out.println(n++);
		 System.out.println(n);
		 System.out.println(++n);
		 System.out.println(n);

		// Relational Operators
		 if (n1 > n2)
		 {
			 System.out.println("number1 is greater than number2.");
		 }
		 if (n1 < n2)
		 {
			 System.out.println("number2 is greater than number1.");
		 }
		 if (n1 == n2)
		 {
			 System.out.println("number1 is equal to number2.");
		 }

		// Logical Operators
		 int n3 = 280;
		 boolean result;
		 // Logical OR Operator
		 result = (n1 > n2) || (n3 > n1);
		 // result will be true because number3 greater than number1
		 System.out.println(result);
	
		 // Logical AND Operator
		 result = (n1 > n2) && (n3 > n1);
		 // result will be false because number1 is equal to number2
		 System.out.println(result);
		// Ternary Operator
		 int februaryDays = 29;
		 String display;

		 display = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		 System.out.println(display);

		// Bitwise Operator
		 int a = 50; /* 50 = 0011 0010 */
		 int b = 20; /* 20 = 0001 0100 */
		 int c = 0;
		 c = a & b; /* 16 = 0001 0000 */
		 System.out.println("a & b = " + c );
		 c = a | b; /* 54 = 0011 0110 */
		 System.out.println("a | b = " + c );
		 c = a ^ b; /* 38 = 0010 0110 */
		 System.out.println("a ^ b = " + c );
		 c = ~a; /*-51 = 1100 1101 */
		 System.out.println("~a = " + c );
	
		// Shift Operator
		 c = a >> 2; /* 12 = 0000 1100 */ // Right shift operator
		 System.out.println("a >> 2 = " + c );
	
		 c = a << 2; /* 200 = 1100 1000 */ // left shift operator
		 System.out.println("a << 2 = " + c );


	}

}
