package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        long actualSum = service.salesMonthSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void salesMonthAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        long actualSum = service.salesMonthAverageSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void monthWithMinimumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 9;
        long actualSum = service.minSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void monthWithMaximumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 8;
        long actualSum = service.maxSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void numberMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        long actualSum = service.numberMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void numberMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        long actualSum = service.numberMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }


}
