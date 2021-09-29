package by.goncharov.task07.entities;

import java.util.List;

public interface ComponentText {
	TypeComponent getType();
	
	List<ComponentText> getComponents();
	
	int countSymbol();
}
