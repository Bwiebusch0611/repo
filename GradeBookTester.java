import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook g1, g2;

	@BeforeEach
	void setUp() throws Exception {
		
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(99);
		g1.addScore(77);
		g1.addScore(86);
		g1.addScore(98);
		g1.addScore(33);
		
		
		g2.addScore(96);
		g2.addScore(75);
		g2.addScore(50);
		g2.addScore(92);
		g2.addScore(88);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals(" 99.0 77.0 86.0 98.0 33.0 "));
		assertTrue(g2.toString().equals(" 96.0 75.0 50.0 92.0 88.0 "));
		
	}

	@Test
	void testSum() {
		assertEquals(393, g1.sum(), .0001);
		assertEquals(401, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(33, g1.minimum(), .0001);
		assertEquals(50, g2.minimum(), .0001);
	}

	@Test
	void testFinalScore() {
		assertEquals(360, g1.finalScore(), .001);
		assertEquals(351, g2.finalScore(), .001);
	}


}
