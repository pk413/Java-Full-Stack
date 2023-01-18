package Hello.World;

public class Hello_World {
	
	void sub(int a,int b){
	System.out.println(a-b);
	}
	void sub(long a,long b){
	System.out.println(a-b);
	}

	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.sub(2,1);
		o.sub(5,3);

	}
}


/* OUTPUT 

1
2

*/