package com.bridgelabz.maxvaluetest;

import com.bridgelabz.maxvalue.MaximumValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.bridgelabz.maxvalue.MaximumValue.testMaximum;

public class MaximumValueTest {

    @Test
    public void givenMaxIntegerNumber_AtFirstPosition_ShouldReturnSameNumber(){
        Integer maximum = testMaximum(78, 52, 43);
        Assert.assertEquals((Integer) 78, maximum);
    }

    @Test
    public void givenMaxIntegerNumber_AtSecondPosition_ShouldReturnSameNumber(){
        Integer maximum = testMaximum(78, 82, 43);
        Assert.assertEquals((Integer) 82, maximum);
    }

    @Test
    public void givenMaxIntegerNumber_AtThirdPosition_ShouldReturnSameNumber(){
        Integer maximum = testMaximum(78, 52, 89);
        Assert.assertEquals((Integer) 89, maximum);
    }

    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber(){
        Float maximum = testMaximum(7.8f, 5.2f, 4.3f);
        Assert.assertEquals((Float) 7.8f, maximum);
    }

    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Float maximum = testMaximum(7.8f, 8.2f, 4.3f);
        Assert.assertEquals((Float) 8.2f, maximum);
    }

    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Float maximum = testMaximum(7.8f, 5.2f, 8.9f);
        Assert.assertEquals((Float) 8.9f, maximum);
    }

    @Test
    public void givenMaxStringValue_AtFirstPosition_ShouldReturnSameNumber() {
        String maximum = testMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenMaxStringValue_AtSecondPosition_ShouldReturnSameNumber() {
        String maximum = testMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenMaxStringValue_AtThirdPosition_ShouldReturnSameNumber() {
        String maximum = testMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenIntegerValue_ShouldReturnMaximum_UsingGenericClass(){
        Integer maximum = new MaximumValue<>(64, 72, 43 ).testMaximum();
        Assert.assertEquals((Integer) 72, maximum);
    }

    @Test
    public void givenFloatValue_ShouldReturnMaximum_UsingGenericClass(){
        Float maximum = new MaximumValue<>(6.4f, 7.2f, 8.3f ).testMaximum();
        Assert.assertEquals((Float) 8.3f, maximum);
    }

    @Test
    public void givenStringValue_ShouldReturnMaximum_UsingGenericClass(){
        String maximum = new MaximumValue<>("Peach", "Apple", "Banana" ).testMaximum();
        Assert.assertEquals("Peach", maximum);
    }
}
