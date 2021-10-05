package by.goncharov;

import static org.testng.Assert.assertEquals;

import by.goncharov.task07.exception.TextException;
import by.goncharov.task07.util.reader.TextFileReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TextFileReaderTest {
	TextFileReader reader;
	public static final String TEST_FILE = "src/main/resources/text_test.txt";
	
	@BeforeClass
	public void setUp() {
		reader = new TextFileReader();
	}
	
	@AfterClass
	public void tearDown() {
		reader = null;
	}
	
	@Test 
	public void testReadFromFile() throws TextException {
		String expected = "It has survived - not only (five) centuries, but also" +
				" the leap into 13<<2 electronictypesetting, remaining 30>>>3 " +
				"essentially ~6&9|(3&4) unchanged. It was popularisedin the " +
				"5|(1&2&(3|(4&(25^5|6&47)|3)|2)|1) with the release of Letraset sheets " +
				"containingLorem Ipsum passages, and more recently with desktop publishing" +
				" software like AldusPageMaker including versions of Lorem Ipsum.It is a " +
				"(8^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will " +
				"be of apage when looking at its layout.";
		String actual = reader.readFromFile(TEST_FILE);
		assertEquals(actual, expected);
	}
}
