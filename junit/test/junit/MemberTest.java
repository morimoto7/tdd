package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;

import org.junit.Test;

public class MemberTest {

	@Test
	public void getMemberTest(){
		String[] members = {"guru", "ton", "utu", "kone"};
		Member member = new Member();
		member.addMember(0, "guru");
		member.addMember(1, "ton");
		member.addMember(2, "utu");
		member.addMember(3, "kone");
		
		String[] actual = member.getMembers();
		
		System.out.println("members = " + members[0] + ", " + members[1] + ", " + members[2] + ", " + members[3]);
//		assertArrayEquals(actual, members);
		assertThat(Arrays.asList(actual), hasItem(containsString("kone")));
	}
}
