package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class UruYearTest {

	@Test
	public void isLeapYearTest4() { // 4で割り切れる年はうるう年
//		// 期待値
//		boolean expected = true;

		UruYear uruYear = new UruYear();

		// テストするメソッド
		boolean actual = uruYear.isLeapYear(8);

		// 期待値と実測値の比較
//		assertThat(actual, is(expected));
		assertTrue(actual);
	}

	@Test
	public void isLeapYearTest100() { // 100で割り切れる年はうるう年じゃない
//		// 期待値
//		boolean expected = false;

		UruYear uruYear = new UruYear();

		// テストするメソッド
		boolean actual = uruYear.isLeapYear(200);

		// 期待値と実測値の比較
//		assertThat(actual, is(expected));
		assertFalse(actual);
	}
	
	@Test
	public void isLeapYear400(){		//400で割り切れる年はうるう年
		boolean expected = true;
		UruYear uruYear = new UruYear();
		boolean actual = uruYear.isLeapYear(800);
		
		assertThat(actual, is(expected));
	}


}
