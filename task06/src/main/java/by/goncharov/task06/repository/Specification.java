package by.goncharov.task06.repository;

import by.goncharov.task06.entities.CustomShape;

public interface Specification {
	boolean specify(CustomShape shape);
}
