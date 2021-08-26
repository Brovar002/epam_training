package by.goncharov.controller.command.impl;

import by.goncharov.controller.command.Command;
import by.goncharov.reporter.ReporterArray;
import by.goncharov.service.ServiceFactory;
import by.goncharov.service.sort.SortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShakerSortCommand implements Command {
    @Override
    public String execute(String request) {
        Logger logger = LogManager.getLogger(ShakerSortCommand.class);
        String response = null;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SortService sortService = serviceFactory.getSortService();
        ReporterArray reporterArray = new ReporterArray();
        int[] array = reporterArray.enteringArray();
        logger.info("Shaker sort start. ");
        sortService.shakerSort(array);
        reporterArray.outputArray(array);
        logger.info("Shaker sort end. ");
        return response;
    }
}
