package by.goncharov.task06.repository.impl;

import by.goncharov.task06.action.CubeAction;
import by.goncharov.task06.entities.Cube;
import by.goncharov.task06.entities.CustomShape;
import by.goncharov.task06.repository.Specification;

public class AreaIntervalSpecification implements Specification {
	private double minArea;
	private double maxArea;
	private CubeAction cubeAction;

	public AreaIntervalSpecification(double minArea, double maxArea) {
		this.minArea = minArea;
		this.maxArea = maxArea;
		cubeAction = new CubeAction();
	}

	@Override
	public boolean specify(CustomShape shape) {
		double area = cubeAction.area((Cube) shape);
		return  (area >= minArea && area <= maxArea);

	}
}
