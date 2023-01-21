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

class student extends college{
	public void stu_name() {
		System.out.println("Student name");
	}
}

public class Hello_World{
	public static void main(String[] args) {
		student o = new student();
		o.col_name();

		staff o1 = new staff();
		o1.staf_name();
	}
}


/* OUTPUT 

college name
staff name



*/