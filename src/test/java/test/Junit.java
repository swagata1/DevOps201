package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import program.IntWord;

public class Junit {
	@Test
	public void InttoWords() {
		IntWord tester=new IntWord();
		assertEquals("zero",tester.convert(0));
	}
	@Test
	public void InttoWords1() {
		IntWord tester1=new IntWord();
		assertEquals(" eighteen",tester1.convertLessThanOneThousand(18));
	}

}



