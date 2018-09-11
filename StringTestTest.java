import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTestTest {

	@Test
	void test1() {
		StringTest t=new StringTest();
		String str1=t.numbers("I have four apples.");
		String str2="I have 4 apples.";
		assertEquals(str1, str2);
	}
	@Test
	void test2() {
		StringTest t2=new StringTest();
		String str3=t2.space("I have four apples");
		String str4="Ihavefourapples";
		assertEquals(str3, str4);
	}
	

}
