package ru.stqa.pft.sandboxI;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kseniya.Isakova on 22.05.2016.
 */
public class DistanceTests {

  @Test
  public void testDistance1() {
    Point p1 = new Point(0.0,0.0);
    Point p2 = new Point(3.0,0.0);
    Assert.assertEquals(p1.distance(p2), 3.0);
  }

  @Test
  public void testDistance2() {
    Point p1 = new Point(0.0,0.0);
    Point p2 = new Point(0.0,4.0);
    Assert.assertEquals(p1.distance(p2), 4.0);
  }

  @Test
  public void testDistance3() {
    Point p1 = new Point(3.0,0.0);
    Assert.assertEquals(p1.distance(new Point (0.0,4.0)), 5.0);
  }

}
