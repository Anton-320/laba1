package demo.parallel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

  @org.junit.jupiter.api.Test
  public void minusTest() {
    Complex a = new Complex(3,3);
    Complex b = new Complex(1,2);
    a.minus(b);
    assertEquals(a.getRe(), 2);
    assertEquals(a.getIm(), 1);
  }
}
