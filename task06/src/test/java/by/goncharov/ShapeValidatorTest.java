package by.goncharov;

import static org.testng.Assert.assertTrue;

import by.goncharov.task06.entities.CustomPoint;
import by.goncharov.task06.util.validator.CubeValidator;
import by.goncharov.task06.util.validator.DataValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ShapeValidatorTest {

	@Test(dataProvider = "data_row")
	public void  isCorrectRowTest(String row) {		
		boolean value = DataValidator.isCorrectRow(row);
		assertTrue(value);
	}
	
	@Test(dataProvider = "data_cube")
	public void  isCubeTest(CustomPoint pointA, CustomPoint pointB) {
		boolean value = CubeValidator.isCube(pointA, pointB);
		assertTrue(value);
	}
	
	@DataProvider(name = "data_row")
	public Object[][] createRows() {
		return (Object[][]) new Object[] { "-0.5 0.0 6.77 -66.0 5.0",
							"-43 -21 -43 -54 76" };
	}
	
	@DataProvider(name = "data_cube")
	public Object[][] createCubes() {
		return new Object[][] { {new CustomPoint(0.0, 1.0, 0.0), new CustomPoint(1.0, 1.0, 1.0)},
								{new CustomPoint(-1.0, 3.0, 0.0), new CustomPoint(2.0, 3.0, 3.0)} };
	}
}
