package Hello.World;

public class Hello_World {
	 public String name;
	 public long id;
	 
	 public void display(){
		 System.out.println("student name: " +name);
		 System.out.println("student id: " +id);
	 }


	public static void main(String[] args) {
		Hello_World s1 = new Hello_World();
		Hello_World s2 = new Hello_World();
		 s1.name ="ram";
		 s1.id = 23409876;
		 System.out.println("Details of student 1:");
		 s1.display();
		 System.out.println(" ");
		 s2.name ="gopal";
		 s2.id = 45874294;
		 System.out.println("Details of student 2:");
		 s2.display();

	}
}


/* OUTPUT 


Details of student 1:
student name: ram
student id: 23409876
 
Details of student 2:
student name: gopal
student id: 45874294



*/