package Hello.World;
	
class Parent {
	int a = 1;
	public int b = 2;
	private int c = 3;
	protected int d = 4;
	void showData() {
		System.out.println("inside parent");
		System.out.println("a="+a+" "+"b="+b+"c="+c+" "+"d="+d);
	}
}

class Child extends Parent{
	void accessData() {
		System.out.println("inside child");
		System.out.println("a="+a+" "+"b="+b+"d="+d);
		//System.out.println("d="+d); // private access modifier 
	}
}





public class Hello_World {
	public static void main(String[] args) {
		Child o = new Child();
		o.accessData();
		o.showData();
	

	}
}


/* OUTPUT 

inside child
a=1 b=2d=4
inside parent
a=1 b=2c=3 d=4


*/