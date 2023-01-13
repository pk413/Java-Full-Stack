package Hello.World;

class Car{
	String cc1 = "Jeep"; // cc stands for car company
	public String cc2 = "GM";
	private String cc3 = "Ford";
	protected String cc4 = "Tesla";
	void cars() {
		System.out.println("Company");
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		System.out.println(cc4);
	}
}
class Car_colour extends Car{
	void colors() {
		System.out.println(cc1+"-red");
		System.out.println(cc2+"-black");
	//	System.out.println(cc3+"Blue"); // private class can't be accessed outside of the class
		System.out.println(cc4+"-white");
	}
}

public class Hello_World {

	public static void main(String[] args) {
		Car_colour o = new Car_colour();
		o.cars();
		o.colors();
	

	}
}


/* OUTPUT 

Company
Jeep
GM
Ford
Tesla
Jeep-red
GM-black
Tesla-white


*/