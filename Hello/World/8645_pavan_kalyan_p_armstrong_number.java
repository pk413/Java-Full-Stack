package Hello.World;
import java.util.Scanner;

public class Hello_World {
	
	
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
        int temp = n;
        int count = 0;
 
        
        while (n > 0) {
        	
            int rem = n % 10;
            count += Math.pow(rem, 3);
            n = n / 10;
        }
        
    
        if (temp == count) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }

	}
}


/* OUTPUT 

Some Error in code.


*/