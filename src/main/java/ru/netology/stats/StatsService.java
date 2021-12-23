package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageSum(long[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public int numMaxMonthSum(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int numMinMonthSum(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int countMinMonthAvgSum(long[] sales) {
        int j = 0; // j - количество месяцев, в которых продажи были ниже среднего
       long calculateAverageSum = calculateSum(sales) / sales.length;
        for (long sale : sales) {
            if (sale < calculateAverageSum) {
                j += 1;
            }
        }
        return j;
    }

    public int countMaxMonthAvgSum(long[] sales) {
        int j = 0; // j - количество месяцев, в которых продажи были ниже среднего
        long calculateAverageSum = calculateSum(sales)/ sales.length;
        for (long sale : sales) {
            if (sale > calculateAverageSum) {
                j += 1;
            }
        }
        return j;
    }
}