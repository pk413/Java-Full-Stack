package Hello.World;

public class Hello_World {

	public static void main(String[] args) {
	
	Hello_World o = new Hello_World();
	int input=5;
	for (int i=1; i<=input; i++){
		for (int j=input; j>i; j--){
			System.out.print(" ");
		}
		for (int k=1; k<=(i * 2) -1; k++){
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i=input-1; i>=1; i--){
		for (int j=input-1; j>=i; j--){
			System.out.print(" ");
		}
		for (int k=1; k<=(i * 2) -1; k++){
			System.out.print("*");
		}
		System.out.println();
	}
	

	}
}


/* OUTPUT 


    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *



*/