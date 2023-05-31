package ru.netology.stats;

public class StatsService {
    public long salesMonthSum(long[] sales) {
        long sumSales = 0; // сумма продаж
        for (int i = 0; i < sales.length; i++) {
            sumSales = (sales[i] + sumSales);
        }
        return sumSales;
    }

    public long salesMonthAverageSum(long[] sales) {

        long month = 0; // месяц
        long sumSalesAverage = 0; // средняя сумма продаж
        for (int i = 0; i < sales.length; i++) { // расчёт количество месяцев
            month = i + 1;
        }
        long sumSales = salesMonthSum(sales);
        sumSalesAverage = sumSales / month;
        return sumSalesAverage;
    }

    public long minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; // максимальный
            }
        }
        return maxMonth + 1;
    }

    public long numberMonthsBelowAverage(long[] sales) { //количество месяцев, в которых продажи были ниже среднего

        long sumSalesAverage = 0; // средняя сумма продаж
        int sumMonth = 0; // счётчик месяцев
        sumSalesAverage = salesMonthAverageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sumSalesAverage) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

    public long numberMonthsAboveAverage(long[] sales) { //количество месяцев, в которых продажи были выше среднего
        long sumSalesAverage = 0; // средняя сумма продаж
        int sumMonth = 0; // счетчик месяцев
        sumSalesAverage = salesMonthAverageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sumSalesAverage) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }
}


