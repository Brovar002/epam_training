package by.goncharov.task05.controller.command;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.dao.ListForThreadsDAO;
import by.goncharov.task05.dao.MatrixDAO;
import by.goncharov.task05.dao.exception.DAOException;
import by.goncharov.task05.service.PutNumbersInMainDiagonal;
import by.goncharov.task05.service.creators.ThreadsCreatorImpl;
import by.goncharov.task05.view.Locale;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ThreadsCommand implements Command{
    @Override
    public String execute(List<String> list) throws InterruptedException, IOException, DAOException {
        Matrix matrix = new MatrixDAO().getMatrix();
        StringBuilder result = new StringBuilder().append(Locale.
                getInstance().getResourceBundle().getString("FIFTH")).append(
                new GetIntroduction().get(matrix)
        );
        List<Integer> listForThreads = new ListForThreadsDAO().getList();
        new PutNumbersInMainDiagonal().execute(new ThreadsCreatorImpl().create(listForThreads, matrix));
        TimeUnit.MILLISECONDS.sleep(matrix.getRows() * 50L);
        PutNumbersInMainDiagonal.reset();
        return result.append(matrix.toPureString()).toString();
    }
}
