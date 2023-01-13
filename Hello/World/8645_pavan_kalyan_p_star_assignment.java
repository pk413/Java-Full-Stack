package Hello.World;

public class star {
	
	public void up_right_triangle() {
		int input=5;
		for(int i =1;i<=input;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		star o = new star();
		o.up_right_triangle();

	}

}


/* output

* 
** 
*** 
**** 
***** 

*/