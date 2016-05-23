package ru.stqa.pft.sandboxI;

/**
 * Created by Kseniya.Isakova on 22.05.2016.
 */
public class Point {

  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Получить координату х
   * @return значение координаты
   */
  public double getX() {

    return this.x;
  }

  public double getY() {

    return this.y;
  }

  public double distance(Point p2) {

    return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));

  }

}
