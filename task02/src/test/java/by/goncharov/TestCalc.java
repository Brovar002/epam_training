package by.goncharov;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import by.goncharov.service.SmallestNumber;
import by.goncharov.service.AverageFinder;
import by.goncharov.service.FactorialFinder;
import by.goncharov.service.FunctionFinder;
import by.goncharov.service.Doubling;
import static org.testng.Assert.assertEquals;


public class TestCalc {
    @DataProvider(name = "dataForSmallest")
    public Object[][] createCorrectData() {
        return
                new Object[][]{
                        {new double[]{2, 3}, 2},
                        {new double[]{0, 1}, 0},
                        {new double[]{0, 0}, 0},
                };
    }

    @DataProvider(name = "dataForAverage")
    public Object[][] createDataForAverage(){
        return new Object[][]{
                {new double[]{3, 5}, 4},
                {new double[]{-3, 3}, 0},
                {new double[]{0, 0}, 0},
                {new double[]{-3, -5}, -4},
                {new double[]{-300, 200}, -50},
                {new double[]{10, 0}, 5}
                };

    }

    @DataProvider(name = "dataForFactorial")
    public Object[][] createCorrectDataForFactorial() {
        return
                new Object[][]{
                        {new int[]{2}, 2},
                        {new int[]{1}, 1},
                        {new int[]{4}, 24},
                        {new int[]{3}, 6},
                        {new int[]{5}, 120},
                };
    }

    @DataProvider(name = "dataForFunction")
    public Object[][] createCorrectDataForFunction() {
        return
                new Object[][]{
                        {new double[]{0}, 9},
                        {new double[]{1}, 8},
                        {new double[]{13}, -2188},
                        {new double[]{12}, -1719},
                        {new double[]{-3}, 36},
                };
    }

    @DataProvider(name = "dataForDoubling")
    public Object[][] createDataForDoubling(){
        return new Object[][]{
                {new double[]{10, 5, 2}, 4},
                {new double[]{-3, 3}, 0},
                {new double[]{0, 0}, 0},
                {new double[]{-3, -5}, -4},
                {new double[]{-300, 200}, -50},
                {new double[]{10, 0}, 5}
        };

    }

    private final AverageFinder averageFinder = new AverageFinder();
    private final SmallestNumber smallestNumber = new SmallestNumber();
    private final FactorialFinder factorialFinder = new FactorialFinder();
    private final FunctionFinder functionFinder = new FunctionFinder();
    private final Doubling doubling = new Doubling();

    @Test(description = "Positive scenery of the find average",
                dataProvider = "dataForAverage")
    public void testAverageFinder(double ab[],  double c) {
       double actual = averageFinder.average(ab[0],ab[1]);
       double expected = c;
       assertEquals(actual, expected);
    }

    @Test(description = "Positive scenery of the find smallest number",
            dataProvider = "dataForSmallest")
    public void testSmallestNumber(double ab[],  double c) {
        double actual = smallestNumber.smallest(ab[0], ab[1]);
        double expected = c;
        assertEquals(actual, expected);
    }

    @Test(description = "Positive scenery of the find factorial",
            dataProvider = "dataForFactorial")
    public void testFactorialFinder(int[] ab, double c) {
        double actual = factorialFinder.calculateFactorial(ab[0]);
        double expected = c;
        assertEquals(actual, expected);
    }

    @Test(description = "Positive scenery of the find function",
            dataProvider = "dataForFunction")
    public void testFunctionFinder(double[] ab, double c) {
        double actual = functionFinder.function(ab[0]);
        double expected = c;
        assertEquals(actual, expected);
    }

    @Test(description = "Positive scenery of the find doubling",
            dataProvider = "dataForDoubling")
    public void testDoubling(double[] ab, double c) {
        double actual = functionFinder.function(ab[0]);
        double expected = c;
        assertEquals(actual, expected);
    }
}



