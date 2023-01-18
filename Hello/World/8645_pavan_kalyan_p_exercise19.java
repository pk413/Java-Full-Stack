package Hello.World;

public class Hello_World {
	
	void mul(int a,long b){
	System.out.println(a*b);
	}
	void mul(int a,int b,int c){
	System.out.println(a*b+c);
	}

	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.mul(1,2);
		o.mul(1, 2,3);

	}
}


/* OUTPUT 

2
5

*/