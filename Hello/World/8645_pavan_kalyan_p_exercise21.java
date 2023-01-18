package Hello.World;

public class Hello_World {
	
	void divi(int a,double b){
	System.out.println(a/b);
	}
	void divi(double a,int b){
	System.out.println(a/b);
	}

	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.divi(1, 2.0);
		o.divi(2.0,3);

	}
}


/* OUTPUT 

0.5
0.6666666666666666

*/