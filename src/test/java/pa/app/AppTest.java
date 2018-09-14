package pa.app;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for Maven JUnit 5 - Hello world!
 * @author  Paulo Araújo
 * @version 1.0
 */
public class AppTest 
{
	@BeforeEach 
	public void init() {
		logger.info("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat() {
		App ap = new App();
		String res = ap.concat("Hello"," world!");
		// Test concat example method
		assertEquals("Hello world!", res);
	}	
	
	@DisplayName("Second Test - main")
	@Test
	void testMain(){
		App.main(null);
		assertTrue(true);
	}
	
	@DisplayName("Third Test - add")
	@Test
	void testAdd() {
		App ap = new App();
		int x=0; 
		int y=2;
		assertEquals(ap.add(x, y), 2);
	}	
	
	@DisplayName("Fourth Test - subtract")
	@Test
	void testSubtract() {
		App ap = new App();
		int x=2;
		int y=1;
		assertEquals(ap.subtract(x, y), 1);
	}	
	
	@DisplayName("Fifth Test - multiply")
	@Test
	void testMultiply() {
		App ap = new App();
		int x=2;
		int y=2;
		assertEquals(ap.multiply(x, y), 4);
	}	
	
	@DisplayName("Sixth Test - divide")
	@Test
	void testDivide() {
		App ap = new App();
		int x=10;
		int y=5;
		assertEquals(ap.divide(x, y), 2);
	}	
}
