package Hello.World;

class Books {

	void run(){
	System.out.println("Book not in stock");
	}
}
	
public class Hello_World extends Books{
	void run(){
	System.out.println("Book is available");
	}

	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.run();

	}
}


/* OUTPUT 

Book is available


*/