package com.bridgelabz.maxvalue;

/**
 * @Author : Amrut
 */
public class MaximumValue {
    /**
     *
     * @param firstValue
     * @param secondValue
     * @param thirdValue
     * @return
     */
    public Integer testMaximum(Integer firstValue, Integer secondValue, Integer thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }
}