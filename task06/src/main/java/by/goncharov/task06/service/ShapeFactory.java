package by.goncharov.task06.service;

import by.goncharov.task06.entities.CustomPoint;
import by.goncharov.task06.entities.CustomShape;
import by.goncharov.task06.excepton.ShapeException;

public abstract class ShapeFactory {
	public abstract CustomShape createShape (CustomPoint[] points) throws ShapeException;
}
