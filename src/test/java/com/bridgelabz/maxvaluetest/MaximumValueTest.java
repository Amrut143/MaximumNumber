package com.bridgelabz.maxvaluetest;

import com.bridgelabz.maxvalue.MaximumValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumValueTest {
    MaximumValue maximumValue;
    @Before
    public void createObjectOf_MaximumValue(){

        maximumValue = new MaximumValue();
    }

    @Test
    public void givenMaxIntegerNumber_AtFirstPosition_ShouldReturnSameNumber(){
        Integer maximum = maximumValue.testMaximum(78, 52, 43);
        Assert.assertEquals((Integer) 78, maximum);
    }

    @Test
    public void givenMaxIntegerNumber_AtSecondPosition_ShouldReturnSameNumber(){
        Integer maximum = maximumValue.testMaximum(78, 82, 43);
        Assert.assertEquals((Integer) 82, maximum);
    }

    @Test
    public void givenMaxIntegerNumber_AtThirdPosition_ShouldReturnSameNumber(){
        Integer maximum = maximumValue.testMaximum(78, 52, 89);
        Assert.assertEquals((Integer) 89, maximum);
    }

    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber(){
        Float maximum = maximumValue.testMaximum(7.8f, 5.2f, 4.3f);
        Assert.assertEquals((Float) 7.8f, maximum);
    }
}
