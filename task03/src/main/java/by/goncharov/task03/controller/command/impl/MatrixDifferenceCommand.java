package by.goncharov.task03.controller.command.impl;

import by.goncharov.task03.beans.Matrix;
import by.goncharov.task03.controller.command.Command;
import by.goncharov.task03.exeptions.MatrixException;
import by.goncharov.task03.reporter.ReporterMatrix;
import by.goncharov.task03.service.matrix.MatrixService;
import by.goncharov.task03.service.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixDifferenceCommand implements Command {
    @Override
    public String execute(String request) throws MatrixException {
        Logger logger = LogManager.getLogger(MatrixDifferenceCommand.class);
        String response = null;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MatrixService matrixService = serviceFactory.getMatrixService();
        ReporterMatrix reporterMatrix = new ReporterMatrix();
        Matrix firstMatrix = reporterMatrix.enteringMatrix();
        Matrix secondMatrix = reporterMatrix.enteringMatrix();
        logger.info("Matrix's difference start. ");
        Matrix result = matrixService.difference(firstMatrix, secondMatrix);
        reporterMatrix.outputMatrix(result);
        logger.info("Matrix's difference end. ");
        return response;
    }
}
