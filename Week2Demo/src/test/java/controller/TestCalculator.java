package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestCalculator {
	Calculator cal = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(15, cal.add(10,5));
	}
	
	@Test
	public void testSubtract() {
		assertNotEquals(0, cal.subtract(5, 7));
		assertEquals(5, cal.subtract(10, 5));
	}
	
	@Test
	public void testMuliply() {
		assertEquals(0, cal.multiply(2,0));
		assertEquals(10, cal.multiply(2,5));
		assertNotNull(cal.multiply(0,0));
	}
	
	@Test
	public void testDupeVowels() {
		assertTrue(cal.isDuplicateVowel("street"));
		assertFalse(cal.isDuplicateVowel(""));
		assertTrue(cal.isDuplicateVowel("ee"));
		assertTrue(cal.isDuplicateVowel("oo"));
		assertTrue(cal.isDuplicateVowel("ahhfgaerguoeryuvhgoeirvuboeyivgruyvgboqeryubvoeyifbvoyiergvoyrhgiorhugioerhugoolaisduhvoiuhvoieruvoieyruiuvhoeruivhuihbiu"));
		assertFalse(cal.isDuplicateVowel("tt"));
		assertTrue(cal.isDuplicateVowel("oooo"));
		assertFalse(cal.isDuplicateVowel(null));
	}

}
