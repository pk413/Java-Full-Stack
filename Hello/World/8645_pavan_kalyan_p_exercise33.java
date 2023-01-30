package Hello.World;
import java.util.*;


public class Hello_World {
	
	public static void hash_Set() {
		HashSet hs = new HashSet();
		hs.add("BMW");
		hs.add("Volvo");
		hs.add("Tata");
		hs.add("Mahindra");
		hs.add("Nissan");
		System.out.println("hashset size: "+ hs.size());
		System.out.println("------");
		System.out.println(hs);
		System.out.println("------");
		hs.remove("Tata");
		Iterator hs_itr = hs.iterator();
		while(hs_itr.hasNext()) {
			System.out.println(hs_itr.next());
		}
		
	}

	
	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.hash_Set();
		 
		
	}
}


/* OUTPUT 

hashset size: 5
------
[Mahindra, Volvo, BMW, Tata, Nissan]
------
Mahindra
Volvo
BMW
Nissan




*/