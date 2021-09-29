package by.goncharov.task06.repository.impl;

import by.goncharov.task06.action.CubeAction;
import by.goncharov.task06.entities.Cube;
import by.goncharov.task06.entities.CustomShape;
import by.goncharov.task06.repository.Specification;

public class IsNotDissectionSpecification implements Specification {
	private final CubeAction cubeAction;

	public IsNotDissectionSpecification() {
		cubeAction = new CubeAction();
	}

	@Override
	public boolean specify(CustomShape shape) {
		double dessectionXY = cubeAction.dissectionXY((Cube) shape);
		double dessectionYZ = cubeAction.dissectionYZ((Cube) shape);
		return  ((dessectionXY + dessectionYZ) == 0);
	}
}
