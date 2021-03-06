package by.goncharov.task04.dao;

import by.goncharov.task04.dao.exception.DaoException;
import by.goncharov.task04.service.reader.FileReader;
import by.goncharov.task04.service.reader.FileReaderException;

public class CarDao {
    public  String readCar() throws DaoException {
        try {
            return FileReader.read("car.txt");
        }catch ( FileReaderException e){
            throw new DaoException("Can't read car's file");

        }

    }
}

