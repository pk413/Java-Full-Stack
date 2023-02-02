package Hello.World;

class Sync{
	synchronized void show(String s1) {
		try {
			System.out.println("++++++++++");
			System.out.print(s1);
			Thread.sleep(1000);
			System.out.println("###########");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class My_thread implements Runnable{
	Thread a;
	String s2;
	Sync b;
	My_thread(Sync c, String s3) {
		b = c;
		s2 = s3;
		a = new Thread(this);
	}
	public void run() {
		b.show(s2);
	}
}

public class Hello_World {
	public static void main(String[] args) throws InterruptedException{
		Sync o = new Sync();
		My_thread t1 = new My_thread(o, "thread starts...");
		My_thread t2 = new My_thread(o, "final thread..!");
		t1.a.start();
		t2.a.start();
		t1.a.join();
		t2.a.join();
	}
}




/* output


++++++++++
thread starts...###########
++++++++++
final thread..!###########



*/