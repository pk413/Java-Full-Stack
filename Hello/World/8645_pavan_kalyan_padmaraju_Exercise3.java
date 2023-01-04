package Hello.World;

class SubjectMarks {
	// These variables are instance variables, defined in class.
	int Science;
	int Maths;
	int English;
	}

public class Hello_World {
	public static void main(String[] args) {
		// Student 1
		 SubjectMarks St1 = new SubjectMarks();
		 St1.Science = 65;
		 St1.Maths = 55;
		 St1.English = 90;
		
		 // Student 2
		 SubjectMarks St2 = new SubjectMarks();
		 St2.Science = 35;
		 St2.Maths = 50;
		 St2.English = 85;
		
		 // displaying marks for Student 1
		 System.out.println("Marks for student1:");
		 System.out.println(St1.Science);
		 System.out.println(St1.Maths);
		 System.out.println(St1.English);
		
		 // displaying marks for Student 2
		 System.out.println("Marks for student2:");
		 System.out.println(St2.Science);
		 System.out.println(St2.Maths);
		 System.out.println(St2.English);
	}
}