package ru.netology.statistic;

public class StatService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */

    public long findMax(long[] incomes) {
        int[] mas = new int [7];
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }
}
