package com.bridgelabz.maxvalue;

import java.util.Arrays;

/**
 * @Author : Amrut
 * Creating Generic Class
 */
public class MaximumValue<T extends Comparable<T>> {
    T[] values;

    /**
     * Defining parameterized constructor
     * @param values
     */
    public MaximumValue(T[] values){
        this.values = values;
    }

    /*Define testMaximum method to call the static testMaximum method*/
    public T testMaximum(){
        return MaximumValue.testMaximum(values);
    }

    /**
     * Use generic method
     * @param values
     * @param <T>
     * @return
     */
    public static <T extends Comparable > T testMaximum(T[] values) {
        Arrays.sort(values);
        T max = values[0];
        for (T value : values){
            if (value.compareTo(max) > 0)
                max = value;
        }
        return max;
    }
}