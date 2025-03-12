package edu.ceu.programming.practices;
import java.util.stream.IntStream;

public class Practice3{
   public static double monteC (int steps) {
      long pointsInside = IntStream.rangeClosed(1, steps)
                                  .filter (n -> {
                                       double x = Math.random();
                                       double y = Math.random();
                                          return x*x + y*y <= 1;
                                   }).count();

      return 4.0*pointsInside/steps;
   }
}