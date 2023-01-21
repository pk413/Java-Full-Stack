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

class student extends staff{
	public void stu_name() {
		System.out.println("Student name");
	}
}

public class Hello_World{
	public static void main(String[] args) {
		student o = new student();
		o.col_name();
		o.staf_name();
		o.stu_name();

	}
}


/* OUTPUT 

college name
staff name
Student name



*/