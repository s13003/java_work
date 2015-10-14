package j1.lesson03;

import java.util.Scanner;

class TriangleArea{

  static double Triangle(double a, double b, double c){
    double[] Side;
    double S = (a + b + c) / 2;
    double menseki = Math.sqrt(S * (S - a) * (S - b) * (S - c));
    return menseki;
  }

  public static void main(String...args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("辺aの長さ:");
    double side_a = stdIn.nextDouble();
    System.out.print("辺bの長さ:");
    double side_b = stdIn.nextDouble();
    System.out.print("辺cの長さ:");
    double side_c = stdIn.nextDouble();

    System.out.println(Triangle(side_a, side_b, side_c)); 
  }
}
