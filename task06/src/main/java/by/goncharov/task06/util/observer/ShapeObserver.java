package by.goncharov.task06.util.observer;


import by.goncharov.task06.excepton.ShapeException;

public interface ShapeObserver {
	void valueChanged(CubeEvent event) throws ShapeException;
}
