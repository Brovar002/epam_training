package by.goncharov.task04.dao;

import java.io.FileReader;

public class CarDao {
    public  String readCar() throws DaoException {
        try {
            return FileReader.read("car.txt");
        }catch ( FileReaderException e){
            throw new DaoException("Can't read car's file");

        }

    }
}

