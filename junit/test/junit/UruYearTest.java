package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class UruYearTest {

	@Test
	public void isLeapYearTest4() { // 4�Ŋ���؂��N�͂��邤�N
//		// ���Ғl
//		boolean expected = true;

		UruYear uruYear = new UruYear();

		// �e�X�g���郁�\�b�h
		boolean actual = uruYear.isLeapYear(8);

		// ���Ғl�Ǝ����l�̔�r
//		assertThat(actual, is(expected));
		assertTrue(actual);
	}

	@Test
	public void isLeapYearTest100() { // 100�Ŋ���؂��N�͂��邤�N����Ȃ�
//		// ���Ғl
//		boolean expected = false;

		UruYear uruYear = new UruYear();

		// �e�X�g���郁�\�b�h
		boolean actual = uruYear.isLeapYear(200);

		// ���Ғl�Ǝ����l�̔�r
//		assertThat(actual, is(expected));
		assertFalse(actual);
	}
	
	@Test
	public void isLeapYear400(){		//400�Ŋ���؂��N�͂��邤�N
		boolean expected = true;
		UruYear uruYear = new UruYear();
		boolean actual = uruYear.isLeapYear(800);
		
		assertThat(actual, is(expected));
	}


}
