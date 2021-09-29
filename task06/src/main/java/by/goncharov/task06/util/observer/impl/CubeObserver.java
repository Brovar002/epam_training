package by.goncharov.task06.util.observer.impl;

import by.goncharov.task06.action.CubeAction;
import by.goncharov.task06.entities.Cube;
import by.goncharov.task06.entities.ShapeValues;
import by.goncharov.task06.excepton.ShapeException;
import by.goncharov.task06.util.observer.CubeEvent;
import by.goncharov.task06.util.observer.ShapeObserver;
import by.goncharov.task06.util.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CubeObserver implements ShapeObserver {
	public static Logger log = LogManager.getLogger();

	@Override
	public void valueChanged(CubeEvent event) throws ShapeException {
		if (event == null) {
			throw new ShapeException("event is null");
		}
		Cube cube = event.getSource();
		long id = cube.getId();
		CubeAction action = new CubeAction();
		double area = action.area(cube);
		double volume = action.volume(cube);
		ShapeValues shapeValues = new ShapeValues(area, volume);
		Warehouse warehouse = Warehouse.getWarehouse();
		log.info("values cube ID:" + id + " were changed");
		warehouse.putShapeValues(id, shapeValues);
	}
}
