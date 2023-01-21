package Hello.World;

interface education{
	public void edu();
}
interface college{
	public void col();
}
interface staff extends education, college{
	public void staf();
}
class student implements staff{
	public void edu() {
		System.out.println("educational institutes");
	}
	public void col() {
		System.out.println("colleges/universities");
	}
	public void staf() {
		System.out.println("departments professors");
	}
	public void stu() {
		System.out.println("students departments");
	}
}

public class Hello_World{
	public static void main(String[] args) {
		student o = new student();
		o.edu();
		o.col();
		o.staf();
		o.stu();

	}
}


/* OUTPUT 

educational institutes
colleges/universities
departments professors
students departments



*/