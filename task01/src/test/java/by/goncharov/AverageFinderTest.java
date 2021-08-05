package by.goncharov;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

import by.goncharov.task01.service.AverageFinder;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AverageFinderTest {
    private AverageFinder averageFinder = new AverageFinder();

    @Test(description = "Positive scenary of the find average",
    dataProvider = "input_a_b")
    public void testAverage(double average[], double b){
        double actual = averageFinder.findAverage(average[0], average[1]);

    }



}