package Hello.World;
import java.io.*;

public class Hello_World {
	public static void f_is() {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\abcd\\Desktop\\pavan\\Myfirstproject\\src\\Hello\\World\\file_input.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String str;
			while((str = br.readLine())!= null) {
				System.out.println(str);
			}
			br.close();
			fis.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Hello_World o = new Hello_World();
		o.f_is();
	}
}

/* output


file input stream initialized
buffer reader.


*/