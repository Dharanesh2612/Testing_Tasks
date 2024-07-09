package io.cal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class LifeCycleAnnotationTest {

	
	LifeCycleAssumption m;

	@Nested
	class testPositiveNumber{
		@BeforeEach
		void init() {
			m=new LifeCycleAssumption ();
		}
		@Test
		void testPositiveNo() {
			int expected=2;
			int actual=2;
			assertEquals(2,m.positive(2, 2),"Sholud return a positive value");}
		@Test
		void testNegativeNo() {
			int expected = -2;
			int actual = m.positive(-2, -2);
			
			assertEquals(expected,actual,() -> "Should return a -ve value");
		}
	}
}  
  
  
  

	
