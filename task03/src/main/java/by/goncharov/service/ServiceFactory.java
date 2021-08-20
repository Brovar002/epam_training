package by.goncharov.service;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final SortServiceImpl sortService = new SortServiceImpl();
    private ServiceFactory(){}
    public static ServiceFactory getInstance(){
        return instance;
    }
    public SortService getSortService() {
        return sortService;
    }
}
