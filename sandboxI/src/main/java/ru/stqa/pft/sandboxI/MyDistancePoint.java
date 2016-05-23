package ru.stqa.pft.sandboxI;

/**
 * Created by Kseniya.Isakova on 22.05.2016.
 */

public class MyDistancePoint {

  public static void main(String[] args) {

    Point p1 = new Point(3.0, 0.0);

    Point p2 = new Point(0.0, 4.0);

    System.out.println("Расстояние между точками с координатами " + "(" + p1.x + ";" + p1.y + ") " + "и " + "(" + p2.x + ";" + p2.y + ") " + "равно "  + p1.distance(p1, p2));

  }

}
