package by.goncharov;

import static org.testng.Assert.assertEquals;

import java.util.List;

import by.goncharov.task06.entities.Cube;
import by.goncharov.task06.entities.CustomPoint;
import by.goncharov.task06.entities.CustomShape;
import by.goncharov.task06.repository.ShapeRepository;
import by.goncharov.task06.repository.impl.*;
import by.goncharov.task06.util.IdGenerator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ShapeRepositoryTest {
	ShapeRepository repository;

	@BeforeClass
	public void beforeClass() {
		IdGenerator.reset();
		repository = ShapeRepository.getShapeRepository();
		repository.addShape(new Cube(new CustomPoint(0, 1, 0), new CustomPoint(1, 1, 1)));
		repository.addShape(new Cube(new CustomPoint(0, -3, 2), new CustomPoint(3, -3, -1)));
		repository.addShape(new Cube(new CustomPoint(21, 4, 5), new CustomPoint(17, 4, 9)));
	}
	
	@AfterClass
	public void afterClass() {
		repository = null;
	}
	
	@Test(dataProvider = "areaIntervalSpecification")
	public void areaIntervalSpecificationTest(AreaIntervalSpecification interval, List<CustomShape> expected) {
		expected.get(0).setId(1);
		List<CustomShape> actual = repository.query(interval);
		assertEquals(actual, expected);
	}
	
	@Test(dataProvider = "idSpecification")
	public void idSpecificationTest(IdSpecification idSpecification, List<CustomShape> expected) {
		expected.get(0).setId(2);
		List<CustomShape> actual = repository.query(idSpecification);
		assertEquals(actual, expected);
	}
	
	@Test(dataProvider = "isNotDissectionSpecification")
	public void isNotDissectionSpecificationTest(IsNotDissectionSpecification notDissection, List<CustomShape> expected) {
		expected.get(0).setId(1);
		expected.get(1).setId(3);
		List<CustomShape> actual = repository.query(notDissection);
		assertEquals(actual, expected);
	}
	
	@Test(dataProvider = "sideIntervalSpecification")
	public void SideIntervalSpecificationTest(SideIntervalSpecification interval, List<CustomShape> expected) {
		expected.get(0).setId(1);
		expected.get(1).setId(2);
		List<CustomShape> actual = repository.query(interval);
		assertEquals(actual, expected);
	}
	
	@Test(dataProvider = "volumeIntervalSpecification")
	public void volumeIntervalSpecificationTest(VolumeIntervalSpecification interval, List<CustomShape> expected) {
		expected.get(0).setId(1);
		expected.get(1).setId(2);
		List<CustomShape> actual = repository.query(interval);
		assertEquals(actual, expected);
	}

	@DataProvider(name = "areaIntervalSpecification")
	public Object[][] createAareaIntervalSpecification() {
		return new Object[][] { {new AreaIntervalSpecification(0, 9), 
								List.of(new Cube(new CustomPoint(0, 1, 0), new CustomPoint(1, 1, 1)))}};
	}
	
	@DataProvider(name = "idSpecification")
	public Object[][] createIdSpecification() {
		return new Object[][] { {new IdSpecification(2), 
								List.of(new Cube(new CustomPoint(0, -3, 2), new CustomPoint(3, -3, -1)))}};
	}
	
	@DataProvider(name = "isNotDissectionSpecification")
	public Object[][] createIIsNotDissectionSpecification() {
		return new Object[][] { {new IsNotDissectionSpecification(), 
								List.of(new Cube(new CustomPoint(0, 1, 0), new CustomPoint(1, 1, 1)),
										new Cube(new CustomPoint(21, 4, 5), new CustomPoint(17, 4, 9)))}};
	}
	
	@DataProvider(name = "sideIntervalSpecification")
	public Object[][] createSideIntervalSpecification() {
		return new Object[][] { {new SideIntervalSpecification(0, 3), 
								List.of(new Cube(new CustomPoint(0, 1, 0), new CustomPoint(1, 1, 1)),
										new Cube(new CustomPoint(0, -3, 2), new CustomPoint(3, -3, -1)))}};
	}
	
	@DataProvider(name = "volumeIntervalSpecification")
	public Object[][] createVolumeIntervalSpecification() {
		return new Object[][] { {new VolumeIntervalSpecification(0, 30), 
								List.of(new Cube(new CustomPoint(0, 1, 0), new CustomPoint(1, 1, 1)),
										new Cube(new CustomPoint(0, -3, 2), new CustomPoint(3, -3, -1)))}};
	}
}
