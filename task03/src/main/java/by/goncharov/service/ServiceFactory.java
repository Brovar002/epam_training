package by.goncharov.service;

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
