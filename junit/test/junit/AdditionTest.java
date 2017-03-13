package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

//import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class AdditionTest {
	
	@DataPoint
	public static int INT_PALAM_1 = 0;
	@DataPoint
	public static int INT_PALAM_2 = 1;
	@DataPoint
	public static int INT_PALAM_3 = -1;
	@DataPoint
	public static int INT_PALAM_4 = 100;
	
	@Theory
	public void additionTest(int arg1, int arg2){
		int expected = arg1 + arg2;
		Addition addition = new Addition();
		int actual = addition.addition(arg1, arg2);
//		assertThat(actual, is(expected));
//		System.out.println("param1 = " + arg1 + ", param2 = " + arg2);
		assertEquals(actual, expected);
	}
	
//	@Test( expected = IllegalArgumentException.class)
//	public void additionTestIlligal(){
////		int expected = 1;
//		Addition addition = new Addition();
//		/*int actual = */addition.addition(-3, 4);
////		assertThat(actual, is(expected));
//	}

	@BeforeClass
	public static void start(){
		System.out.println("AdditionTestäJén");
	}

	
	@AfterClass
	public static void end(){
		System.out.println("AdditionTestèIóπ");
	}
	
}
