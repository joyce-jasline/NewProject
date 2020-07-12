package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;






public class FirstTest {
	Example x;
	 @Before
	 public void setUp() throws Exception {
	 x=new Example();}

	 @After
	 public void tearDown() throws Exception {
	 x=null;}

	 @Test
	 public void test() {
	  assertTrue("Result",x.prime(5));
	  assertEquals(false,x.prime(9));
	 }
	}
