package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({UruYearTest.class, AdditionTest.class, MemberTest.class})
public class AllTests {

}
