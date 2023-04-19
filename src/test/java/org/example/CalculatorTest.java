package org.example;

import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @QaseTitle("Add with positive number")

    public void add_withPositiveNumber_shouldReturnPositiveInterger(){
        // Given
        Calculator calculator = new Calculator();
        int x = 3;
        int y = 7;

        // When
        int sum = calculator.add(x, y);

        // Then
        assertEquals(10, sum);
    }

    @Test
    public void subtract_withNegativeNumber_shouldReturnNegativeInteger(){
        // Given
        Calculator calculator = new Calculator();
        int x = 7;
        int y = 3;

        // When
        int sum = calculator.subtract(x, y);

        //Then
        assertEquals(4, sum);


    }

    @Test
    public void multiply_withPositiveNumber_ShouldReturnPosetiveInterger(){
        //Given
        Calculator calculator = new Calculator();
        int x = 7;
        int y = 3;

        //When
        int sum = calculator.multiply(x,y);

        //Then
        assertEquals(21, sum);
    }

    @Test
    public void divide_withPosetiveNumber_shouldReturnPosetiveInterger(){
        //Given
        Calculator calculator = new Calculator();
        int x = 4;
        int y = 2;

        //When
        int sum = calculator.divide (x, y);

        //Then
        assertEquals(2, sum);
    }


}
