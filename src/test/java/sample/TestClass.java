package sample;

import org.junit.Test;

import junit.framework.Assert;


public class TestClass {
	@Test
	public void testPalindrome() {
		Main main = new Main();
		StringBuilder builder = new StringBuilder("Madum");
		StringBuilder builderFalse = new StringBuilder("Mithun");
		Assert.assertTrue(main.isPalindrome(builder));
		Assert.assertFalse(main.isPalindrome(builderFalse));
		
	}

}
