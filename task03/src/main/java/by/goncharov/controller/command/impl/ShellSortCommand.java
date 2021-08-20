package by.goncharov.controller.command.impl;

import by.goncharov.controller.command.Command;
import by.goncharov.reporter.ReporterArray;
import by.goncharov.runner.Main;
import by.goncharov.service.ServiceFactory;
import by.goncharov.service.SortService;
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
        int[] array = reporterArray.enteringArray();
        logger.info("Shell sort start. ");
        sortService.shellSort(array);
        logger.info("Shell sort end. ");
        reporterArray.outputArray(array);

        return response;
    }
}
