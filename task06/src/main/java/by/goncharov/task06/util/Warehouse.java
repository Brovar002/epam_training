package by.goncharov.task06.util;

import java.util.HashMap;
import java.util.Map;

import by.goncharov.task06.entities.ShapeValues;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Warehouse {
	public static final Logger log = LogManager.getLogger();
	private static final Warehouse warehouse = new Warehouse();
	private Map<Long, ShapeValues> shapesValues = new HashMap<>();
	
	private Warehouse() {
	}

	public static Warehouse getWarehouse() {
		return warehouse;
	}
	
	public ShapeValues putShapeValues(long id, ShapeValues shapeValues) {
		log.info( "\nValues added in warehouse, ID: " + id);
		return shapesValues.put(id, shapeValues);
	}

	public ShapeValues removeShapeValue(Long id) {
		log.info( "\nValues removed from warehouse, ID: " + id);
		return shapesValues.remove(id);
	}

	public ShapeValues getShapeValues(Long id) {
		return shapesValues.get(id);
	}
}
