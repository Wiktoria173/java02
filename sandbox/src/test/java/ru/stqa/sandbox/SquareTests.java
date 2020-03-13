package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test // jest to oznaczenie, że metoda jest testem
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0); // używamy ==, bo porównujemy dwie wielkości
  }
}
