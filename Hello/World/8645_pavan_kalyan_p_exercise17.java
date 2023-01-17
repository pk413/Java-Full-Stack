package Hello.World;
	

public class Hello_World {
	int i;
	Hello_World(){
		i = 8645;
		System.out.println("Creating no argument constructor");
		System.out.println("i="+i);
	}

	public static void main(String[] args) {
		Hello_World o = new Hello_World();
	

	}
}


/* OUTPUT 

Creating no argument constructor
i=8645


*/