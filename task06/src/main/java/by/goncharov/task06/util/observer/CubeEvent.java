package by.goncharov.task06.util.observer;

import java.util.EventObject;

import by.goncharov.task06.entities.Cube;

public class CubeEvent extends EventObject {
	private static final long serialVersionUID = 1L;

	public CubeEvent(Cube source) {
		super(source);
	}
	
	@Override
	public Cube getSource() {
		return (Cube) super.getSource();
	}
}
