package Hello.World;

public class Hello_World {

	public static void main(String[] args) {
		int i = 2;
		int a = 7;
		while(i<a) {
			int j =10;
			while ((j%i==1) ) {
				System.out.println("whole Numbers: " + (i));
				j--;
			}
			i++;
		}

	}

}


/* OUTPUT 


whole Numbers: 3


*/