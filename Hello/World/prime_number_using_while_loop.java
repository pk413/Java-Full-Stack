package Hello.World;

public class Hello_World {

	public static void main(String[] args) {
		int n1=2;
		int n2=20;
		while(n1<=n2) {
		int i=2;
		boolean a = true;
		while(i<=n1/2) {
			if(n1%i==0) {
				a = false;
				break;
			}
			i++;
		}
		if(a) {
		System.out.println(n1);}
		n1++;
		}

	}

}


/* OUTPUT 

2
3
5
7
11
13
17
19



*/