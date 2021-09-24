package by.goncharov.task05.controller.command;

import by.goncharov.task05.dao.exception.DAOException;
import java.io.IOException;
import java.util.List;

public interface Command {
    String execute(List<String> list) throws InterruptedException, IOException, DAOException;
}
