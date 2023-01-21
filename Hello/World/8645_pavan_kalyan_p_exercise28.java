package Hello.World;

interface education{
	public void edu();
}
interface college extends education{
	public void col();
}
interface staff extends education{
	public void staf();
}

public class Hello_World implements college, staff{
	public void edu() {
		System.out.println("educational institutes");
	}
	public void col() {
		System.out.println("various degree colleges");
	}
	public void staf() {
		System.out.println("various departmental staffs");
	}
	public void stu() {
		System.out.println("students");
	}
	
	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.edu();
		o.col();
		o.staf();
		o.stu();

	}
}


/* OUTPUT 

educational institutes
various degree colleges
various departmental staffs
students



*/