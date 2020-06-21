package com.bridgelabz.maxvalue;

/**
 * @Author : Amrut
 */
public class MaximumValue {
    /**
     * Use Generic method
     * @param firstValue
     * @param secondValue
     * @param thirdValue
     * @return : maximum value
     * determine the largest of three comparable objects
     */
    public static <T extends Comparable > T testMaximum(T firstValue, T secondValue, T thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }
}