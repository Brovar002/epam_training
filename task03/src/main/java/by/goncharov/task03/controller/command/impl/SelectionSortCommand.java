package by.goncharov.task03.controller.command.impl;

import by.goncharov.task03.beans.Array;
import by.goncharov.task03.controller.command.Command;
import by.goncharov.task03.reporter.ReporterArray;
import by.goncharov.task03.service.ServiceFactory;
import by.goncharov.task03.service.sort.SortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectionSortCommand implements Command {
    @Override
    public String execute(String request) {
        Logger logger = LogManager.getLogger(SelectionSortCommand.class);
        String response = null;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SortService sortService = serviceFactory.getSortService();
        ReporterArray reporterArray = new ReporterArray();
        Array array = reporterArray.enteringArray();
        logger.info("Selection sort start. ");
        sortService.selectionSort(array);
        reporterArray.outputArray(array);
        logger.info("Selection sort end. ");
        return response;
    }
}
