package by.goncharov.task06.repository.impl;

import by.goncharov.task06.entities.Cube;
import by.goncharov.task06.entities.CustomShape;
import by.goncharov.task06.repository.Specification;

public class SideIntervalSpecification implements Specification {
	private final double minSide;
	private final double maxSide;

	public SideIntervalSpecification(double minSide, double maxSide) {
		this.minSide = minSide;
		this.maxSide = maxSide;
	}
	
	@Override
	public boolean specify(CustomShape shape) {
		double side = ((Cube) shape).getHeight();
		return  (side >= minSide && side <= maxSide);
	}
}
