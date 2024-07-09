package io.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorProjectTest {

@Test
void add() {
CalculatorProject cp=new CalculatorProject();
int expected=2;
int actual=cp.add(1,1);


assertEquals(expected,actual,"Add Function can Calulate Two Integers..!");
}

@Test
void sub() {
CalculatorProject cp=new CalculatorProject();
int expected=3;
int actual=cp.sub(6,3);


assertEquals(expected,actual,"Subtraction Function can Calulate Two Integers..!");
}

@Test
void mul() {
CalculatorProject cp=new CalculatorProject();
int expected=18;
int actual=cp.mul(6,3);


assertEquals(expected,actual,"MUltiply Function can Calulate Two Integers..!");
}

@Test
void div() {
CalculatorProject cp=new CalculatorProject();
int expected=2;
int actual=cp.div(6,3);


assertEquals(expected,actual,"Divide Function can Calulate Two Integers..!");
}

@Test

void areaofcircle() {

	CalculatorProject c = new CalculatorProject();

	

	assertEquals(314.1592653589793, c.AreaOfCircleTest(10));

}
@Test

void positivenumber() {

	CalculatorProject c = new CalculatorProject();

	int a = 1;

	if(0 < a) {

		assertEquals(0 < a, c.positive(1));

	}

}
//@Test
//void divtest()
//{
//
//CalculatorProject f= new CalculatorProject();
//
//int expected = 5;
//int actual = f.div(10, 2);
//
//assertThrows(NullPointerException.class, () ->f.div(1, 0), "div Function can calculate two integers ");
//
//}

}