package by.goncharov.task06.repository.impl;


import by.goncharov.task06.action.CubeAction;
import by.goncharov.task06.entities.Cube;
import by.goncharov.task06.entities.CustomShape;
import by.goncharov.task06.repository.Specification;

public class VolumeIntervalSpecification implements Specification {
	private final double minVolume;
	private final double maxVolume;
	private final CubeAction cubeAction;

	public VolumeIntervalSpecification(double minVolume, double maxVolume) {
		this.minVolume = minVolume;
		this.maxVolume = maxVolume;
		cubeAction = new CubeAction();
	}

	@Override
	public boolean specify(CustomShape shape) {
		double volume = cubeAction.volume((Cube) shape);
		return  (volume >= minVolume && volume <= maxVolume);
	}
}
