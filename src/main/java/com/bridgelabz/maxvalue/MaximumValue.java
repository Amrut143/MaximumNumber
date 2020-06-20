package com.bridgelabz.maxvalue;

/**
 * @Author : Amrut
 */
public class MaximumValue {
    /**
     *
     * @param firstValue : Integer
     * @param secondValue : Integer
     * @param thirdValue : Integer
     * @return : maximum integer value
     */
    public int testMaximum(Integer firstValue, Integer secondValue, Integer thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }

    /**
     *
     * @param firstValue : Float
     * @param secondValue : Float
     * @param thirdValue : Float
     * @return : maximum float value
     */
    public float testMaximum(Float firstValue, Float secondValue, Float thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        else
            return thirdValue;
}