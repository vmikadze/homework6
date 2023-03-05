package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        long maximumSale = sales[0];

        for (int i=0; i <sales.length; i++) {
            if (sales[i] >= maximumSale) {
                monthMaximum = i;
                maximumSale = sales[i];
            }
        }

        return monthMaximum + 1;
    }
    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        long minimumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                monthMinimum = i;
                minimumSale = sales[i];
            }

        }
        return monthMinimum + 1;

    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
