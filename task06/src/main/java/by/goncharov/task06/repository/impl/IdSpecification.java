package by.goncharov.task06.repository.impl;

import by.goncharov.task06.entities.CustomShape;
import by.goncharov.task06.repository.Specification;

public class IdSpecification implements Specification {
	private long id;

	public IdSpecification(long id) {
		this.id = id;
	}

	@Override
	public boolean specify(CustomShape shape) {
		boolean result = (shape.getId() == id);
		return result;
	}
	
}
