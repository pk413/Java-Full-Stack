package Hello.World;

public class Hello_World {

	public static void main(String[] args) {
		
		int n = 1;
		while(n<=50) {
			int add = 0;
			int i=2;
			while(i<=n/2) {
				if(n%i==0) {
					add++;
					break;
				}
				i++;
			}
			if(add==0 && n!= 1) {
				System.out.println("prime "+n);
				
			}
			n++;
		}

	}

}


/* OUTPUT 

Data:1
Data:0
Data:1
Data:0
Data:1


*/