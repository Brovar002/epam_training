package by.goncharov.task03.controller.command.impl;

import by.goncharov.task03.beans.Array;
import by.goncharov.task03.controller.command.Command;
import by.goncharov.task03.reporter.ReporterArray;
import by.goncharov.task03.service.ServiceFactory;
import by.goncharov.task03.service.sort.SortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShellSortCommand implements Command {
    @Override
    public String execute(String request) {
        Logger logger = LogManager.getLogger(ShellSortCommand.class);
        String response = null;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SortService sortService = serviceFactory.getSortService();
        ReporterArray reporterArray = new ReporterArray();
        Array array = reporterArray.enteringArray();
        logger.info("Shell sort start. ");
        sortService.shellSort(array);
        reporterArray.outputArray(array);
        logger.info("Shell sort end. ");
        return response;
    }
}
