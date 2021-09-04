package by.goncharov.task03.service;

import by.goncharov.task03.service.matrix.MatrixService;
import by.goncharov.task03.service.matrix.MatrixServiceImpl;
import by.goncharov.task03.service.sort.SortService;
import by.goncharov.task03.service.sort.SortServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final SortServiceImpl sortService = new SortServiceImpl();
    private final MatrixServiceImpl matrixService = new MatrixServiceImpl();
    private ServiceFactory(){}
    public static ServiceFactory getInstance(){
        return instance;
    }
    public SortService getSortService() {
        return sortService;
    }
    public MatrixService getMatrixService() {
        return matrixService;
    }
}
