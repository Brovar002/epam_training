package by.goncharov.task04.service;

import by.goncharov.task04.beans.Car;
import by.goncharov.task04.beans.Engine;
import by.goncharov.task04.beans.Wheel;
import by.goncharov.task04.dao.CarDao;
import by.goncharov.task04.dao.exception.DaoException;
import by.goncharov.task04.service.exception.ServiceException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CarService {
    private CarDao carDao = new CarDao();
    private static final Logger logger = Logger.getLogger( CarService.class.getName() );

    public List<Car> readCar() throws ServiceException {
        try {

            String data = carDao.readCar();
            List<Car> listCar = new ArrayList<>();
            String[] list = data.split("\n");
            for (int i = 0; i < list.length; i++) {
                String[] word = list[i].split(" ");
                Engine engine = new Engine();
                engine.setNumber(Integer.parseInt(word[3]));
                engine.setPower(Double.parseDouble(word[4]));
                Wheel wheel = new Wheel(word[5],
                        Double.parseDouble(word[6]),
                        Wheel.Type.valueOf(word[7].trim()));
                Car car = new Car(word[0], Double.parseDouble(word[1]),  engine, wheel, Double.parseDouble(word[2]));

                listCar.add(car);
            }
            return listCar;
        } catch (DaoException e) {
            throw new ServiceException("Car don't exist");

        }

    }
}
