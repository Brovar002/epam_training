package by.goncharov.controller.command;

import by.goncharov.reporter.ReporterArray;
import by.goncharov.service.ServiceFactory;
import by.goncharov.service.SortService;

public class InsertionSortCommand implements Command{
    @Override
    public String execute(String request) {
        String response = null;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SortService sortService = serviceFactory.getSortService();
        ReporterArray reporterArray = new ReporterArray();
        int[] array = reporterArray.enteringArray();
        sortService.insertionSort(array);
        reporterArray.outputArray(array);

        return response;
    }
}
