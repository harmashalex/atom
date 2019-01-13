package ru.atom;

/**
 * In this assignment you need to implement the following util methods.
 * Note:
 *  throw new UnsupportedOperationException(); - is just a stub
 */
public class Util {



    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) throws IllegalArgumentException {
        if (values == null || values.length == 0) throw  new IllegalArgumentException("Values cannot be empty or null");

        int max = values[0];
        for (int temp : values) {
            if (temp > max)
                max = temp;
        }
        return max;
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {
        if (values == null || values.length == 0) throw  new IllegalArgumentException("Values cannot be empty or null");

        int sum = 0;
        for (int temp: values) {
            sum += temp;
        }
        return sum;
    }


}
