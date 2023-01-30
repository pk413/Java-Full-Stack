package Hello.World;
import java.util.*;


public class Hello_World {
	
	public static void array_list() {
		ArrayList<String> lis = new ArrayList<String>();
		lis.add("one");
		lis.add("two");
		lis.add("three");
		lis.add("four");
		lis.add("five");
		System.out.println("arraylist size: "+ lis.size());
		System.out.println("------");
		System.out.println(lis);
		System.out.println("------");
		for(int i = 0; i<lis.size();i++) {
			System.out.println(lis.get(i));
		}
		
		
		
	}

	
	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.array_list();
		 
		
	}
}


/* OUTPUT 

arraylist size: 5
------
[one, two, three, four, five]
------
one
two
three
four
five



*/