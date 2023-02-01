package Hello.World;

public class Hello_World {
	public static void main(String[] args) {
		Multi_Thread t1 = new Multi_Thread("Thread 1");
		t1.start();
		Multi_Thread t2 = new Multi_Thread("Thread 2");
		t2.start();
	}
}

class Multi_Thread implements Runnable {
	Thread wires;
	private String piece;
	Multi_Thread(String value){
		piece = value;
	}
	@Override
	public void run() {
		System.out.println("Thread Running : "+ piece);
		for(int i=0; i<3;i++) {
			System.out.println(i);
			System.out.println(piece);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("Thread is interrupted");
			}
		}
	}
	public void start() {
		System.out.println("Thread started");
		if(wires == null) {
			wires = new Thread(this, piece);
			wires.start();
		}
	}
}


/* output


Thread started
Thread started
Thread Running : Thread 2
0
Thread 2
Thread Running : Thread 1
0
Thread 1
1
Thread 1
1
Thread 2
2
Thread 1
2
Thread 2



*/