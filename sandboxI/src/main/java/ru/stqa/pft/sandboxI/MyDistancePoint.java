package ru.stqa.pft.sandboxI;

/**
 * Created by Kseniya.Isakova on 22.05.2016.
 */

public class MyDistancePoint {

  public static void main(String[] args) {

    Point p1 = new Point();

     p1.x = 3.1;
     p1.y = -0.2;

    Point p2 = new Point();

     p2.x = 0.7;
     p2.y = -4.9;

    System.out.println("Расстояние между точками с координатами " + "(" + p1.x + ";" + p1.y + ") " + "и " + "(" + p2.x + ";" + p2.y + ") " + "равно " + distance(p1, p2));

  }

  public static double distance(Point p1, Point p2) {

    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));

  }

}
