package ru.netology.stats;

public class StatsService {
    public int salesMonthSum(int[] sales) {
        int sumSales = 0; // сумма продаж

        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sales[i] + sumSales);
        }
        return sumSales;
    }

    public int salesMonthAverageSum(int[] sales) {
        int sumSales = 0; // сумма продаж
        int month = 0; // месяц
        int sumSalesAverage = 0; // средняя сумма продаж
        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sales[i] + sumSales);
            month = i + 1;
        }
        sumSalesAverage = sumSales / month;
        return sumSalesAverage;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numberMonthsBelowAverage(int[] sales) { //количество месяцев, в которых продажи были ниже среднего
        int sumSales = 0; // сумма продаж
        int month = 0; // месяц
        int sumSalesAverage = 0; // средняя сумма продаж
        int sumMonth = 0; // счётчик месяцев
        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sales[i] + sumSales);
            month = i + 1;
        }
        sumSalesAverage = sumSales / month;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sumSalesAverage) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

    public int numberMonthsAboveAverage(int[] sales) { //количество месяцев, в которых продажи были выше среднего
        int sumSales = 0; // сумма продаж
        int month = 0; // месяц
        int sumSalesAverage = 0; // средняя сумма продаж
        int sumMonth = 0; // счетчик месяцев
        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sales[i] + sumSales);
            month = i + 1;
        }
        sumSalesAverage = sumSales / month;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sumSalesAverage) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }
}


