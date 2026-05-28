package com.example.demo.conf;

import com.example.demo.service.ArithService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RequiredArgsConstructor
public class ArithTest {
    private final ArithService arithservice;

    //ADD
    @Test
    void addTwoPositiveNumber(){
        assertEquals(8, arithservice.add(3,5));
    }

    @Test
    void addWithZero() {
        assertEquals(5, arithservice.add(5, 0));
    }

    @Test
    void addWithTwoZeros() {
        assertEquals(0, arithservice.add(0, 0));
    }

    @Test
    void addNegativeNuber() {
        assertThrows(
                IllegalArgumentException.class,
                () -> arithservice.add(-5, 3)
        );
    }

    @Test
    void shouldThrowExceptionWhenAddingNegativeNumber() {
        assertThrows(
                IllegalArgumentException.class,
                () -> arithservice.add(-5, 3)
        );
    }

    //SUBSTRACT
    @Test
    void subtractTwoPositiveNumbers() {
        assertEquals(5, arithservice.substract(10, 5));
    }

    @Test
    void shouldReturnZeroWhenNumbersAreEqual() {
        assertEquals(0, arithservice.substract(5, 5));
    }

    //multiply
    @Test
    void multiplyTwoPrince() {
        assertThrows(
                IllegalArgumentException.class,
                () -> arithservice.substract(3, 5)
        );
    }

    @Test
    void shouldThrowExceptionWhenSubtractingNegativeNumber() {
        assertThrows(
                IllegalArgumentException.class,
                () -> arithservice.substract(-3, 5)
        );
    }

    @Test
    void shouldMultiplyTwoPositiveNumbers() {
        assertEquals(20, arithservice.multiply(4, 5));
    }

    @Test
    void shouldMultiplyByZero() {
        assertEquals(0, arithservice.multiply(5, 0));
    }

    @Test
    void shouldThrowExceptionWhenMultiplyingNegativeNumber() {
        assertThrows(
                IllegalArgumentException.class,
                () -> arithservice.multiply(-4, 5)
        );
    }


}
