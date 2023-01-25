package Hello.World;

public class Hello_World {
	
	
	public static void main(String[] args) {
		
		try{
			char[] a = {'a','b','c','d'};
			System.out.println(a[6]);
		}
		catch (Exception e){
			System.out.println("Some Error in code.");
		}

	}
}


/* OUTPUT 

Some Error in code.


*/