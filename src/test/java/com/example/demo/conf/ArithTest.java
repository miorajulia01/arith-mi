package com.example.demo.conf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.demo.service.ArithService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ArithTest {

  @InjectMocks private ArithService arithservice;

  // ADD
  @Test
  void addTwoPositiveNumber() {
    assertEquals(8L, arithservice.add(3L, 5L));
  }

  @Test
  void addWithZero() {
    assertEquals(5L, arithservice.add(5L, 0L));
  }

  @Test
  void addWithTwoZeros() {
    assertEquals(0L, arithservice.add(0L, 0L));
  }

  @Test
  void addNegativeNuber() {
    assertThrows(IllegalArgumentException.class, () -> arithservice.add(-5L, 3L));
  }

  @Test
  void shouldThrowExceptionWhenAddingNegativeNumber() {
    assertThrows(IllegalArgumentException.class, () -> arithservice.add(-5L, 3L));
  }

  // SUBSTRACT
  @Test
  void subtractTwoPositiveNumbers() {
    assertEquals(5L, arithservice.substract(10L, 5L));
  }

  @Test
  void substractSameNumber() {
    assertEquals(0L, arithservice.substract(5L, 5L));
  }

  @Test
  void substractAsc() {
    assertThrows(IllegalArgumentException.class, () -> arithservice.substract(3L, 5L));
  }

  @Test
  void multiplyWithNegative() {
    assertThrows(IllegalArgumentException.class, () -> arithservice.substract(-3L, 5L));
  }

  @Test
  void multiplyWithPositive() {
    assertEquals(20, arithservice.multiply(4, 5));
  }

  @Test
  void multiplyWithZero() {
    assertEquals(0, arithservice.multiply(5, 0));
  }

  // Divide
  @Test
  void divideTwoPositiveNumber() {
    assertEquals(5.0, arithservice.divide(10, 2));
  }

  @Test
  void divideWithZero() {
    assertThrows(IllegalArgumentException.class, () -> arithservice.divide(5L, 0L));
  }

  @Test
  void divideWithNegative() {
    assertThrows(IllegalArgumentException.class, () -> arithservice.divide(-10L, 2L));
  }
}
