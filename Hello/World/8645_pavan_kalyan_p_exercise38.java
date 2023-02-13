package Hello.World;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testactivity38 {
	
	@BeforeAll
	static void increment() {
		System.out.println("selecting project");
	}
	
	@BeforeEach
	void beforeeach() {
		System.out.println("consider all possible positives and negatives of the project");
	}
	
	@AfterEach
	void aftereach() {
		System.out.println("execute all the possible outcomes to get the best result");
	}
	
	@Test
	void testone() {
		System.out.println("testone completed...");
	}
	
	@Test
	void testtwo() {
		System.out.println("test two successfully completed.");
	}

}

/* output
 
 testone completed...
execute all the possible outcomes to get the best result
consider all possible positives and negatives of the project
test two successfully completed.
execute all the possible outcomes to get the best result
 
 */
