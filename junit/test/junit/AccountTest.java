package junit;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class AccountTest {

	@DataPoint
	public static int INT_PALAM_1 = 0;
	
	@DataPoint
	public static int INT_PALAM_2 = 10;
	
//	@DataPoint
//	public static int INT_PALAM_3 = -100;
	
	@Theory
//	@Test(expected = IllegalArgumentException.class)
	public void setBalanceParamTest(int i){
		Account a = new Account();
		a.setBalance(i);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setBalanceExcTest(){
		Account a = new Account();
		a.setBalance(-100);
	}
}
