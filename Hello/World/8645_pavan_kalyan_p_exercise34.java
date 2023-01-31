package Hello.World;
import java.util.*;

public class Hello_World {
	
	public static void tree_Set() {
		TreeSet ts = new TreeSet();
		ts.add("bmw");
		ts.add("toyota");
		ts.add("lotus");
		ts.add("alphine");
		ts.add("motors");
		System.out.println("size:"+ts.size());
		System.out.println(ts);
		
		Iterator ts_itr = ts.iterator();
		while(ts_itr.hasNext()) {
			System.out.println(ts_itr.next());
		}
		
	}

	
	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.tree_Set();
		 
		
	}
}


/* OUTPUT 

size:5
[alphine, bmw, lotus, motors, toyota]
alphine
bmw
lotus
motors
toyota



*/