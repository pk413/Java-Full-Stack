package Hello.World;

public class Hello_World {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Cooking ");
		str.append("Emerging ");
		System.out.println(str);
		System.out.println(str.length());
		str.insert(17, "Technology ");
		System.out.println(str);
		str.replace( 8, 16, "IoT");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		System.out.println( str.capacity() );



	}

}
