package io.cal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmazonProjectTest {
      @Test
	void testAmazontest()
	{
		String expected="spend less. smile more";
		String actual="spend less.smile more";
		
		
		assertEquals(expected,actual);
		assertSome(expected,actual);
	}

	private void assertSome(String expected, String actual) {
		// TODO Auto-generated method stub
		
	}
	
	
}
