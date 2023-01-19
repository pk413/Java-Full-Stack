package Hello.World;

abstract class Bird {
	 abstract void color();
}
class Duck extends Bird {
	 public void color() {
		 System.out.println("The color of Duck: Grey");

	 }
}
class Owl extends Bird {
	 public void color() {
		 System.out.println("The color of owl : white and black");

	 }
}	
public class Hello_World{
	public static void main(String[] args) {
		Duck d = new Duck();
		d.color();

		Owl c = new Owl();
		c.color();

	}
}


/* OUTPUT 

The color of Duck: Grey
The color of owl : white and black



*/