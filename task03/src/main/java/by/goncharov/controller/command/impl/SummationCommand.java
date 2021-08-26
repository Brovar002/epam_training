package by.goncharov.controller.command.impl;

import by.goncharov.beans.Matrix;
import by.goncharov.controller.command.Command;
import by.goncharov.exeptions.MatrixException;
import by.goncharov.reporter.ReporterMatrix;
import by.goncharov.service.matrix.MatrixService;
import by.goncharov.service.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SummationCommand implements Command {
    @Override
    public String execute(String request) throws MatrixException {
        Logger logger = LogManager.getLogger(SummationCommand.class);
        String response = null;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MatrixService matrixService = serviceFactory.getMatrixService();
        ReporterMatrix reporterMatrix = new ReporterMatrix();
        Matrix firstMatrix = reporterMatrix.enteringMatrix();
        Matrix secondMatrix = reporterMatrix.enteringMatrix();
        logger.info("Matrix's summation start. ");
        Matrix result = matrixService.summation(firstMatrix, secondMatrix);
        reporterMatrix.outputMatrix(result);
        logger.info("Matrix's summation end. ");
        return response;
    }
}
