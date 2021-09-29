package by.goncharov.task06.service;

import by.goncharov.task06.entities.Cube;
import by.goncharov.task06.entities.CustomPoint;
import by.goncharov.task06.entities.CustomShape;
import by.goncharov.task06.excepton.ShapeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CubeFactory extends ShapeFactory {
	public static Logger log = LogManager.getLogger();

	@Override
	public CustomShape createShape(CustomPoint[] points) throws ShapeException {
		if (points == null) {
			log.error("data not available");
			throw new ShapeException("data not available");
		}
		Cube cube = new Cube(points);
		log.info("cube created: " + cube.toString());
		return cube;
	}
}
