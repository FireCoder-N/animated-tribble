package gr.upatras.exercise1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubTest {

	@Test
	void testMySub() {
		Sub sub = new Sub();
		assertEquals("POSITIVE", sub.mySub(10, 7), "10 - 7 = 3 must be POSITIVE");
		assertEquals("NEGATIVE", sub.mySub(10, 52), "10 - 52 = -42 must be NEGATIVE");
	}

}
