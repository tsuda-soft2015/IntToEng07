package pairPrograming;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test1() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual, is(expected));
	}
	@Test
	public void test21() {
		IntToEng ite = new IntToEng();
		String expected = "twenty one";
		String actual = ite.translateEng(21);
		assertThat(actual, is(expected));
	}
	@Test
	public void test598() {
		IntToEng ite = new IntToEng();
		String expected = "five hundred and ninety eight";
		String actual = ite.translateEng(598);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void test100() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
	}
	@Test
	public void test310() {
		IntToEng ite = new IntToEng();
		String expected = "three hundred and ten";
		String actual = ite.translateEng(310);
		assertThat(actual, is(expected));
	}
	@Test
	public void test1234() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand two hundred and thirty four";
		String actual = ite.translateEng(1234);
		assertThat(actual, is(expected));
	}
	@Test
	public void test1001() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand one";
		String actual = ite.translateEng(1001);
		assertThat(actual, is(expected));
	}
	@Test
	public void test12340() {
		IntToEng ite = new IntToEng();
		String expected = "twelve thousand three hundred and forty";
		String actual = ite.translateEng(12340);
		assertThat(actual, is(expected));
	}
	@Test
	public void test10010() {
		IntToEng ite = new IntToEng();
		String expected = "ten thousand ten";
		String actual = ite.translateEng(10010);
		assertThat(actual, is(expected));
	}
	@Test
	public void test12340203() {
		IntToEng ite = new IntToEng();
		String expected = "twelve million three hundred and forty thousand two hundred and three";
		String actual = ite.translateEng(12340203);
		assertThat(actual, is(expected));
	}
	@Test
	public void test10010101() {
		IntToEng ite = new IntToEng();
		String expected = "one million one thousand ten";
		String actual = ite.translateEng(1001010);
		assertThat(actual, is(expected));
	}
	@Test
	public void test2012340203() {
		IntToEng ite = new IntToEng();
		String expected = "two billion twelve million three hundred and forty thousand two hundred and three";
		String actual = ite.translateEng(2012340203);
		assertThat(actual, is(expected));
	}

}