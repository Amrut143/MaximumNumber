package com.bridgelabz.maxvalue;

/**
 * @Author : Amrut
 * Creating Generic Class
 */
public class MaximumValue<T extends Comparable<T>> {
    T firstValue, secondValue, thirdValue;

    /**
     * Defining parameterized constructor
     * @param firstValue
     * @param secondValue
     * @param thirdValue
     */
    public MaximumValue(T firstValue, T secondValue, T thirdValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    /*Define testMaximum method to call the static testMaximum method*/
    public T testMaximum(){
        return MaximumValue.testMaximum(firstValue, secondValue, thirdValue);
    }
    /**
     * Use Generic method
     * @param firstValue
     * @param secondValue
     * @param thirdValue
     * @return : maximum value
     * determine the largest of three comparable objects
     */
    public static <T extends Comparable > T testMaximum(T firstValue, T secondValue, T thirdValue) {
        T max =  firstValue;
        if (secondValue.compareTo(max)>0)
            max = secondValue;
        else if (thirdValue.compareTo(max)>0)
            max=thirdValue ;
        return max;
    }
}