package by.goncharov;

import static org.testng.Assert.assertEquals;

import java.util.List;

import by.goncharov.task06.entities.Cube;
import by.goncharov.task06.entities.CustomPoint;
import by.goncharov.task06.entities.ShapeValues;
import by.goncharov.task06.util.IdGenerator;
import by.goncharov.task06.util.Warehouse;
import by.goncharov.task06.util.observer.ShapeObserver;
import by.goncharov.task06.util.observer.impl.CubeObserver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WarehouseTest {
	Warehouse warehouse;
	List<Cube> cubes;
	ShapeObserver shapeObserver;

	@BeforeClass
	public void beforeClass() {
		IdGenerator.reset();
		shapeObserver = new CubeObserver();
		cubes = List.of(new Cube(new CustomPoint(0, 1, 0), new CustomPoint(1, 1, 1)),
						new Cube(new CustomPoint(0, -3, 2), new CustomPoint(3, -3, -1)),
						new Cube(new CustomPoint(21, 4, 5), new CustomPoint(17, 4, 9)));
		(cubes.get(0)).attach(shapeObserver);
		(cubes.get(1)).attach(shapeObserver);
		(cubes.get(2)).attach(shapeObserver);
		warehouse = Warehouse.getWarehouse();
		warehouse.putShapeValues(cubes.get(0).getId(), new ShapeValues(6, 1));
		warehouse.putShapeValues(cubes.get(1).getId(), new ShapeValues(54, 27));
		warehouse.putShapeValues(cubes.get(2).getId(), new ShapeValues(96, 64));
	}
	
	@AfterClass
	public void afterClass() {
		warehouse = null;
		cubes = null;
		shapeObserver = null;
	}
	
	@Test(dataProvider = "pointsChanged")
	public void pointsChangedTest(CustomPoint pointA, CustomPoint pointB, ShapeValues expected) {
		Cube cube = cubes.get(0);	
		cube.setPointA(pointA);		
		cube.setPointB(pointB);	
		ShapeValues actual = warehouse.getShapeValues(1L);
		assertEquals(actual, expected);
	}

	@DataProvider(name = "pointsChanged")
	public Object[][] createPointsChanged() {
		return new Object[][] { {new CustomPoint(0, 2, 2),	new CustomPoint(2, 2, 2), new ShapeValues(24, 8)} };
	}
}
