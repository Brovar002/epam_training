package by.goncharov.task06.observer;

public interface Observable {
	void attach(ShapeObserver observer);
	void detach(ShapeObserver observer);
	void notifyObservers();
}
