package Hello.World;

class college{
	public void col_name(){
		System.out.println("college name");
	}
}

class staff extends college{
	public void staf_name(){
		System.out.println("staff name");
	}
} 	
public class Hello_World{
	public static void main(String[] args) {
		staff o = new staff();
		o.col_name();
		o.staf_name();

	}
}


/* OUTPUT 

college name
staff name



*/