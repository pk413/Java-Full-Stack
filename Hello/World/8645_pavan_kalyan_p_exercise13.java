package Hello.World;

public class Hello_World {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++)
		{
		 for (int j=1; j<=10; j++) {
			 System.out.println(i+"x"+j+"="+(i*j));
			
		 }
		 System.out.println("-------------");
		 }


	}

}


/* OUTPUT 
1x1=1
1x2=2
1x3=3
1x4=4
1x5=5
1x6=6
1x7=7
1x8=8
1x9=9
1x10=10
-------------
2x1=2
2x2=4
2x3=6
2x4=8
2x5=10
2x6=12
2x7=14
2x8=16
2x9=18
2x10=20
-------------
3x1=3
3x2=6
3x3=9
3x4=12
3x5=15
3x6=18
3x7=21
3x8=24
3x9=27
3x10=30
-------------


*/